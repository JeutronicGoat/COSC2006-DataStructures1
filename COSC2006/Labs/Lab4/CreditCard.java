
public class CreditCard {

	private String customerName;
	private long accountNum;
	private double accountBalance = 0.00;
	private double creditLimit = 5000.00;
	private int rewardPoints = 0;
	
	
	CreditCard(String cusName, long accNum){
		
		if(validNumberCheck(accNum)) {
			customerName = cusName;
			accountNum = accNum;
		}
		else {
			throw new InvalidAccountNumberException("Invalid Account Number!!");
		}
	}
	
	public boolean validNumberCheck(long accNum) {
		
		
		long testNum = accNum % 10;
		accNum /= 10;
		
		long[] nums = new long[15];
		for(int i = 0; i >= 13; i++) {
			if(accNum > 0) {	//ERROR Here don't know why?
				
				if((accNum % 2) != 0) {  
					nums[i] = (accNum % 10) * 2;	
					accNum /= 10;					
				}//Odd Number
				else {
					nums[i] = (accNum % 10);		
					accNum /= 10;
				}//Even Number
			}
		}
		
		for(int i = 0; i < 14; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		return true;
					
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


	public boolean purchase(double num) {
		if((accountBalance + num) <= creditLimit) {
			accountBalance += num;
			rewardPoints += 10;
			return true;
		}
		return false;
	}
	
	public boolean cashAdvance(double num) {
		if((accountBalance + num) <= creditLimit) {
			accountBalance += num;
			return true;
		}
		return false;
	}
	
	public void payment(double num) {
		accountBalance -= num;
	}
	
	@Override
	public String toString() {
		return accountNum + " (" + customerName + ")'s Credit Limit is " + creditLimit 
				+ ", Account Balance is " + accountBalance + ", and Reward Points are " + rewardPoints + ".";
	}
	
}
