package equationHandler;

public abstract class Operand extends Token{

	public Operand(String op) {
		
		super(op, 0);

	}
	
	public abstract int getValue();

	
	
}
