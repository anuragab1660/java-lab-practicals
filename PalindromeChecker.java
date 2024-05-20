public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Continue comparing characters until left meets right
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at left and right are not equal, so not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters match, so it's a palindrome
    }
}
