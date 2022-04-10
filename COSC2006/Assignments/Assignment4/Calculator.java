import java.util.Scanner;

/**
 * Simple calculator that reads infix expressions and evaluates them.
 *   @author
 *   @version
 */

public class Calculator
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    
        System.out.print("Enter an expression (or hit RETURN to stop): ");
	    String line = input.nextLine();
	    System.out.print("Is this expression infix(I) or postfix(P) (or hit RETURN to stop): ");
	    String type = input.nextLine();
	    
	    while (line.length() > 0 && type.length() > 0) {
	    	if(type.toUpperCase().charAt(0) == 'I') {
	    		Expression expr = new InfixExpression(line);
	    		
	    		if (expr.verify()) {
		            System.out.println(expr.evaluate());
		        }
		        else {
		            System.out.println("INVALID EXPRESSION");
		        }
	    	}
	    	
	    	else if(type.toUpperCase().charAt(0) == 'P') {
	    		Expression expr = new PostfixExpression(line);
	    	
	    		if (expr.verify()) {
		            System.out.println(expr.evaluate());
		        }
		        else {
		            System.out.println("INVALID EXPRESSION");
		        }
	    	}
	    	
	    	else {
	    		System.out.println("Invalid Type!!!");
	    	}
	    	
	    	System.out.print("Enter an expression (or hit RETURN to stop): ");
	        line = input.nextLine();
	        System.out.print("Is this expression infix(I) or postfix(P) (or hit RETURN to stop): ");
	        type = input.nextLine();
	    	
	    }

    	System.out.println();
	    System.out.println("DONE");
	}
}
