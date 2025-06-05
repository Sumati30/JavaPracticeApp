package TestPrograms;

public class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}


	@Override
	public double calculateInterest(double rateOfInterest, double income) {
	     return (rateOfInterest/100 * income) + income;	
	}
	
	@Override
	public void bankDetails(String name, double interest) {
		System.out.println("Bank is " + name + " and the rate of interest is " + interest );
	}

	public static void main(String[] args) {
		Bank obj;
		obj = new SBI("SBI");
		
        System.out.println(obj.calculateInterest(8, 500));
        obj.bankDetails(obj.name, 8);
        obj.eligibleForLoan(50);
        
        obj = new HDFC("HDFC");
        
        System.out.println(obj.calculateInterest(9, 500));
        obj.bankDetails(obj.name, 9);
        obj.eligibleForLoan(500);
        
       
	}


	
}


