
public class Reccurence {

	
	
	public static void main(String[] args) {
		
		System.out.println(F(6));
		System.out.println(F(7));
		System.out.println(F(10));
		System.out.println(F(12));
		
		System.out.println();
		
		System.out.println(I(6));
		System.out.println(I(7));
		System.out.println(I(10));
		System.out.println(I(12));
		
		System.out.println();
		
		PrintTopStars(4);
		PrintBottomStars(4);
		
		System.out.println();
		
		PrintBothStars(4);
		
	}
	
	public static int F(int n) {
		
		switch(n) {
			case 1:  return 1; 
			case 2:  return 2;
			case 3:  return 3;
			case 4:  return 2;
			case 5:  return 2;
			default: return 2 * F(n-1) + F(n-5);
		}
		
	}
	
	public static int I(int n) {		//Precondition: n >=6
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 2;
		int e = 2;
		int current = 2 * e + a;

		for(int i = 6; i < n; i++) {
			a = b;
			b = c;
			c = d;
			d = e;
			e = current;
			current = 2 * e + a;
		}
		
		return current;
		
	}
	
	public static void PrintTopStars(int n) {
		
		if(n==0)return;
		
		PrintTopStars(n-1);
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	
	public static void PrintBottomStars(int n) {
		
		if(n==0)return;
		
		for(int i = n; i > 0; i--) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
		PrintBottomStars(n-1);
		
	}
	
	public static void PrintBothStars(int n) {
		
		if(n==0)return;
		
		for(int i = n; i > 0; i--) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
		PrintBothStars(n-1);
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
	}
}
