package Hackerrank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        // Example usage
        List<Integer> candles = List.of(4, 4, 1, 3);
        int result = birthdayCakeCandles(candles);
        System.out.println("Number of tallest candles: " + result); // Output: 2
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        // Find max of the value in index and count it

        int tallestCandlesCount = 0;
        int max = Collections.max(candles);
        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == max){
                tallestCandlesCount++;
            }
        }

       return tallestCandlesCount;

        //return Collections.frequency(candles, Collections.max(candles));
    }

}
