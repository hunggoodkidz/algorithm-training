package Leetcode;



public class TwoSum {
    public static void main(String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int a[] = twoSum(nums, target);
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
    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2]; // add 2  list with return int[];

        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[i] + nums[j] == target){ // This is technical TwoSum man, it's like nums + nums
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
