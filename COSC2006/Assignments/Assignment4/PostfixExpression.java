import java.util.Stack;

public class PostfixExpression extends Expression{

	public PostfixExpression(String expr) {
		super(expr);
	}

	@Override
	public boolean verify() {
		int count = 0;
		
		for(int i = 0; i < tokens.size(); i++) {
			if(isInteger(tokens.get(i))) count++;
			else if(isOperator(tokens.get(i))) count--;
			else return false;
			
			if(count < 0) return false;
		}
		
		if(count == 1) return true;
		return false;
	}

	@Override
	public int evaluate() {
		
		Stack<Integer> s = new Stack<Integer>();
		int operand1 = 0;
		int operand2 = 0;
		
		for(int i = 0;  i < tokens.size(); i++) {
			if(isInteger(tokens.get(i))) s.push(Integer.parseInt(tokens.get(i)));
			else if(isOperator(tokens.get(i))) {
				operand2 = s.pop();
				operand1 = s.pop();
				switch(tokens.get(i).charAt(0)) {
					case '+':	s.push(operand1 + operand2); break;
					case '-':	s.push(operand1 - operand2); break;
					case '/':	s.push(operand1 / operand2); break;
					case '*':	s.push(operand1 * operand2); break;
				}
			}
		}
		return s.pop();
	}

}
