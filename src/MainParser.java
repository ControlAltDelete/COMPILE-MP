import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
//import org.antlr.runtime.ANTLRStringStream;


public class MainParser
{
  public static void main(String[] args)
  {
	MainParser parseThis = new MainParser();
	parseThis.printResult();
  }
  
  private void printResult()
  {
    String file = "/Users/rio/rio/Desktop/testCase6.txt";
    
    try
    {
      CharStream cs = new ANTLRFileStream(file);
      Pastingv2Lexer lexer = new Pastingv2Lexer(cs);
      CommonTokenStream tokens = new CommonTokenStream(lexer); 
      Pastingv2Parser parser = new Pastingv2Parser(tokens);
      Pastingv2Parser.ProgContext psc = parser.prog();
      
      ParseTreeWalker walker = new ParseTreeWalker();
      Pastingv2Listener listener = new Pastingv2BaseListener();
      walker.walk(listener, psc);
    }
    
    catch (IOException e)
    {
      System.out.println("Something went wrong. :-//");
    }
    
   
  }
}
