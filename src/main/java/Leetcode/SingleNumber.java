package Leetcode;

public class SingleNumber {
    public static void main(String[] args){
//        Input: [4, 1, 2, 1, 2]
//
//        a = 0
//        a ^= 4 (a = 0 ^ 4 = 4)
//        a ^= 1 (a = 4 ^ 1 = 5)
//        a ^= 2 (a = 5 ^ 2 = 7)
//        a ^= 1 (a = 7 ^ 1 = 6)
//        a ^= 2 (a = 6 ^ 2 = 4)

        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println("The single number is: " + result);
    }

    public static int singleNumber(int[] nums) {
        int a = 0; // Initialize a variable a to 0 to store the result.

        for (int i = 0; i < nums.length; i++) {

            // Using a for loop to iterate through the array nums.

            // Perform a bitwise XOR (^) operation between the current value of a
            // and the current element in nums. This effectively cancels out
            // numbers that appear twice and leaves only the single number.

            a ^= nums[i];
        }
        return a;
    }
}
