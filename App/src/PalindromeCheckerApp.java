public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String text = "level";
            String reversed = "";

            // build reversed string
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }

            // compare original and reversed
            if (text.equals(reversed)) {
                System.out.println(text + " is a palindrome.");
            } else {
                System.out.println(text + " is not a palindrome.");
            }
        }
    }