
public class Postfixs {

	public static void main(String[] args) {
		
		String test1 = "432+9/-2*";
		String test2 = "4213+9/-2";
		String test3 = "4-23+9/2*";
		String test4 = "423+9/-2*+";
		String test5 = "43-4+";
		
		System.out.println(test(test1));
		System.out.println(test(test2));
		System.out.println(test(test3));
		System.out.println(test(test4));
		System.out.println(test(test5));
		
	}
	
	public static String test(String s) {
		
		int count = 0;
		int i = 0;
		while(i < s.length()) {
			
			if(Character.isDigit(s.charAt(i)))	count++;
			else	count--;
			
			if(count < 1 || ((i == s.length() -1) && count != 1)) return "This POSTFIX is Invalid!!!";
			
			i++;
		}
		
		return "This POSTFIX is Valid!!!!!";
	}
	
	
}
