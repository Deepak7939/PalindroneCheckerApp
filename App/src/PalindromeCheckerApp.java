public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        if (check(input, 0, input.length() - 1)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // recursive palindrome check
    private static boolean check(String s, int start, int end) {

        // base case: all characters checked
        if (start >= end) {
            return true;
        }

        // mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}