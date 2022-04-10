import java.io.*;
import java.util.Scanner;

public class Bank {

	static int[] customerNum = new int[200];
	
	static char[] accountType = new char[200];
	
	static double[] balance = new double[200];
	
	static int count;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ReadData();
		
		char command;
		do {
			
			System.out.print("Please Enter a Command, Search(S), Print Total Balcances(P), or Quit(Q): ");
			
			command = GetCommand();
			ExecuteCommand(command);
			
		} while(command != 'Q');
		
		in.close();
		
	}
	
//****************************************************************************************

	public static void ReadData() { 			//Gather data into arrays
		
		File file = new File("src/a1data.txt");
			
			try(Scanner in = new Scanner(file)) {
				
				count = 0;
				
				while(count < 200 && in.hasNext()) {
			
					customerNum[count] = in.nextInt();
					accountType[count] = in.next().charAt(0);
					balance    [count] = in.nextDouble();
					
					count++;
				}
			
			} catch (FileNotFoundException fnfe) {
				System.out.println("Error: The File: 'a1data.txt' was not found.");
			}catch (Exception e){
				System.out.println("An Unknown Error Has Occurred.");
			}
	}
	
//****************************************************************************************
	
	public static char GetCommand() {
		
		Scanner in = new Scanner(System.in);
		
		String temp = in.next().toUpperCase();
		
		if(temp.length() > 1) {
			return 'E';
		}
		
		char command = temp.charAt(0);
		switch(command) {
			case 'S': return 'S';
			case 'P': return 'P';
			case 'Q': return 'Q';
			default : return 'E';
		}
	}
	
	
	public static void ExecuteCommand(char command) {
		
		switch(command) {
			case 'Q': System.out.println("Thank You For Using Our Services!"); break;
			case 'E': System.out.println("ERROR: You Must Enter A 'Single Character', (S), (P), or (Q)."); break;
			case 'S': Search(); break;
			case 'P': Print();  break;
		}
		
		
	}
	
//****************************************************************************************	
	
	public static void Search() {
		
		System.out.print("Please Enter A (Customer # or '0') and (Account Type or 'X'): ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		char type = in.next().toUpperCase().charAt(0);
		
		System.out.printf("Customer #     Account Type   Account Balance\n");
		
		if(num == 0 && type == 'X') {	//Print All
			
			for(int i = 0; customerNum[i] !=0; i++) {
				System.out.printf("%-15d%-15c%.2f\n",customerNum[i],accountType[i],balance[i]); 
			}
		}
		else if(num == 0) {				//Specific Account Type
			
			for(int i = 0; customerNum[i] !=0; i++) {
				if(accountType[i] == type) {
					System.out.printf("%-15d%-15c%.2f\n",customerNum[i],accountType[i],balance[i]); 
				}
			}
		}
		else if(type == 'X') {			//Specific Customer #
			
			for(int i = 0; customerNum[i] !=0; i++) {
				if(customerNum[i] == num) {
					System.out.printf("%-15d%-15c%.2f\n",customerNum[i],accountType[i],balance[i]); 
				}
			}
		}
		else {							//Specific Account Type and Customer #
			
			
			for(int i = 0; customerNum[i] !=0; i++) {
				if(accountType[i] == type && customerNum[i] == num) {
					System.out.printf("%-15d%-15c%.2f\n",customerNum[i],accountType[i],balance[i]); 
				}
			}
		}
		System.out.println();
	}
	
//****************************************************************************************
	
	public static void Print() {
		Sort();
		
		System.out.printf("Customer #     Account Balance\n");
		
		int[] uniqueCustNum = new int[200];
		double[] totalBalance = new double[200];
		
		
		uniqueCustNum[0] = customerNum[0];
		int custNumIndex = 1;
		
		for(int i = 1; i < count; i++) {						//Gather all Unique Customers
			
			if(customerNum[i] == customerNum[i - 1]) {}
			else {
				uniqueCustNum[custNumIndex] = customerNum[i];
				custNumIndex++;
			}
		}
		
		for(int i = 0; uniqueCustNum[i] !=0; i++) {				//Add the balances of all accounts 
																//Belonging to each unique customer
			for(int j = 0; customerNum[j] !=0; j++) {			//And Gather them into a total balance
				
				if(uniqueCustNum[i] == customerNum[j]) {
					totalBalance[i] += balance[j];
				}
			}
		}
		
		
		for(int i = 0; uniqueCustNum[i] !=0; i++) {				//Display unique customer and their total balance
			System.out.printf("%-15d%-15.2f\n",uniqueCustNum[i],totalBalance[i]); 
		}
		
		System.out.println();
	}
	
//****************************************************************************************	
	
	public static void Sort() {					//InerstionSort data
		
		 
        for (int i = 1; i < count; ++i) { 
        	
            int num = customerNum[i]; 
            char c = accountType[i];
            double dub = balance[i];
            
            int j = i - 1; 
  
            while (j >= 0 && customerNum[j] > num) { 
            	
            	customerNum[j + 1] = customerNum[j];
            	accountType[j + 1] = accountType[j];
            	balance[j + 1] = balance[j];
            	
                j--; 
            } 
            customerNum[j + 1] = num; 
            accountType[j + 1] = c;
            balance[j + 1] = dub;
        } 
	}
	
}
