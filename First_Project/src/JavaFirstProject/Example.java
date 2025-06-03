package JavaFirstProject;

public class Example {
	
	static int x = 100;
	static int y = 20;
	
	public static void add() {
		
		int z = x + y ;
		System.out.println("The Sum is "+ z);
	}
	
	public static void sub() {
		
		int z = x - y ;
		System.out.println("The Diff is "+ z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        add();
        sub();
        ExampleWithoutMain.multiplication();
        ExampleWithoutMain.division();
        ExampleWithoutMain2.mod();
        ExampleWithoutMain2.division();
	}
}
