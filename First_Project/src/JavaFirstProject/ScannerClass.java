package JavaFirstProject;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
//      System.out.println("Enter value of X ");
//      int x = sc.nextInt();
//      System.out.println("Enter value of Y ");
//      int y = sc.nextInt();
//      int z = x + y;
//      System.out.println("Sum of X and Y is " + z);
      
      // String input
      
      System.out.println("Enter the name ");
      String name = sc.nextLine();
      System.out.println("Enter the age ");
      int age = sc.nextInt();
      System.out.println("Enter the place ");
      String place = sc.next();
      
      System.out.println("The name is " + name + " & the age is " + age + " & the place he/she belongs to is " + place);
	}

}
