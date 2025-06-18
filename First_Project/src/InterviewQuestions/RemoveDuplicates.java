package InterviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

		 public static HashSet<Integer> removeDuplicates(int[] nums) {
			 HashSet<Integer> s = new HashSet<>();
			 List<Integer> list = new ArrayList<>();
			 
			 for(int ele: nums) {
				 if(!s.contains(ele)) {
					s.add(ele);
					list.add(ele);
				 }
			 }
			 System.out.println("Set returns ordered or sorted values : "+s);
			 System.out.println("List does not : "+list);
		     return s;   
		 }

		    public static void main(String[] args){
		    	int[] arr = {1, 2, 3, 2, 1, 5, 6, 2, 8, 0, 2, 5, 8, 7, 4};
		        
		        
		        HashSet<Integer> k = removeDuplicates(arr);
//		       
		     
		    }

	}



