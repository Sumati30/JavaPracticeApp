package JavaFirstProject.inheritence;

public class InheritanceExample {
     public double finalPriceOfCar; // Non-Static variables need obj to access
     static double finalPriceOfBus; // Static variables can be accessed without obj

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChildCarClass gc = new GrandChildCarClass();
		ChildBusClass cc = new ChildBusClass();
		InheritanceExample obj = new InheritanceExample();
		
		gc.freeService("Car");
		obj.finalPriceOfCar = gc.finalPrice(900);
		//System.out.println("Final Price including TAX is " + gc.finalPrice(500));
		System.out.println("Final Price including TAX is " + obj.finalPriceOfCar);

		cc.freeService("Bus");
		finalPriceOfBus = cc.finalPrice(1100);
		System.out.println("Final Price including TAX is " + finalPriceOfBus);
		
	}

}
