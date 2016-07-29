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
	
	
}
