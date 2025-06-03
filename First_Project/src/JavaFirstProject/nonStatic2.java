package JavaFirstProject;

public class nonStatic2 {
	NonStatic1 obj = new NonStatic1();
	public void mul() {
		 
		 int z = obj.x * obj.y ;
		 System.out.println("The Multiplication is "+ z);
	}
	
	public void div() {
		 
		 int z = obj.x / obj.y ;
		 System.out.println("The Division is "+ z);
	}

}
