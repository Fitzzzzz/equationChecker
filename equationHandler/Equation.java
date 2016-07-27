package equationHandler;

import binaryTree.Node;

public class Equation {

	public Equation(String equation) {
		this.equation = equation;
		this.tree = null;
		String[] parts = equation.split("=");
		this.receiver = parts[0];
		this.body = parts[1];
		String[] tmp = {body};
		
		tmp = this.split(tmp, Operator.PLUS);	
		tmp = this.split(tmp, Operator.MINUS);
		tmp = this.split(tmp, Operator.MULTIPLY);
		tmp = this.split(tmp, Operator.DIVIDE);		
		tmp = this.split(tmp, Operator.OPENPARENTHESES);	
		tmp = this.split(tmp, Operator.CLOSEPARENTHESES);	
		
		
		
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + "*****");
		}
		System.out.println("");
		
	}
	
	public enum Operator {
		PLUS,
		MINUS,
		MULTIPLY,
		DIVIDE,
		OPENPARENTHESES,
		CLOSEPARENTHESES;
	}
	
	private String equation;
	
	public String getEquation() {
		return equation;
	}

	private String receiver;
	
	public String getReceiver() {
		return receiver;
	}

	private String body;
 
 	public String getBody() {
		return body;
	}

 	private String[] tokens;
 	
	private Node tree;

	public Node getTree() {
		return tree;
	}

	private String[] split(String[] toSplit, Operator operator) {
		
		
		String separator = ""; // TODO: Ugly
		String separatorRegex = ""; // TODO: Ugly
		
		if (operator.equals(Operator.PLUS)) {
			separator = "+";
			separatorRegex = "+";
		}
		else if (operator.equals(Operator.MINUS)) {
			separator = "-";
			separatorRegex = "-";
		}
		else if (operator.equals(Operator.MULTIPLY)) {
			separator = "*";
			separatorRegex = "\\*";
		}
		else if (operator.equals(Operator.DIVIDE)) {
			separator = "/";
			separatorRegex = "/";
		}
		else if (operator.equals(Operator.OPENPARENTHESES)) {
			separator = "(";
			separatorRegex = "\\(";
		}
		else if (operator.equals(Operator.CLOSEPARENTHESES)) {
			separator = ")";
			separatorRegex = "\\)";
		}
		
		String[] tmp;
		String[] tmp2;
		String[] tmp3;
		
		int newLength = 0;

			
		// Doing it manually for 0 because of initialization problems
			
		tmp = toSplit[0].split(separatorRegex);
		newLength = newLength + 2*tmp.length - 1;
		tmp3 = new String[newLength];
		
		for (int l = 0; l < tmp.length - 1; l++) {
			tmp3[2*l] = tmp[l];
			tmp3[2*l + 1] = separator;
		}
		
		tmp3[2*(tmp.length - 1)] = tmp[tmp.length - 1];
		
		tmp2 = new String[tmp3.length];
		System.arraycopy(tmp3, 0, tmp2, 0, tmp3.length);
		
		// For each parts already split by previous operators
		for (int i = 1; i < toSplit.length; i++) {
			
			tmp = toSplit[i].split(separatorRegex);
			
			newLength = newLength + 2*tmp.length - 1;
			tmp3 = new String[newLength];
			System.arraycopy(tmp2, 0, tmp3, 0, tmp2.length);
			
			
			for (int k = 0; k < tmp.length - 1; k++) {
				
				tmp3[tmp2.length + 2*k] = tmp[k];
				tmp3[tmp2.length + 2*k + 1] = separator;
				
			}
			tmp3[tmp2.length + 2*(tmp.length - 1)] = tmp[tmp.length - 1];
			
			tmp2 = new String[tmp3.length];
			System.arraycopy(tmp3, 0, tmp2, 0, tmp3.length);
			
		}
		
		
		
	
	return tmp3;	
		
	}
	
}
