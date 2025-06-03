package InterviewQuestions;

public class SwappingOne {

	public static void main(String[] args) {
		
    /** There are three ways we can swap values --
     * 1. with temporary variable
     * 2. By using Arithmetic 
     * 3. By using XOR operation
     * **/
		//1. Swapping with temporary variable
		int a = 5;
		int b = 8;
		System.out.println("Value of a and b before swapping - a:" +  a + ", b:" + b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a and b after swapping - a:" +  a + ", b:" + b);
		
		//2. Swapping By using Arithmetic ;
		
		int x = 10;
		int y = 5;
		
		x = x+y; //15
		y = x - y; //10
		x = x - y; //5
		System.out.println("Value of x and y after swapping - x:" +  x + ", y:" + y);
		
		//3. By using XOR operation
		/* in XOR  is true when either of the input is true, else it is false.
		 * 0 0 = 0
		 * 0 1 = 1
		 * 1 0 = 1
		 * 1 1 = 0
		 * */
		int m = 3; // in binary 3 is 0011
		int n = 4; // in binary 4 is 0100
		           // --------------------
		 m = m ^ n;//                0111 which is m = 7
		           //                0100
		           //-----------------------------------
		 n = m ^ n; //               0011 which is n = 3
		            //               0111
		            //----------------------------------
		 m = m ^ n; //               0100 which is m = 4
	}

}
