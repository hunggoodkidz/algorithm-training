package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class TeaTimeWithLists {
    // String , ? , integer,...
    public static void main(String[] args){
        List<String> bubu = List.of(
                "Anh",
                "Yeu",
                "Em"
        );

        //bubu.add("Rat nhieu!!!");
        List<String> arrayList = new ArrayList<>();

        arrayList.add("bexuanmailonton");
        arrayList.add("I wish I had a girlfriend!");
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("bexuanmailonton"));
        System.out.println(arrayList);

        for (String array : arrayList){
            System.out.println(array);
        }

        arrayList.forEach(System.out::println);


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }



    }



}
