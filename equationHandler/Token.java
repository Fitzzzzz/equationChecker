package equationHandler;

public abstract class Token {

	private String toString;
	
	public String getOpString() {
		return toString;
	}

	private int type;
	
	public int getType() {
		return type;
	}

	public Token(String op, int type) {
		
		this.toString = op;
		this.type = type;
		
	}

	@Override
	public String toString() {

		return this.toString;
	}

	public boolean equals(String tested) {
		
		return tested.equals(this.toString());
		
	}
	
	
	
	
}
