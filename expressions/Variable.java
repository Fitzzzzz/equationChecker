package expressions;

public class Variable extends ExpAbstract {


	public Variable(String var) {
		this.var = var;
	}
	
	String var;
	
	@Override
	public String toStringInfixe() {
		return this.var;
	}

	
	
}
