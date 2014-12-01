// Generated from /home/alex/Documents/COMPILE/Pastingv2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pastingv2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, ASSIGN=16, GT=17, 
		LT=18, BANG=19, TILDE=20, QUESTION=21, COLON=22, EQUAL=23, LE=24, GE=25, 
		NOTEQUAL=26, AND=27, OR=28, INC=29, DEC=30, ADD=31, SUB=32, MUL=33, DIV=34, 
		BITAND=35, BITOR=36, CARET=37, MOD=38, OPAR=39, CPAR=40, OBRAC=41, CBRAC=42, 
		OCURL=43, CCURL=44, DQUOTE=45, SC=46, DT=47, ID=48, INT=49, WS=50, FLOAT=51, 
		COMMENT=52, STRING=53, CHAR=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'mained'", "'breaked'", "'elsed'", "'cased'", "'printfed'", 
		"'fored'", "'switched'", "'whiled'", "'scanfed'", "'elseifed'", "'do'", 
		"'returned'", "'defaulted'", "','", "'ifed'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'\"'", "';'", "DT", "ID", "INT", "WS", 
		"FLOAT", "COMMENT", "STRING", "CHAR"
	};
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_function = 2, RULE_mathOperators = 3, 
		RULE_relOperators = 4, RULE_cons = 5, RULE_varDecl = 6, RULE_funcDecl = 7, 
		RULE_expr = 8, RULE_assignExpression = 9, RULE_assignVal = 10, RULE_mathExpression = 11, 
		RULE_relExpression = 12, RULE_stat = 13, RULE_declStatement = 14, RULE_exprStatement = 15, 
		RULE_compStatement = 16, RULE_contStatement = 17, RULE_ioStatement = 18, 
		RULE_retStatement = 19, RULE_ifStatement = 20, RULE_elseIfStatement = 21, 
		RULE_elseStatement = 22, RULE_loopStatement = 23, RULE_whileStatement = 24, 
		RULE_doWhileStatement = 25, RULE_forStatement = 26, RULE_switchStatement = 27, 
		RULE_caseStatement = 28, RULE_defaultStatement = 29, RULE_printStatement = 30, 
		RULE_scanStatement = 31;
	public static final String[] ruleNames = {
		"prog", "main", "function", "mathOperators", "relOperators", "cons", "varDecl", 
		"funcDecl", "expr", "assignExpression", "assignVal", "mathExpression", 
		"relExpression", "stat", "declStatement", "exprStatement", "compStatement", 
		"contStatement", "ioStatement", "retStatement", "ifStatement", "elseIfStatement", 
		"elseStatement", "loopStatement", "whileStatement", "doWhileStatement", 
		"forStatement", "switchStatement", "caseStatement", "defaultStatement", 
		"printStatement", "scanStatement"
	};

	@Override
	public String getGrammarFileName() { return "Pastingv2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pastingv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(64); function();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(70); main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode DT() { return getToken(Pastingv2Parser.DT, 0); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(DT);
			setState(73); match(1);
			setState(74); match(OPAR);
			setState(75); match(CPAR);
			setState(76); stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token datatype;
		public Token name;
		public VarDeclContext param;
		public StatContext code;
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public TerminalNode DT() { return getToken(Pastingv2Parser.DT, 0); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((FunctionContext)_localctx).datatype = match(DT);
			setState(79); ((FunctionContext)_localctx).name = match(ID);
			setState(80); match(OPAR);
			setState(81); ((FunctionContext)_localctx).param = varDecl();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(82); match(14);
					setState(83); varDecl();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(89); match(CPAR);
			setState(90); ((FunctionContext)_localctx).code = stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathOperatorsContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Pastingv2Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(Pastingv2Parser.ADD, 0); }
		public TerminalNode DIV() { return getToken(Pastingv2Parser.DIV, 0); }
		public TerminalNode MUL() { return getToken(Pastingv2Parser.MUL, 0); }
		public MathOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterMathOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitMathOperators(this);
		}
	}

	public final MathOperatorsContext mathOperators() throws RecognitionException {
		MathOperatorsContext _localctx = new MathOperatorsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOperatorsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Pastingv2Parser.EQUAL, 0); }
		public TerminalNode GE() { return getToken(Pastingv2Parser.GE, 0); }
		public TerminalNode LT() { return getToken(Pastingv2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Pastingv2Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Pastingv2Parser.LE, 0); }
		public TerminalNode AND() { return getToken(Pastingv2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Pastingv2Parser.OR, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Pastingv2Parser.NOTEQUAL, 0); }
		public RelOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterRelOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitRelOperators(this);
		}
	}

	public final RelOperatorsContext relOperators() throws RecognitionException {
		RelOperatorsContext _localctx = new RelOperatorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Pastingv2Parser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(Pastingv2Parser.CHAR, 0); }
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Pastingv2Parser.FLOAT, 0); }
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitCons(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public Token data;
		public Token id;
		public List<TerminalNode> ID() { return getTokens(Pastingv2Parser.ID); }
		public List<AssignExpressionContext> assignExpression() {
			return getRuleContexts(AssignExpressionContext.class);
		}
		public AssignExpressionContext assignExpression(int i) {
			return getRuleContext(AssignExpressionContext.class,i);
		}
		public TerminalNode DT() { return getToken(Pastingv2Parser.DT, 0); }
		public TerminalNode ID(int i) {
			return getToken(Pastingv2Parser.ID, i);
		}
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public TerminalNode OBRAC() { return getToken(Pastingv2Parser.OBRAC, 0); }
		public TerminalNode CBRAC() { return getToken(Pastingv2Parser.CBRAC, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98); ((VarDeclContext)_localctx).data = match(DT);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(99); ((VarDeclContext)_localctx).id = match(ID);
				setState(103);
				_la = _input.LA(1);
				if (_la==OBRAC) {
					{
					setState(100); match(OBRAC);
					setState(101); match(INT);
					setState(102); match(CBRAC);
					}
				}

				}
				break;

			case 2:
				{
				setState(105); assignExpression();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(108); match(14);
					setState(111);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(109); match(ID);
						}
						break;

					case 2:
						{
						setState(110); assignExpression();
						}
						break;
					}
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Pastingv2Parser.ID); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public TerminalNode ID(int i) {
			return getToken(Pastingv2Parser.ID, i);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitFuncDecl(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(ID);
			setState(119); match(OPAR);
			{
			setState(120); match(ID);
			{
			setState(121); match(14);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(122); match(ID);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			}
			setState(128); match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); assignExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); mathExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); relExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Pastingv2Parser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public AssignValContext assignVal() {
			return getRuleContext(AssignValContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitAssignExpression(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch (_input.LA(1)) {
			case DT:
				{
				setState(135); varDecl();
				}
				break;
			case ID:
				{
				setState(136); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139); match(ASSIGN);
			setState(140); assignVal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignValContext extends ParserRuleContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public List<ConsContext> cons() {
			return getRuleContexts(ConsContext.class);
		}
		public TerminalNode OCURL() { return getToken(Pastingv2Parser.OCURL, 0); }
		public TerminalNode CCURL() { return getToken(Pastingv2Parser.CCURL, 0); }
		public ConsContext cons(int i) {
			return getRuleContext(ConsContext.class,i);
		}
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public AssignValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterAssignVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitAssignVal(this);
		}
	}

	public final AssignValContext assignVal() throws RecognitionException {
		AssignValContext _localctx = new AssignValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignVal);
		try {
			int _alt;
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(OCURL);
				{
				{
				setState(143); cons();
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(144); match(14);
						setState(145); cons();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				setState(151); match(CCURL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); mathExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154); match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExpressionContext extends ParserRuleContext {
		public Token left;
		public Token right;
		public TerminalNode INT(int i) {
			return getToken(Pastingv2Parser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(Pastingv2Parser.ID); }
		public MathOperatorsContext mathOperators() {
			return getRuleContext(MathOperatorsContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(Pastingv2Parser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(Pastingv2Parser.INT); }
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitMathExpression(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((MathExpressionContext)_localctx).left = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((MathExpressionContext)_localctx).left = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(158); mathOperators();
			setState(159);
			((MathExpressionContext)_localctx).right = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((MathExpressionContext)_localctx).right = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(Pastingv2Parser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(Pastingv2Parser.ID); }
		public RelOperatorsContext relOperators() {
			return getRuleContext(RelOperatorsContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(Pastingv2Parser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(Pastingv2Parser.INT); }
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitRelExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(162); relOperators();
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public DeclStatementContext declStatement() {
			return getRuleContext(DeclStatementContext.class,0);
		}
		public ContStatementContext contStatement() {
			return getRuleContext(ContStatementContext.class,0);
		}
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public RetStatementContext retStatement() {
			return getRuleContext(RetStatementContext.class,0);
		}
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(165); declStatement();
				}
				break;

			case 2:
				{
				setState(166); exprStatement();
				}
				break;

			case 3:
				{
				setState(167); compStatement();
				}
				break;

			case 4:
				{
				setState(168); contStatement();
				}
				break;

			case 5:
				{
				setState(169); ioStatement();
				}
				break;

			case 6:
				{
				setState(170); retStatement();
				}
				break;
			}
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(173); stat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclStatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public DeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitDeclStatement(this);
		}
	}

	public final DeclStatementContext declStatement() throws RecognitionException {
		DeclStatementContext _localctx = new DeclStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); varDecl();
			setState(177); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitExprStatement(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); expr();
			setState(180); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompStatementContext extends ParserRuleContext {
		public TerminalNode OCURL() { return getToken(Pastingv2Parser.OCURL, 0); }
		public TerminalNode CCURL() { return getToken(Pastingv2Parser.CCURL, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CompStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterCompStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitCompStatement(this);
		}
	}

	public final CompStatementContext compStatement() throws RecognitionException {
		CompStatementContext _localctx = new CompStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(OCURL);
			setState(183); stat();
			setState(184); match(CCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ContStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterContStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitContStatement(this);
		}
	}

	public final ContStatementContext contStatement() throws RecognitionException {
		ContStatementContext _localctx = new ContStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contStatement);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case 15:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); ifStatement();
				}
				break;
			case 6:
			case 8:
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoStatementContext extends ParserRuleContext {
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterIoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitIoStatement(this);
		}
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ioStatement);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); scanStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public RetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterRetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitRetStatement(this);
		}
	}

	public final RetStatementContext retStatement() throws RecognitionException {
		RetStatementContext _localctx = new RetStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(12);
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(197); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatContext cond;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public ElseIfStatementContext elseIfStatement() {
			return getRuleContext(ElseIfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); match(15);
				setState(200); match(OPAR);
				setState(201); expr();
				setState(202); match(CPAR);
				setState(203); ((IfStatementContext)_localctx).cond = stat();
				setState(205);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(204); elseStatement();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(15);
				setState(208); match(OPAR);
				setState(209); expr();
				setState(210); match(CPAR);
				setState(211); ((IfStatementContext)_localctx).cond = stat();
				setState(212); elseIfStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitElseIfStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseIfStatement);
		try {
			int _alt;
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(10);
				setState(217); match(OPAR);
				setState(218); expr();
				setState(219); match(CPAR);
				setState(220); compStatement();
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(221); elseIfStatement();
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); match(10);
				setState(228); match(OPAR);
				setState(229); expr();
				setState(230); match(CPAR);
				setState(231); compStatement();
				setState(232); elseStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(3);
			setState(237); compStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopStatement);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case 8:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); whileStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(8);
			setState(245); match(OPAR);
			setState(246); match(CPAR);
			setState(247); compStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(11);
			setState(250); compStatement();
			setState(251); match(8);
			setState(252); match(OPAR);
			setState(253); match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public CompStatementContext compStatement() {
			return getRuleContext(CompStatementContext.class,0);
		}
		public TerminalNode SC(int i) {
			return getToken(Pastingv2Parser.SC, i);
		}
		public List<TerminalNode> SC() { return getTokens(Pastingv2Parser.SC); }
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(6);
			setState(256); match(OPAR);
			setState(257); match(SC);
			setState(258); match(SC);
			setState(259); match(CPAR);
			setState(260); compStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public TerminalNode OCURL() { return getToken(Pastingv2Parser.OCURL, 0); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public TerminalNode CCURL() { return getToken(Pastingv2Parser.CCURL, 0); }
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(7);
			setState(263); match(OPAR);
			setState(264); match(ID);
			setState(265); match(CPAR);
			setState(266); match(OCURL);
			setState(267); caseStatement();
			setState(268); match(CCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Pastingv2Parser.COLON, 0); }
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); match(4);
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(272); match(COLON);
				setState(273); stat();
				setState(274); match(2);
				setState(275); match(SC);
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(276); caseStatement();
						}
						} 
					}
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(4);
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(284); match(COLON);
				setState(285); stat();
				setState(286); match(2);
				setState(287); match(SC);
				setState(288); defaultStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Pastingv2Parser.COLON, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitDefaultStatement(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_defaultStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(13);
			setState(293); match(COLON);
			setState(294); stat();
			setState(295); match(2);
			setState(296); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public Token print;
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public TerminalNode STRING() { return getToken(Pastingv2Parser.STRING, 0); }
		public TerminalNode INT() { return getToken(Pastingv2Parser.INT, 0); }
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(5);
			setState(299); match(OPAR);
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(300);
				((PrintStatementContext)_localctx).print = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
					((PrintStatementContext)_localctx).print = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(303); match(CPAR);
			setState(304); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pastingv2Parser.ID, 0); }
		public TerminalNode CPAR() { return getToken(Pastingv2Parser.CPAR, 0); }
		public TerminalNode STRING() { return getToken(Pastingv2Parser.STRING, 0); }
		public TerminalNode SC() { return getToken(Pastingv2Parser.SC, 0); }
		public TerminalNode OPAR() { return getToken(Pastingv2Parser.OPAR, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pastingv2Listener ) ((Pastingv2Listener)listener).exitScanStatement(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(9);
			setState(307); match(OPAR);
			setState(308); match(STRING);
			setState(309); match(14);
			setState(310); match(BITAND);
			setState(311); match(ID);
			setState(312); match(CPAR);
			setState(313); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\5\bm\n\b\3\b\3\b\3\b\5\br\n"+
		"\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u0088\n\n\3\13\3\13\5\13\u008c\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\f\3\f\3"+
		"\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00ae\n\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c0\n\23\3\24"+
		"\3\24\5\24\u00c4\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00d0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\7\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ed\n\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0118\n\36\f\36"+
		"\16\36\u011b\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0125"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0130\n \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\tEXu\177\u0096\u00e2\u0119\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3\2!$\4\2\23\24"+
		"\31\36\5\2\62\63\65\65\678\3\2\62\63\4\2\62\63\67\67\u013c\2E\3\2\2\2"+
		"\4J\3\2\2\2\6P\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20"+
		"x\3\2\2\2\22\u0087\3\2\2\2\24\u008b\3\2\2\2\26\u009d\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3\2\2\2 \u00b5\3\2"+
		"\2\2\"\u00b8\3\2\2\2$\u00bf\3\2\2\2&\u00c3\3\2\2\2(\u00c5\3\2\2\2*\u00d8"+
		"\3\2\2\2,\u00ec\3\2\2\2.\u00ee\3\2\2\2\60\u00f4\3\2\2\2\62\u00f6\3\2\2"+
		"\2\64\u00fb\3\2\2\2\66\u0101\3\2\2\28\u0108\3\2\2\2:\u0124\3\2\2\2<\u0126"+
		"\3\2\2\2>\u012c\3\2\2\2@\u0134\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2E"+
		"F\3\2\2\2EC\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\4\3\2I\3\3\2\2\2JK\7\61\2"+
		"\2KL\7\3\2\2LM\7)\2\2MN\7*\2\2NO\5\34\17\2O\5\3\2\2\2PQ\7\61\2\2QR\7\62"+
		"\2\2RS\7)\2\2SX\5\16\b\2TU\7\20\2\2UW\5\16\b\2VT\3\2\2\2WZ\3\2\2\2XY\3"+
		"\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7*\2\2\\]\5\34\17\2]\7\3\2\2\2"+
		"^_\t\2\2\2_\t\3\2\2\2`a\t\3\2\2a\13\3\2\2\2bc\t\4\2\2c\r\3\2\2\2dl\7\61"+
		"\2\2ei\7\62\2\2fg\7+\2\2gh\7\63\2\2hj\7,\2\2if\3\2\2\2ij\3\2\2\2jm\3\2"+
		"\2\2km\5\24\13\2le\3\2\2\2lk\3\2\2\2mu\3\2\2\2nq\7\20\2\2or\7\62\2\2p"+
		"r\5\24\13\2qo\3\2\2\2qp\3\2\2\2rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2uv\3\2\2"+
		"\2us\3\2\2\2v\17\3\2\2\2wu\3\2\2\2xy\7\62\2\2yz\7)\2\2z{\7\62\2\2{\177"+
		"\7\20\2\2|~\7\62\2\2}|\3\2\2\2~\u0081\3\2\2\2\177\u0080\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7*\2\2\u0083"+
		"\21\3\2\2\2\u0084\u0088\5\24\13\2\u0085\u0088\5\30\r\2\u0086\u0088\5\32"+
		"\16\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008c\5\16\b\2\u008a\u008c\7\62\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\5\26\f\2\u008f\25\3\2\2\2\u0090\u0091\7-\2\2\u0091\u0096\5\f\7"+
		"\2\u0092\u0093\7\20\2\2\u0093\u0095\5\f\7\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7.\2\2\u009a\u009e\3\2\2\2\u009b"+
		"\u009e\5\30\r\2\u009c\u009e\7\63\2\2\u009d\u0090\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1\u00a2\t\5\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\t\5\2"+
		"\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\t\5\2\2\u00a6\33\3\2\2\2\u00a7\u00ae"+
		"\5\36\20\2\u00a8\u00ae\5 \21\2\u00a9\u00ae\5\"\22\2\u00aa\u00ae\5$\23"+
		"\2\u00ab\u00ae\5&\24\2\u00ac\u00ae\5(\25\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5\34\17\2\u00b0\u00af\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\5\16\b\2\u00b3"+
		"\u00b4\7\60\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7\60"+
		"\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb"+
		"\7.\2\2\u00bb#\3\2\2\2\u00bc\u00c0\5*\26\2\u00bd\u00c0\5\60\31\2\u00be"+
		"\u00c0\58\35\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0%\3\2\2\2\u00c1\u00c4\5> \2\u00c2\u00c4\5@!\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7\16\2\2\u00c6"+
		"\u00c7\t\5\2\2\u00c7\u00c8\7\60\2\2\u00c8)\3\2\2\2\u00c9\u00ca\7\21\2"+
		"\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7*\2\2\u00cd\u00cf"+
		"\5\34\17\2\u00ce\u00d0\5.\30\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\7)\2\2\u00d3\u00d4"+
		"\5\22\n\2\u00d4\u00d5\7*\2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\5,\27\2"+
		"\u00d7\u00d9\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9+\3"+
		"\2\2\2\u00da\u00db\7\f\2\2\u00db\u00dc\7)\2\2\u00dc\u00dd\5\22\n\2\u00dd"+
		"\u00de\7*\2\2\u00de\u00e2\5\"\22\2\u00df\u00e1\5,\27\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00ed\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7\7)"+
		"\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\5\"\22\2\u00ea"+
		"\u00eb\5.\30\2\u00eb\u00ed\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00e5\3\2"+
		"\2\2\u00ed-\3\2\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\5\"\22\2\u00f0/\3"+
		"\2\2\2\u00f1\u00f5\5\62\32\2\u00f2\u00f5\5\64\33\2\u00f3\u00f5\5\66\34"+
		"\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\61"+
		"\3\2\2\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\7)\2\2\u00f8\u00f9\7*\2\2\u00f9"+
		"\u00fa\5\"\22\2\u00fa\63\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5\"\22"+
		"\2\u00fd\u00fe\7\n\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\7*\2\2\u0100\65"+
		"\3\2\2\2\u0101\u0102\7\b\2\2\u0102\u0103\7)\2\2\u0103\u0104\7\60\2\2\u0104"+
		"\u0105\7\60\2\2\u0105\u0106\7*\2\2\u0106\u0107\5\"\22\2\u0107\67\3\2\2"+
		"\2\u0108\u0109\7\t\2\2\u0109\u010a\7)\2\2\u010a\u010b\7\62\2\2\u010b\u010c"+
		"\7*\2\2\u010c\u010d\7-\2\2\u010d\u010e\5:\36\2\u010e\u010f\7.\2\2\u010f"+
		"9\3\2\2\2\u0110\u0111\7\6\2\2\u0111\u0112\t\5\2\2\u0112\u0113\7\30\2\2"+
		"\u0113\u0114\5\34\17\2\u0114\u0115\7\4\2\2\u0115\u0119\7\60\2\2\u0116"+
		"\u0118\5:\36\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u0125\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\7\6\2\2\u011d\u011e\t\5\2\2\u011e\u011f\7\30\2\2\u011f\u0120\5"+
		"\34\17\2\u0120\u0121\7\4\2\2\u0121\u0122\7\60\2\2\u0122\u0123\5<\37\2"+
		"\u0123\u0125\3\2\2\2\u0124\u0110\3\2\2\2\u0124\u011c\3\2\2\2\u0125;\3"+
		"\2\2\2\u0126\u0127\7\17\2\2\u0127\u0128\7\30\2\2\u0128\u0129\5\34\17\2"+
		"\u0129\u012a\7\4\2\2\u012a\u012b\7\60\2\2\u012b=\3\2\2\2\u012c\u012d\7"+
		"\7\2\2\u012d\u012f\7)\2\2\u012e\u0130\t\6\2\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7*\2\2\u0132\u0133\7\60"+
		"\2\2\u0133?\3\2\2\2\u0134\u0135\7\13\2\2\u0135\u0136\7)\2\2\u0136\u0137"+
		"\7\67\2\2\u0137\u0138\7\20\2\2\u0138\u0139\7%\2\2\u0139\u013a\7\62\2\2"+
		"\u013a\u013b\7*\2\2\u013b\u013c\7\60\2\2\u013cA\3\2\2\2\31EXilqu\177\u0087"+
		"\u008b\u0096\u009d\u00ad\u00b0\u00bf\u00c3\u00cf\u00d8\u00e2\u00ec\u00f4"+
		"\u0119\u0124\u012f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}