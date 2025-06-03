package InterviewQuestions;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find Factorial ");
		int n = s.nextInt();
		int facto = 1;
		for(int i=1; i<=n; i++) {
			facto = facto * i;
		}
		System.out.println("Factorial of " + n + " is : " + facto);

	}

}
