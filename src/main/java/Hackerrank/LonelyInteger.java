package Hackerrank;

import java.util.*;

public class LonelyInteger {

    public static void main(String[] args) {
        // Example usage:
        //int[] arr = {1, 2, 3, 4, 3, 2, 1};
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        int result = lonelyInteger(arr);
        int result2 = xorMethod(arr);
        int result3 = sortArrayMethod(arr);
        System.out.println("Lonely Integer: " + result);
        System.out.println("Xor Method's Lonely Integer: " + result2);
        System.out.println("Sorted Array: " + result3);
    }

    public static int lonelyInteger(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>(); // Map <Key, Value> Example <Bún bò, 20000> means Key: Bún bò worth 20k in value

        // Count the frequency of each element in the array

        for (int num : arr) {
            // Frequency method
            //frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        // Find the lonely integer with a frequency of 1
        // What is Entry ?
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no lonely integer is found, return -1 (or any appropriate default value)
        return -1;
    }

    public static int xorMethod(List<Integer> arr){
        int result = 0;
        for ( Integer num : arr) {
            result ^= num;
        }

        return result;
    }

    public static int sortArrayMethod (List<Integer> arr){
        //https://www.youtube.com/watch?v=6lWyyPrvkvI
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 2; i += 2) {
            if(arr.get(i) != arr.get(i + 1)){
                return arr.get(i);
            }
        }

        return arr.get(arr.size() - 1);
    }
}
