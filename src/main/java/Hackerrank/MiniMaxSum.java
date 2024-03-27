package Hackerrank;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long min = Collections.min(arr);
        long max = Collections.max(arr);

        // Calculate the sum
        for (int num : arr) {
            sum += num;
        }

        // Calculate the minimum and maximum sums
        long minSum = sum - max;
        long maxSum = sum - min;

        // Print the results
        System.out.println(minSum + " " + maxSum);
    }

    public static void miniMaxSum2(List<Integer> arr){
        // Write your code here
        Collections.sort(arr);
        long min=0;
        long max=0;
        for(int i=0, j=arr.size()-1; i<arr.size()-1;i++ ,j--){
            min+=arr.get(i);
            max+=arr.get(j);

        }
        System.out.print(min +" "+max);
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        miniMaxSum2(arr); // 10 14
    }

}
