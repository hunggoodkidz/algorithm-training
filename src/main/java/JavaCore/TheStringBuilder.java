package JavaCore;

public class TheStringBuilder {

    public static void main (String[] args){
        String a = "Whatever";
        StringBuilder stringBuilder = new StringBuilder(a);

//        System.out.println(stringBuilder.append(" You want"));
//
//        System.out.println(stringBuilder.append(" You want"));

        System.out.println(stringBuilder.indexOf("t"));
    }

}
