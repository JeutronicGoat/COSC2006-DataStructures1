
public class RecursiveFun {

	
	public static void main(String[] args) {
		
		triangle(3,5);
		System.out.println();
		
		secNumbers("Book", 2);
		System.out.println();
		
		System.out.println(bears(250));
		System.out.println();
		
		binaryPrint(10);
		System.out.println("\n");
		
		numbers("1001", 3);
		
		
	}
	
//************************************************************************************	//Question#1
	
	public static void triangle(int startNum, int endNum) {			
		
		if(startNum == endNum + 1)return;
		
		for(int i = 0; i < startNum; i++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
		triangle(startNum + 1, endNum);
		
		for(int i = startNum; i > 0; i--) {
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
//************************************************************************************	//Question#2
	
	public static void secNumbers(String prefix, int levels) {
		
		if(levels == 0) return;
		
		
		if(levels > 1) {
			
			String s = "";
			for (int currLvl = 1; currLvl <= 9; currLvl++) {
				s = prefix + currLvl + ".";
				secNumbers(s, levels -1);
			}
		}
		else {
			String s = "";
			for (int currLvl = 1; currLvl <= 9; currLvl++) {
				s = prefix + currLvl + ".";
				System.out.println(s);
				
			}
		}
		
		
		
	}
	
//************************************************************************************	//Question#3
	
	public static boolean bears(int n) {
		
		if(n == 42) return true;
		
		if(n % 2 == 0) {
			return bears(n / 2);
		}
		else if(n % 3 == 0 || n % 4 ==0) {
			return bears((n % 100) * (n % 10));
		}
		else if(n % 5 == 0) {
			return bears(42);
		}
		
		return false;
		
	}
	
//************************************************************************************	//Question#4
	
	public static void binaryPrint(int n) {
		
		if(n < 0) {
			System.out.println("ERROR: n Cannot be less than 0.");
			return;
		}
		if(n == 2) {
			System.out.print(10);
			return;
		}
		if(n == 1) {
			System.out.print(1);
			return;
		}
		if(n == 0) { 
			System.out.print(0);
			return;
		}
		
		binaryPrint(n / 2);
		System.out.print(n % 2);
	}
	
//************************************************************************************	//Question#5
	
	public static void numbers(String prefix, int k) {
		
		if(k == 0) {
			return;
		}
		
		if(k > 1) {
			numbers(prefix + "1", k - 1);
			numbers(prefix + "0", k - 1);
		}
		else {
			System.out.println(prefix + "1");
			numbers(prefix + "1", k - 1);
		
			System.out.println(prefix + "0");
			numbers(prefix + "0", k - 1);
		}
	}
	
}
