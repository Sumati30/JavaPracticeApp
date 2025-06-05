package TestPrograms;

abstract public class Bank {
	
	public String name;
	public double rateOfInterest;
	private boolean isEligibleForLoan;
	private double income;
	
	public Bank(String name){
		this.name = name;
	}
	
	abstract public double calculateInterest(double rateOfInterest, double income);
	
	public void eligibleForLoan(double income) {
		this.income = income - (income * 0.08); //remove tax
		if(this.income >= 100) {
			System.out.println("Eligible for Loan");
        }else {
        	System.out.println("Not Eligible");
        }
	}
	
	abstract public void bankDetails(String name, double interest);

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
