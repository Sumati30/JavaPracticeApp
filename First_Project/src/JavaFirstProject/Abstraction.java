package JavaFirstProject;

public abstract class Abstraction {
   public void add() {
	   int a=10;
	   int b= 20;
	   System.out.println("The sum is: " + (a + b));
   }
   
   public abstract void sub();
   
   public abstract void multiplication();
}
