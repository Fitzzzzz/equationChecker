package expressions;

public abstract class ExpAbstract {

	public abstract String toStringInfixe();

	@Override
	public String toString() {
		return "Here is my infixed notation : " + this.toStringInfixe();
	}
	
	
}
