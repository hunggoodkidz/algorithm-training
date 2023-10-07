package DataStructure;

import java.util.*;

public class TheArrays {
    public static void main(String[] args){
        String[] a = new String[5];

        a[0] = "You're";
        a[1] = "just";
        a[2] = "a";
        a[3] = "problem";
        a[4] = "to me!!";

        System.out.println(Arrays.toString(a));

        for ( int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

        System.out.println("\n");
        System.out.println("-- Reverse Cursed Technique --  反はん転てん術じゅつ式しき Hanten Jutsushiki ");
        for(int i = a.length - 1 ; i >= 0 ; i--){
            System.out.println(a[i]);
        }

        System.out.println("\n");
        System.out.println("For each loop");
        for(String b : a){
            System.out.println(b);
        }

        System.out.println("\n");
        System.out.println("Streaming!!!! ");
        // Convert the array 'a' into a stream of elements and
        // print each element to the console using forEach.
        Arrays.stream(a).forEach(System.out::println);
    }
}
