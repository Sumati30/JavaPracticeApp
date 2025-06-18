package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArray {


			 public static int removeDuplicates(int[] nums) {
				 List<Integer> n = new ArrayList<Integer>();
				 int k =0;
				 for(int i=0; i< nums.length; i++) {
					 if(!n.contains(nums[i])) {
						 n.add(nums[i]);
						 k++;
					 }
				 }
				 //int[] unique = new int[n.size()];
			        int i = 0;
			        for (int num : n) {
			            nums[i++] = num;
			        }
			
			     return k;   
			 }

			    public static void main(String[] args){
			    	int[] arr = {-3,-1,0,0,0,3,3};
			        int[] exp = {-3,-1,0,3};
			        
			        int k = removeDuplicates(arr);
//			        System.out.println(Arrays.toString(arr));
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






