import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar"; [cite: 34]
        char[] chars = input.toCharArray(); [cite: 35, 36]

        int start = 0; [cite: 37]
        int end = chars.length - 1; [cite: 39]
        boolean isPalindrome = true; [cite: 41]

        while (start < end) { [cite: 42]
            if (chars[start] != chars[end]) { [cite: 8, 21]
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input); [cite: 44]
        System.out.println("Is Palindrome?: " + isPalindrome); [cite: 45]

    }
}