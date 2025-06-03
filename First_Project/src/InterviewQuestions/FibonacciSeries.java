package InterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		/**  Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		 * If asks for first 10 values then n will be 10
		 * */
		
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<= 8; i++) { // n is 10, but taken 8 becoz already 2 values are there 0, 1 i.e a and b
			c = a + b;
			a = b; 
			b = c;
			System.out.println(c);
		}

	}

}
