import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "civic"; [cite: 39]

            Queue<Character> queue = new LinkedList<>(); [cite: 41]
            Stack<Character> stack = new Stack<>(); [cite: 42]

            for (char c : input.toCharArray()) { [cite: 43]
                queue.add(c); [cite: 6]
                stack.push(c); [cite: 7]
            }

            boolean isPalindrome = true; [cite: 45]

            while (!queue.isEmpty()) { [cite: 47]
                if (!queue.poll().equals(stack.pop())) { [cite: 8, 13]
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input: " + input); [cite: 49]
            System.out.println("Is Palindrome?: " + isPalindrome); [cite: 50]
    }
}