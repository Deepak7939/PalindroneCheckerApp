public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // normalize: remove non-letters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        // compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}