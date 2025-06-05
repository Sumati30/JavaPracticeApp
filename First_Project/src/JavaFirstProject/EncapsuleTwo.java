package JavaFirstProject;

public class EncapsuleTwo {

	public static void main(String[] args) {


		EncapsuleOne en = new EncapsuleOne();
		
		en.setSalary(1000);
		//en.setShiftTime("Evening");
		//en.setDomain("Front-end");
		
		//Private fields are only called using getters - ENcapsulation
		System.out.println("emp details from another class - " + "Name:" + en.getName() + " Salary:" + en.getSalary());
		
		//Public fields can be called directly
		System.out.println("emp details from another class - " + "Shift Timing:" + en.shiftTime + " Domain:" + en.domain);
		
		//en.empDetails(1400.50);
		
	}

}
