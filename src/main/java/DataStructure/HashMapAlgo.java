package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlgo {
    public static void main(String[] args){

        //hashMapping();
        //TestMapwithString();
        hashMapMenu();
    }

    public static void hashMapMenu(){
        // Cafe sữa - 15000 VND
        // Trà đá - 3000 VND
        // Bún chả - 30000 VND
        // https://www.youtube.com/watch?v=il5uXicNvZo - Low G
        Map<String,Integer> thucdon = new HashMap<>();
        thucdon.put("Cafe sữa", 20000);
        thucdon.put("Trà đá", 3000);
        thucdon.put("Bún chả", 30000);

        System.out.println(thucdon);
        System.out.println(thucdon.get("Cafe sữa"));
        System.out.println(thucdon.values());

        for (String menu: thucdon.keySet()) {
            System.out.println(menu + " - " + thucdon.get(menu) + " VND");
        }

        if(thucdon.containsKey("Bún chả")){
            System.out.println("\n Tôi: Có bún chả hok??? \n Bé Tiểu nhị: Bún chả giá 30 cành ok hok anh?");
        }else{
            System.out.println("\n Tôi: Có bún chả hok em \n Bé Tiểu nhị: Dạ hok anh ơi");
        }
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
