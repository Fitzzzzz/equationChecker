package equationHandler;

import java.util.Vector;
public class Equation {

	public static PriorityToken PLUS = new Operator("+", 1);
	public static PriorityToken MINUS = new Operator("-", 1);
	public static PriorityToken MULTIPLY = new Operator("*", 2);
	public static PriorityToken DIVIDE = new Operator("/", 2);
	public static PriorityToken OPENPARENTHESES = new Parenthesis("(" , 4, true);
	public static PriorityToken CLOSEPARENTHESES = new Parenthesis(")", 4, false);
	
	public Equation(String equation) {
		
		this.equation = equation;
		String[] parts = equation.split("=");
		this.receiver = parts[0];
		this.body = parts[1];
		String[] tmp = {body};
		
		tmp = this.split(tmp, PLUS);	
		tmp = this.split(tmp, MINUS);
		tmp = this.split(tmp, MULTIPLY);
		tmp = this.split(tmp, DIVIDE);		
		tmp = this.split(tmp, OPENPARENTHESES);	
		tmp = this.split(tmp, CLOSEPARENTHESES);	
		
		
		// TODO : to remove
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + "______");
		}
		System.out.println("");
		
		tokens = this.convertStringToToken(tmp);
		
		// TODO : remove
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + "______");
		}
		System.out.println("");
		
		
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

 	private Token[] tokens;
 	
	public Token[] getTokens() {
		return tokens;
	}


	private String[] split(String[] toSplit, PriorityToken separator) {
		
		
		String operator = separator.getOpString(); // TODO: Ugly
		
		String[] tmp;
		String[] tmp2 = new String[0];
		String[] tmp3;
		
		for (int i = 0; i < toSplit.length; i++) {		
			
			tmp = Equation.mySplit(toSplit[i], operator);
			tmp3 = tmp2;
			tmp2 = new String[tmp3.length + tmp.length];
			System.arraycopy(tmp3, 0, tmp2, 0, tmp3.length);
			System.arraycopy(tmp, 0, tmp2, tmp3.length, tmp.length);
			
		}
		return tmp2;
	}
	
	public static String[] mySplit(String str, String regex) {
		
	    Vector<String> result = new Vector<String>();
	    int start = 0;
	    int pos = str.indexOf(regex);
	    while (pos>=start) {
	        if (pos>start) {
	            result.add(str.substring(start,pos));
	        }
	        start = pos + regex.length();
	        result.add(regex);
	        pos = str.indexOf(regex,start); 
	    }
	    if (start<str.length()) {
	        result.add(str.substring(start));
	    }
	    String[] array = result.toArray(new String[0]);
	    return array;
	}
	
	
	public Token[] convertStringToToken(String[] toConvert) {
		
		Token[] converted = new Token[toConvert.length];
		for (int i = 0; i < toConvert.length; i++) {
		
			
			if (PLUS.equals(toConvert[i])) {
				converted[i] = PLUS;
			}
			else if (MINUS.equals(toConvert[i])) {
				converted[i] = MINUS;
			}
			else if (MULTIPLY.equals(toConvert[i])) {
				converted[i] = MULTIPLY;
			}
			else if (DIVIDE.equals(toConvert[i])) {
				converted[i] = DIVIDE;
			}
			else if (OPENPARENTHESES.equals(toConvert[i])) {
				converted[i] = OPENPARENTHESES;
			}
			else if (CLOSEPARENTHESES.equals(toConvert[i])) {
				converted[i] = CLOSEPARENTHESES;
			}
			else {
				
				try {
					int value = Integer.parseInt(toConvert[i]);
					converted[i] = new Constant(toConvert[i], value);
				} catch (NumberFormatException e) {
					converted[i] = new Variable(toConvert[i]);
				}
			
			}
		
		}
		return converted;
		
	}
	
	
}
