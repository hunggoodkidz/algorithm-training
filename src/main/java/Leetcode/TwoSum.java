package Leetcode;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        //int a[] = twoSum(nums, target);
        int a[] = twoSumHashMap(nums,target);
        System.out.println("Output: [" + a[0] + "," + a[1] + "]");
    }

//    Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]

    public static int[] twoSumHashMap(int[] nums, int target){
        // Create a hashmap to store numbers and their indices.
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement needed to reach the target.

            // Check if the complement exists in the hashmap (i.e., we've seen it before).
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i}; // Return the indices of the two numbers.
            }

            numToIndex.put(nums[i], i); // Add the current number and its index to the hashmap.
        }

        // If no solution is found, return an empty array or handle it as needed.
        return new int[0];
    }
    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2]; // add 2  list with return int[];

        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[i] + nums[j] == target){ // This is technically TwoSum man, it's like nums + nums
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
