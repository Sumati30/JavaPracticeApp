package InterviewQuestions;
import java.util.Arrays;

public class ReverseAnArray {

	public static  int[] reverse(int[] arr) {
		//int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] reversedArray = new int[arr.length];
		for(int i=0; i < arr.length ; i++) {
			reversedArray[i] = arr[arr.length - 1 - i];
		}
		return reversedArray;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
        System.out.println(Arrays.toString(reverse(a)));
	}

}
