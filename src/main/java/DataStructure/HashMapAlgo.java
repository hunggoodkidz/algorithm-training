package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlgo {
    public static void main(String[] args){

        hashMapping();
        //TestMapwithString();

    }


    public static void TestMapwithString(){
        Map<String,Person> map = new HashMap<>();

        map.put("One", new Person("Wibu1"));
        map.put("Two", new Person("Wibu2"));
        map.put("Three", new Person("Wibu3"));

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
    public static void hashMapping(){
        Map<Integer,Person> map = new HashMap<>();

        map.put(1, new Person("Wibu1"));
        map.put(2, new Person("Wibu2"));
        map.put(3, new Person("Wibu3"));

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
    record Person(String name){}
}
