package expressions;

public class ExpBinaryPlus extends ExpBinary {

	public ExpBinaryPlus(ExpAbstract leftOp, ExpAbstract rightOp) {
		super(leftOp, rightOp);
		
	}

	@Override
	public String toStringInfixe() {
		
		String s = "(" + this.getLeftOp().toStringInfixe();
		s += "+";
		s += this.getRightOp().toStringInfixe() + ")";
		return s;
	}
	
	
}
