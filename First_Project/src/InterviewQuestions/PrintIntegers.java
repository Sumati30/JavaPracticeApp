package InterviewQuestions;

import java.util.Arrays;

public class PrintIntegers {
	
	public static void printInts() {
		String str = "1425638";
		int[] arr = new int[str.length()];
		
		//Prints only integers not array
//		for(char c:str.toCharArray()) {
//			if(Character.isDigit(c)) {
//				System.out.println(Character.getNumericValue(c));
//				//return Character.getNumericValue(c);
//			}
//		}
		
		//To print integer array
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				System.out.println(Character.getNumericValue(str.charAt(i)));
				arr[i] = Character.getNumericValue(str.charAt(i));
				//return Character.getNumericValue(c);
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "1253678";
          printInts();
	}

}
