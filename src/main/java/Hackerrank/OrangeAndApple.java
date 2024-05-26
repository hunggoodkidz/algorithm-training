package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class OrangeAndApple {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        // s = start point,t = end point (red region)
        // a = apple tree b = orage tree
        // d ? - = left = right

        // List<Integer> left = new ArrayList<>();
        // List<Integer> right = new ArrayList<>();
        // int appleCount = 0;
        // int orangeCount = 0;
        // for (int i = 0; i < apples.size(); i++) {
        //     //System.out.println(a + apples.get(i));
        //     left.add(i, a + apples.get(i));
        //     if(s == left.get(i)){
        //         appleCount++;
        //     }
        // }
        // for (int i = 0; i < oranges.size(); i++) {
        //     //System.out.println(b + oranges.get(i));
        //     right.add(i, b + oranges.get(i));
        //     if(t == right.get(i)){
        //         orangeCount++;
        //     }
        // }
        // System.out.println(right);

        // System.out.println(appleCount);
        // System.out.println(orangeCount);



        // int left = 1;
        // int right = 1;

        //     System.out.print(s + " " + t + " " + a + " " + b + " " + apples + " " + oranges);


        // System.out.println(left);
        // System.out.println(right);

        int appleCounts = 0;
        int orangeCounts = 0;

        for (Integer apple : apples) {
            apple += a;
            if(apple >= s && apple <= t){
                appleCounts++;
            }
        }

        for (Integer orange : oranges) {
            orange += b;
            if(orange >= s && orange <= t){
                orangeCounts++;
            }
        }

        System.out.println(appleCounts);
        System.out.println(orangeCounts);

    }

}



