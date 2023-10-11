package DataStructure;

import java.util.Stack;

public class Stacks {
    /**
     * This is Stack visual which is one of the algorithm of Data Stucture
     *
     * push is you want to Store the elements inside
     *  pop is you want to Toss the elements outside
     *
     * extends with Vector <E> by its Generics way
     */

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.search(2));
        System.out.println(stack.empty());


        String input = "This text is reversed ";
        String reversed = reverseCursedTechnique(input);
        System.out.println(reversed);

    }

    public static String reverseCursedTechnique(String input) {

        if(input == null)
            return null;

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;
    }

}
