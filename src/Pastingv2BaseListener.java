// Generated from /home/alex/Documents/COMPILE/Pastingv2.g4 by ANTLR 4.1
import java.util.HashMap;
import java.util.Scanner;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * This class provides an empty implementation of {@link Pastingv2Listener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class Pastingv2BaseListener implements Pastingv2Listener
{
    HashMap<String, Symbol> symbols = new HashMap<String, Symbol>();
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCaseStatement(@NotNull Pastingv2Parser.CaseStatementContext ctx)
	{ 
	  
	}
	
	@Override public void exitCaseStatement(@NotNull Pastingv2Parser.CaseStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterDefaultStatement(@NotNull Pastingv2Parser.DefaultStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
  	@Override public void exitDefaultStatement(@NotNull Pastingv2Parser.DefaultStatementContext ctx)
  	{ 
//	  System.out.println(ctx.getText());  
	}
  	
	@Override public void enterRetStatement(@NotNull Pastingv2Parser.RetStatementContext ctx) 
	{ 
//	  System.out.println("Found Return Statement\n");
//	  System.out.println(ctx.getText() + "\n");
	}
	
	@Override public void exitRetStatement(@NotNull Pastingv2Parser.RetStatementContext ctx)
    { 
//	  System.out.println(ctx.getText());  
	}
	
	
	@Override public void enterMathExpression(@NotNull Pastingv2Parser.MathExpressionContext ctx)
	{
	  int tempAns = 0, left = 0, right = 0;
	  String op = ctx.mathOperators().getText().toString();
	  
//	  System.out.println("Rule: " + ctx.getRuleContext().getText().toString());

	  left = Integer.parseInt(ctx.left.getText().toString());
	  right = Integer.parseInt(ctx.right.getText().toString());
	  
	  if ( op.equals("+"))
	    tempAns = left + right;
	  
	  if ( op.equals("-"))
	    tempAns = left - right;
	  
	  if ( op.equals("/"))
	    tempAns = left / right;  
	  
	  if ( op.equals("*"))
	    tempAns = left * right;
	    
	  
	  System.out.println(tempAns + "\n");
	  
	}
	@Override public void exitMathExpression(@NotNull Pastingv2Parser.MathExpressionContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterMain(@NotNull Pastingv2Parser.MainContext ctx)
	{ 
//	  System.out.println("Found Main\n"); 
//	  System.out.println(ctx.getText() + "\n");
//	  activeVarList = new HashMap<String, Variable>();
	}
	
	@Override public void exitMain(@NotNull Pastingv2Parser.MainContext ctx)
	{
//	  functions.put("mained", activeVarList);
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterSwitchStatement(@NotNull Pastingv2Parser.SwitchStatementContext ctx)
	{ 
//	  System.out.println("Found Switch Statement\n");  
//	  System.out.println(ctx.getText() + "\n");
	}
	@Override public void exitSwitchStatement(@NotNull Pastingv2Parser.SwitchStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	@Override public void enterFunction(@NotNull Pastingv2Parser.FunctionContext ctx)
	{ 

	  String name = ctx.ID().getText().toString();
	  String dataType = ctx.DT().getText().toString();
	  
	  if (symbols.containsKey(name))
 	  {
 		System.err.println("line " + ctx.start.getLine() + ": Previous declaration of '" + name + "' was here");
 	  }
	  
	  else
	  {
		symbols.put(name, new Symbol(name, dataType, "function", name, "null"));
	  }
	}
	
	@Override public void exitFunction(@NotNull Pastingv2Parser.FunctionContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	@Override public void enterExprStatement(@NotNull Pastingv2Parser.ExprStatementContext ctx)
	{ 
//	  System.out.println("Found Expression Statement"); 
//	  System.out.println(ctx.getText() + "\n");
	}
	@Override public void exitExprStatement(@NotNull Pastingv2Parser.ExprStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterExpr(@NotNull Pastingv2Parser.ExprContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void exitExpr(@NotNull Pastingv2Parser.ExprContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterDoWhileStatement(@NotNull Pastingv2Parser.DoWhileStatementContext ctx)
	{ 
//	  System.out.println("Found Do While Statement");  
//	  System.out.println(ctx.getText() + "\n");
	}
	
	@Override public void exitDoWhileStatement(@NotNull Pastingv2Parser.DoWhileStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterScanStatement(@NotNull Pastingv2Parser.ScanStatementContext ctx)
	{ 
//	  System.out.println("Found Scan Statement");
//	  System.out.println(ctx.getText() + "\n");
	  Scanner scan = new Scanner(System.in);
	  String name = ctx.ID().getText().toString();
	  String scannedValue = new String();
	  
	  if (symbols.containsKey(name))
	  {
		scannedValue = scan.next();
		
		Symbol sym = symbols.get(name);
		sym.setValue(scannedValue);
		symbols.put(name, sym);
	  }
	  
	  else
	  {
		System.err.println("line " + ctx.start.getLine() + ": Variable " + name + " does not exist.");
	  }
	}
	
	@Override public void exitScanStatement(@NotNull Pastingv2Parser.ScanStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterCons(@NotNull Pastingv2Parser.ConsContext ctx)
	{ 
//	  System.out.println("Found Constant");  
//	  System.out.println(ctx.getText() + "\n");
	}
	
	@Override public void exitCons(@NotNull Pastingv2Parser.ConsContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterStat(@NotNull Pastingv2Parser.StatContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void exitStat(@NotNull Pastingv2Parser.StatContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterRelExpression(@NotNull Pastingv2Parser.RelExpressionContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void exitRelExpression(@NotNull Pastingv2Parser.RelExpressionContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterAssignExpression(@NotNull Pastingv2Parser.AssignExpressionContext ctx)
	{ 
	  String varName = ctx.ID().getText().toString();
	  String value = ctx.assignVal().getText().toString();
	  
	  if (symbols.containsKey(varName))
	  {
	    Symbol sym = symbols.get(varName);
	    sym.setValue(value);
	    symbols.put(varName, sym);
	  }
	}
	
	@Override public void exitAssignExpression(@NotNull Pastingv2Parser.AssignExpressionContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterIoStatement(@NotNull Pastingv2Parser.IoStatementContext ctx)
	{ 
//	  System.out.println("Found IO Statement");
	}
	
	@Override public void exitIoStatement(@NotNull Pastingv2Parser.IoStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterRelOperators(@NotNull Pastingv2Parser.RelOperatorsContext ctx)
	{ 
//	  System.out.println("Found Relational Operators");  
	}
	
	@Override public void exitRelOperators(@NotNull Pastingv2Parser.RelOperatorsContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterForStatement(@NotNull Pastingv2Parser.ForStatementContext ctx)
	{ 
//	  System.out.println("Found For Loop");  
	}
	
	@Override public void exitForStatement(@NotNull Pastingv2Parser.ForStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterLoopStatement(@NotNull Pastingv2Parser.LoopStatementContext ctx)
	{ 
//	  System.out.println("Found Loop Statement");  
	}
	
	@Override public void exitLoopStatement(@NotNull Pastingv2Parser.LoopStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterIfStatement(@NotNull Pastingv2Parser.IfStatementContext ctx)
	{ 
//	  System.out.println("Found IF Statement");  
		
	  System.out.println(ctx.expr().getText().toString());
	}
	
	@Override public void exitIfStatement(@NotNull Pastingv2Parser.IfStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterProg(@NotNull Pastingv2Parser.ProgContext ctx)
	{ 
//	  System.out.println("Enter Program");  
	}
	
	@Override public void exitProg(@NotNull Pastingv2Parser.ProgContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterElseIfStatement(@NotNull Pastingv2Parser.ElseIfStatementContext ctx)
	{ 
//	  System.out.println("Enter Else If Statement");  
	}
	
	@Override public void exitElseIfStatement(@NotNull Pastingv2Parser.ElseIfStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterWhileStatement(@NotNull Pastingv2Parser.WhileStatementContext ctx)
	{ 
//	  System.out.println("Enter While Statement");  
	}
	
	@Override public void exitWhileStatement(@NotNull Pastingv2Parser.WhileStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterPrintStatement(@NotNull Pastingv2Parser.PrintStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());
//	  System.out.println("Found Print Statement");
	  String willBePrinted = new String();
	  willBePrinted = ctx.print.getText().toString();
	  System.out.println(willBePrinted);
	}
	
	@Override public void exitPrintStatement(@NotNull Pastingv2Parser.PrintStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText()); 
	}
	
	@Override public void enterElseStatement(@NotNull Pastingv2Parser.ElseStatementContext ctx)
	{ 
//	  System.out.println("Found Else Statement");  
	}
	
	@Override public void exitElseStatement(@NotNull Pastingv2Parser.ElseStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterFuncDecl(@NotNull Pastingv2Parser.FuncDeclContext ctx)
	{ 
//	  System.out.println(ctx.getText());
//	  System.out.println("Found Function Declaration");
	}
	
	@Override public void exitFuncDecl(@NotNull Pastingv2Parser.FuncDeclContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
  	@Override public void enterMathOperators(@NotNull Pastingv2Parser.MathOperatorsContext ctx)
  	{ 
//	  System.out.println("Found Math Operator");  
//	  System.out.println(ctx.getText());
	}
  	
	@Override public void exitMathOperators(@NotNull Pastingv2Parser.MathOperatorsContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterContStatement(@NotNull Pastingv2Parser.ContStatementContext ctx)
	{ 
//	  System.out.println("Found Control Statement");  
	}
	
	@Override public void exitContStatement(@NotNull Pastingv2Parser.ContStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
  	@Override public void enterVarDecl(@NotNull Pastingv2Parser.VarDeclContext ctx)
  	{
  	  String dataType = ctx.data.getText().toString();
 	  String varName = ctx.id.getText().toString();
 	  
 	  if (symbols.containsKey(varName))
 	  {
 		System.err.println("line " + ctx.start.getLine() + ": Previous declaration of '" + varName + "' was here");
 	  }
 	  
 	  else
 	  {
 	    symbols.put(varName, new Symbol(varName, dataType, "none", "main", "null"));
 	  }
	}
  	
	@Override public void exitVarDecl(@NotNull Pastingv2Parser.VarDeclContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterCompStatement(@NotNull Pastingv2Parser.CompStatementContext ctx)
	{ 
//	  System.out.println("Found Complex Statement");  
	}
	
	@Override public void exitCompStatement(@NotNull Pastingv2Parser.CompStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterDeclStatement(@NotNull Pastingv2Parser.DeclStatementContext ctx)
	{ 
//	  System.out.println("Found Declarative Statement");  
	}
	
	@Override public void exitDeclStatement(@NotNull Pastingv2Parser.DeclStatementContext ctx)
	{ 
//	  System.out.println(ctx.getText());  
	}
	
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }

	@Override public void enterAssignVal(@NotNull Pastingv2Parser.AssignValContext ctx)
	{ 
//	  String varName = ctx.ID()y
	  
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAssignVal(@NotNull Pastingv2Parser.AssignValContext ctx) { }
}
  