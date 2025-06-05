package TestPrograms;

public class HDFC extends Bank{

	public HDFC(String name) {
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

}
