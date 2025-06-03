package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class FindKeyInArray {
	
	
	
	//Linear search - When we have assorted array
	public static boolean findKeyByLinearSearch(int[] arr, int key) {		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Array includes Key");
				return true;
			}
		}
		return false;
	}
	
	//Binary Search - array should be in ascending order and sorted
	
   public static boolean findKeyByBinarySearch(int[] arr, int key) {		
		
		int result = Arrays.binarySearch(arr, key);
		System.out.println(result);
		if(result >= 0) {
			return true;
		}
		return false;
	}
   
   private static boolean findKeyInStrinArray(String[] strArr, String strKey) {

       for( String s : strArr) {
    	   //System.out.println(s);
    	   if(s.equals(strKey)) {
           	return true;
           }
       }
		return false;
	}
   
   //Find key in List
   private static boolean findKeyInIntegerList(List<Integer> nums, int intkey) {
		// TODO Auto-generated method stub
		
		if(nums.contains(intkey)) {
			return true;
		}
		return false;
	}	
	
	private static boolean findKeyInIntegerList(List<String> fruits, String keyFruit) {

		if(fruits.contains(keyFruit)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		int[] arr2 = {1,20,8,5,57,60};
		int key = 20;
        //boolean found = findKey(arr, key);
        
        System.out.println(findKeyByLinearSearch(arr2, key) ? "Found key by Linear search" : "Didn't find Key");
        System.out.println(findKeyByBinarySearch(arr, key) ? "Found key by Binary search" : "Didn't find Key");
        
        
        //Search in Strings
        
        String[] strArr = {"apple", "banana", "orange", "kiwi"};
        String strKey = "kiwi";
        System.out.println(findKeyInStrinArray(strArr, strKey) ? "Found key in Strings Array" : "Didn't find Key");
        
        
        //Search in List
        
        List<Integer> nums = Arrays.asList(10,20,30);
        int intkey = 10;
        System.out.println(findKeyInIntegerList(nums, intkey) ? "Found key in Integer List" : "Didn't find Key");
        
        List<String> fruits = Arrays.asList("bananan", "apple", "kiwi");
        String keyFruit = "apple";
        System.out.println(findKeyInIntegerList(fruits, keyFruit) ? "Found key in Strings List" : "Didn't find Key");
        
        
        //Search in 2D array
        
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            int matrixKey = 5;

            System.out.println(search(matrix, matrixKey) ? "Key found in 2D array!" : "Key not found.");
        
	}

	private static boolean search(int[][] matrix, int key) {

		for (int[] row : matrix) {
            for (int value : row) {
                if (value == key) {
                    return true;
                }
            }
        }
		return false;
	}

	

}
