package InterviewQuestions;

import java.util.Arrays;

public class RemoveElement {

	 public static int removeElement(int[] nums, int val) {
		
		 int k = 0;
		 for(int i=0; i<nums.length; i++) {
			 if(nums[i] != val) {
				 nums[k] = nums[i];
				 k++;
			 }
		 }
		 System.out.println(Arrays.toString(nums));
	     return k;   
	 }

	    public static void main(String[] args){
	    	int[] arr = {1, 2, 3, 2, 1, 5, 6, 2, 8};
	        int val = 2;
	        int[] expectedNums = {1,1,3,5,6,8};
	        int expectedLegth = expectedNums.length;
	        
	        int k = removeElement(arr, val);
	        System.out.println(k);
	        System.out.println(Arrays.toString(arr));
	        
	        Arrays.sort(arr, 0, k);
	        Arrays.sort(expectedNums);
	        
	     // Assertion-like checks
//	        System.out.println("Returned Length: " + k);
//	        System.out.println("Modified Array (first " + k + " elements): " + Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
	        boolean isMatch = true;
	        if(expectedLegth == k ) {
	        	for(int i=0; i < k; i++) {
	        		if(arr[i] != expectedNums[i]) {
	        			isMatch = false;
	        			break;
	        		}
	        		
	        	}
	        }else {
	        	System.out.println("Does not match");
	        }
	        
	        if(isMatch) {
	        	System.out.println("Removed key from the original array!");
	        }else {
	        	System.out.println("Does not match");
	        }

	    }

}
