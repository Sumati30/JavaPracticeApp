
package JavaFirstProject;

public class NonStatic1 {

	int x = 100;
	int y = 20;
	public void add() {
		 
		 int z = x + y ;
		 System.out.println("The Sum is "+ z);
	}
	
	public void sub() {
		 
		 int z = x - y ;
		 System.out.println("The Substraction is "+ z);
	}
	
	//Instantiation - process of creating an object
	// Object is an instance of class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // className obj = new className();
		//obj - variable name
		//className - calling a constructor
		
		NonStatic1 obj = new NonStatic1();
		nonStatic2 obj2 = new nonStatic2();
		obj.add();
		obj.sub();
		obj2.mul();
		obj2.div();
	}

}
