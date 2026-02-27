import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // insert into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // compare queue front and stack top
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}