package InterviewQuestions;

import java.util.Arrays;

public class SumOfAllDigits {
	
	//Sum of Digits (Positive and Negative)
	public static int sum(int num) {
		int n = Math.abs(num); //handle negative numbers
//		System.out.println(num);
//		System.out.println(n);
		int sum = 0;
		while(n != 0 ) {
			int temp = n % 10;
			sum += temp;
			n = n / 10;
		}
		return sum;
	}
	
	// Sum Of Digits by Recursive
	public static int recursiveSum(int num) {
		
		if( num == 0) return 0;
		else return (num % 10) + recursiveSum(num / 10);
		
		//return 0;
	}
	
	//Method 1 : Sum of digits of a String
	public static int sumOfStrings(String str) {
		//String str = "12abc345";
		int sum = 0;
		for(int i=0; i < str.length() ; i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				sum += Character.getNumericValue(str.charAt(i));
			}
		}
		
		return sum;
	}
	
	//Method 2 : Sum of digits of a String
	
	public static int sumOfStringsMethod2(String str) {
		//String str = "12abc345";
		int sum = 0;
		for(char c:str.toCharArray()) {
			
			if(Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		
		return sum;
	}
	
	public static int sumOfOnlyDigits(String str) {
		//String str = "12abc345";
		int sum = 0;
		for(char c:str.toCharArray()) {
			
			if(Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}else if( c == '.') { //Used to ignore decimal digits
				return sum;
			}else {
				continue;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int n = -123;
		System.out.println(sum(n));
		
		System.out.println(recursiveSum(1234));
		
		System.out.println(sumOfStrings("583dbh09.4"));
		
		System.out.println(sumOfStringsMethod2("-46sb23n5.4"));
		
		System.out.println(sumOfOnlyDigits("-45g5.4"));
	}

}
