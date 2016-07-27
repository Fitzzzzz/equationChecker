package testing;

import binaryTree.Node;
import equationHandler.Equation;

public class TestEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	String equation = "cueleagr=elecfagr/surirg*gsdfbfd/gsdfbnz-dfsbdbds"; 
		Equation eq = new Equation(equation);
		System.out.println(eq.getReceiver());
		System.out.println(eq.getBody());
		
		
	}

}
