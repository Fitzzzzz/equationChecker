package expressions;

public abstract class ExpBinary extends ExpAbstract {

	
	private ExpAbstract leftOp;
	
	public ExpAbstract getLeftOp() {
		return leftOp;
	}

	private ExpAbstract rightOp;
	
	public ExpAbstract getRightOp() {
		return rightOp;
	}
	
	public ExpBinary(ExpAbstract leftOp, ExpAbstract rightOp) {
		
		this.leftOp = leftOp;
		this.rightOp = rightOp;
		
	}
	
	@Override
	public String toStringInfixe() {
		// TODO Auto-generated method stub
		return null;
	}

}
