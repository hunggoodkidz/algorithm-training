package Leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid3("()"));          // Output: true
        System.out.println(solution.isValid3("()[]{}"));      // Output: true
        System.out.println(solution.isValid3("(]"));          // Output: false
    }


    public boolean isValid3(String s ){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if(c == '('){
                stack.push(')');
            }
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }

    public boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Invalid character or mismatched brackets
            }
        }
        return stack.isEmpty(); // If the stack is empty, all brackets are properly closed
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if (c == '['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != c){
                return false; // Invalid character or mismatched brackets
            }

        }
        return stack.isEmpty(); // If the stack is empty, all brackets are properly closed
    }

}
