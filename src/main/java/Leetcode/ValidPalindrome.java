package Leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        // Example usage:
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(isPalindrome(s1)); // Output: true
        System.out.println(isPalindrome(s2)); // Output: false
    }
    /*
        First of all you must understand what is Palindrome first ?


     */

    public static boolean isPalindrome2(String s){

        String fixed_string = "";

        for ( char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_string += c;
            }
        }

        fixed_string = fixed_string.toLowerCase();

        int a_pointer = 0;
        int b_pointer = fixed_string.length() - 1;

        while (a_pointer <= b_pointer){
            if(fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)){
                return  false;
            }

            a_pointer += 1;
            b_pointer -= 1;
        }

        return true;
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                // Compare characters ignoring case
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }

                left++;
                right--;
            }
        }
        return true;
    }
}
