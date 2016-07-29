package testing;

import arithmeticParsing.Parser;
import binaryTree.TreeBuilder;
import binaryTree.TreePrinter;
import equationHandler.Equation;

public class TestEquation {

	public static void main(String[] args) {

		String equation = "cueleagr=3+4*2/(1-5)"; 
		Equation eq = new Equation(equation);
		Parser tokenParser = new Parser(eq.getTokens());
//		System.out.println(eq.getReceiver());
//		System.out.println(eq.getBody());
		System.out.println(tokenParser.getLList(tokenParser.getOutput()));
		TreeBuilder tree = new TreeBuilder(tokenParser.getOutput());
		TreePrinter.print(tree.getTree());
	}

}
 