package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args){
        /*
        * Symbol       Value
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000
        * */


    }

    public static int romanToInt(String s){
        //stack
        //I II III IV V VI VII VIII IX X - 1 2 3 4 5 6 7 8 9 10
        int left = 0; // largest
        int right = 0; // smallest
        Map<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        // 4 is not IIII ban it
        for (char c : s.toCharArray()) {

        }
        return 0;
    }

    public static int  romanToIntSwitchCaseSolution(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
