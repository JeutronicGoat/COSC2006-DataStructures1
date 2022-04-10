
public class Number3 {

	
	public static void main(String[] args) {
		
		System.out.println("The Lowest ASCII Value is: " + minChar("hello"));
		System.out.println("The Lowest ASCII Value is: " + minChar("Goodbye"));
		System.out.println("The Lowest ASCII Value is: " + minChar("WoNdErFuL"));
		
		
		
		
		//printNumReverse(24680);
		//printNumReverse(-24680);
		//printNumReverse(12340);
	}
	
	public static char minChar(String s) {
		
		if(s.length() == 1) return s.charAt(0);
		
		if(s.charAt(0) < s.charAt(s.length() - 1)) return minChar(s.substring(0, s.length() - 1));
		
		return minChar(s.substring(1));
	}
	
	public void printNumReverse(int num) {
		
		
	}
}
