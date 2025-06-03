package JavaFirstProject.inheritence;

public class ParentVehicleClass {
	
	String vehicleType ;
	int numOfSeats;
	double vehiclePrice;
	
	public double finalPrice(double p) {
		
			double tax = p * 0.5;
			this.vehiclePrice = p + tax;
			//System.out.println("Final Price including TAX is " + this.vehiclePrice);
			return this.vehiclePrice;	
	}
	
	public void freeService(String type) {
		
		this.vehicleType = type;
		System.out.println("Vehicle Type is " + this.vehicleType);
		
		switch(this.vehicleType){
			case "Car": 
				System.out.println("Free service for First Year Only!");
				break;
			case "Bus": 
				System.out.println("Free service for First Five Years!");
				break;
			default: 
				System.out.println("Free service for First Year Only!");
				break;
				
		}
		
	}

}
