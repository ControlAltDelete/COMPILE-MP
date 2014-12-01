grammar Pastingv2;

prog : (function)*? main;
  
main : DT 'mained' OPAR CPAR stat ;

function : datatype = DT name = ID OPAR param = varDecl (','varDecl)*? CPAR code = stat  ;

/* ***OPERATORS*** */
ASSIGN 		: '=' ;
GT 		: '>';
LT 		: '<';
BANG 		: '!';
TILDE 		: '~';
QUESTION 	: '?';
COLON 		: ':';
EQUAL 		: '==';
LE 		: '<=';
GE 		: '>=';
NOTEQUAL 	: '!=';
AND 		: '&&';
OR  		: '||';
INC  		: '++';
DEC  		: '--';
ADD  		: '+';
SUB  		: '-';
MUL  		: '*';
DIV  		: '/';
BITAND 		: '&';
BITOR  		: '|';
CARET  		: '^';
MOD 		: '%';

OPAR		: '(' ;
CPAR		: ')' ;
OBRAC           : '[' ;
CBRAC           : ']' ;
OCURL		: '{' ;
CCURL		: '}' ;
DQUOTE          : '"' ;
SC		: ';' ;

mathOperators
	: ADD
	| SUB
	| MUL
	| DIV ;

relOperators
	: EQUAL
	| GT
	| LT
	| LE
	| GE
	| AND
	| OR
	| NOTEQUAL ;
	
/* ***DATA TYPES*** */
DT
    : 'inted'     
    | 'chared'
    | 'floated'
    | 'voided'
    | 'Stringed'
    | 'doubled' ;


cons
    : INT
    | CHAR
    | STRING
    | FLOAT
    | ID ;

/* ***Declarations*** */
varDecl : data =  DT ( id = ID (OBRAC INT CBRAC)? | assignExpression)  (','(ID | assignExpression))*? ;
        //dt ID (assignExpression)? (','(ID|assignExpression))*?;

funcDecl : ID OPAR (ID (','(ID)*?)) CPAR ;

/* ***EXPRESSIONS*** */

expr : assignExpression 
     | mathExpression
     | relExpression ;

/* ***Assignment*** */
assignExpression : (varDecl | ID) ASSIGN assignVal  ;
assignVal : OCURL ((cons) (','cons)*?) CCURL
          | mathExpression
          | INT ;


mathExpression
	: left = (INT | ID) mathOperators right = ( INT | ID);

relExpression
	: (INT | ID) relOperators (INT | ID);

/* ***STAT  EMENTS*** */

stat    : (declStatement
        | exprStatement
        | compStatement
        | contStatement
        | ioStatement
        | retStatement) (stat)? ;

declStatement : varDecl SC;	
exprStatement : expr SC ;
compStatement : OCURL stat CCURL ; 
contStatement : ifStatement
     	      | loopStatement
              | switchStatement ;
              
ioStatement : printStatement
            | scanStatement ;

retStatement : 'returned' (INT | ID) SC;

/* If-Else Statement */
ifStatement 
	: 'ifed' OPAR expr CPAR cond = stat (elseStatement)? 
        | 'ifed' OPAR expr CPAR cond = stat elseIfStatement;

elseIfStatement
	: 'elseifed' OPAR expr CPAR compStatement (elseIfStatement)*? 
        | 'elseifed' OPAR expr CPAR compStatement elseStatement;
	
elseStatement
	: 'elsed' compStatement ;


/* Loop Statements */
loopStatement
	: whileStatement
	| doWhileStatement
	| forStatement ;

whileStatement
	: 'whiled' OPAR CPAR compStatement ;
	
doWhileStatement
	: 'do' compStatement 'whiled' OPAR CPAR ;
	
forStatement
	: 'fored' OPAR SC SC CPAR compStatement ;

/* Switch Statement */
switchStatement     : 'switched' OPAR ID CPAR OCURL caseStatement CCURL ;
caseStatement       : 'cased' (ID|INT) COLON stat 'breaked' SC (caseStatement)*? 
                    | 'cased' (ID|INT) COLON stat 'breaked' SC defaultStatement;
defaultStatement    : 'defaulted' COLON stat 'breaked' SC ;
                
/* IO Statements */
printStatement : 'printfed' OPAR print = (INT | ID | STRING)? CPAR SC;
scanStatement : 'scanfed' OPAR STRING ',' '&'ID CPAR SC;




















ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) -> skip
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   ('//'( ~('\n'|'\r')* '\r'? '\n' ) 
    |   '/*' ( options {greedy=false;} : . )* '' ) -> skip
    ;

STRING
 : '"' (~[\r\n"] | '""')* '"'
 ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
