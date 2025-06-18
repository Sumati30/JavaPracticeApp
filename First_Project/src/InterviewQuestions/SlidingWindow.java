package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindow {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 7, 8, 1, 4, 9}; //length = 8
		int size = 2;
		
		
	     //displayWindows(arr, size);
		ArrayList<Integer[]> list = displayWindows(arr, size);
		
		for(Integer[] ar:list) {
			System.out.println(Arrays.toString(ar));
		}
		

	}

	private static ArrayList<Integer[]> displayWindows(int[] arr, int size) {
		ArrayList<Integer[]> list = new ArrayList<>();
		
		for(int i=0; i <= arr.length - size ; i++) {
			//System.out.println( " ");
			Integer[] a = new Integer[size];
			int k = 0;
			for(int j=i; j <= size + i - 1; j++) {
				a[k]= arr[j];
				k++;
			}
			
			list.add(a);
			
		}
		
		return list;
		
	}
	
}
