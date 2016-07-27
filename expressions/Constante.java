package expressions;

public class Constante extends ExpAbstract {

	double value;
	
	public Constante(double d) {
		this.value = d;
	}
	
	@Override
	public String toStringInfixe() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}

	

}
