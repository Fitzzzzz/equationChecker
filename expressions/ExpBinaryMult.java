package expressions;

public class ExpBinaryMult extends ExpBinary {

	public ExpBinaryMult(ExpAbstract leftOp, ExpAbstract rightOp) {
		super(leftOp, rightOp);
		
	}

	@Override
	public String toStringInfixe() {
		
		String s = "(" + this.getLeftOp().toStringInfixe();
		s += "*";
		s += this.getRightOp().toStringInfixe() + ")";
		return s;
	}
	
	
}
