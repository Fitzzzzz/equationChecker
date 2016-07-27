package expressions;

public class ExpBinaryMinus extends ExpBinary {

	public ExpBinaryMinus(ExpAbstract leftOp, ExpAbstract rightOp) {
		super(leftOp, rightOp);
		
	}

	@Override
	public String toStringInfixe() {
		
		String s = "(" + this.getLeftOp().toStringInfixe();
		s += "-";
		s += this.getRightOp().toStringInfixe() + ")";
		return s;
	}
	
	
}
