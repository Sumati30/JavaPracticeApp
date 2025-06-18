package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int findNum = target - nums[i];
             
             if(map.containsKey(findNum)){
                return new int[]{ map.get(findNum), i};
             }

             map.put(nums[i], i); 
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {2,5,7,8};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res);
        System.out.println(Arrays.toString(res));
    }
}