package InterviewQuestions;

public class ReverseNumber {
	
	public static int reverse(int n) {
		int reversedNum = 0;
		while(n != 0) {
			int temp = n % 10;
			reversedNum = reversedNum * 10 + temp ;
			n = n/10 ;
		}
		return reversedNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 687;
       System.out.println(reverse(num));
	}

}
