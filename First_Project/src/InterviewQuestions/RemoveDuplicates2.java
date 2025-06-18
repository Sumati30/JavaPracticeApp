package InterviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates2 {

		 public static int[] removeDuplicates(int[] nums) {
			 HashSet<Integer> set = new HashSet<>();
			 
			 for(int ele: nums) {
				 set.add(ele); // HashSet automatically handles duplicates , so no need to use contains to check dup
			 }

			 int[] result = new int[set.size()];
		        int i = 0;
		        for (int num : set) {
		            result[i++] = num;
		        }

		        return result;   
		 }

		    public static void main(String[] args){
		    	int[] arr = {1, 2, 3, 2, 1, 5, 6, 2, 8, 0, 2, 5, 8, 7, 4};
		        int[] exp = {1, 2, 3, 5, 6, 8, 0, 7, 4};
		        
		        int[] k = removeDuplicates(arr);
		        System.out.println(Arrays.toString(k));
		        System.out.println(Arrays.toString(exp));
		        Arrays.sort(exp);
		        boolean isMatch = true;
		        if(exp.length == k.length) {
		        	for(int i=0; i<k.length ; i++) {
		        		if(exp[i] != k[i]) {
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



