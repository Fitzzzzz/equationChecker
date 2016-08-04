package equationHandler;


public class Constant extends Operand {

	public Constant(String name, int value) {
		super(name);
		this.value = value;
		
	}
	
	private int value;

	public int getValue() {
		return value;
	}

	@Override
	public int getValue(int year) {
		// TODO Auto-generated method stub
		return this.getValue();
	} 
	
	
}
