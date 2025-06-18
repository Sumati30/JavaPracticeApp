package InterviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates3 {

		 public static int removeDuplicates(int[] nums) {
			 HashSet<Integer> set = new HashSet<>();
			 int k = 0;
			 for(int ele: nums) {
				 set.add(ele); // HashSet automatically handles duplicates , so no need to use contains to check dup
			 }

			 //int[] result = new int[set.size()];
		        
		        for (int num : set) {
		            nums[k++] = num;
		        }

		        return k;   
		 }

		    public static void main(String[] args){
		    	int[] arr = {-3,-1,0,0,0,3,3};
		        int[] exp = {-3,-1,0,3};
		        
		        int k = removeDuplicates(arr);
		        System.out.println(Arrays.toString(arr));
		        Arrays.sort(exp);
		        Arrays.sort(arr, 0, k);
		        
		        System.out.println(Arrays.toString(arr));
		        System.out.println(Arrays.toString(exp));
		        boolean isMatch = true;
		        if(exp.length == k) {
		        	for(int i=0; i<k ; i++) {
		        		if(exp[i] != arr[i]) {
		        			isMatch = false;
		        			break;
		        		}
		        	}
		        	
		        }else {
		        	isMatch = false;
		        	System.out.println("Doesn't");
		        }
		        
		        if(isMatch) {
		        	System.out.println("Matches");
		        }
		        
		        
		    }

	}



