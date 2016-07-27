package testing;

import expressions.*;


public class TestAffichageInfixe {

	public static void main(String[] args) {
		
		ExpAbstract exp;
		exp = new ExpBinaryMult(new Variable("y"), new Constante(3));
		System.out.println(exp.toStringInfixe());
		
		exp = new ExpBinaryMult(
				new ExpBinaryPlus(
						new Variable("x"), 
						new Variable("x")
						), 
				new Constante(5));
		System.out.println(exp.toStringInfixe());

		exp = new ExpBinaryMult(
				new Constante(-3.5),
				new ExpBinaryPlus(
						new Variable("a"),
						new Variable("b"))
				);
		
	}
	
}
