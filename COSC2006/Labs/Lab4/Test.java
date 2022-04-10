
public class Test {

	
	public static void main(String[] args) {
	
		CreditCard cc = new CreditCard("Jimmy", 1000200030004000L);
		
		if(!cc.purchase(4799.50)) System.out.println("Declined!");	System.out.println(cc);
		
		
		cc.cashAdvance(100.50);	System.out.println(cc);
		
		cc.payment(100);	System.out.println(cc);
		
		if(!cc.purchase(200)) System.out.println("Declined!");	System.out.println(cc);
		
		if(!cc.purchase(1)) System.out.println("Declined!");	System.out.println(cc);
		
		
		
	}
	
}
