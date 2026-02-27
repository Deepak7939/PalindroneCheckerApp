import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        // add characters to the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare from both ends
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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