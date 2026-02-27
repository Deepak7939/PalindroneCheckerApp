public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeService service = new PalindromeService();

        if (service.checkPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

// service class containing palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}