package School;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        // Create a Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display the result
        System.out.println("Ignoring non-alphanumeric characters, \nis "
                + s + " a palindrome? " + isPalindrome(s));
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Create a new string by removing non-alphanumeric characters
        String s1 = filter(s);

        // Create a new string that is the reverse of s1
        String s2 = new StringBuilder(s1).reverse().toString();

        // Check if the reversed string is the same as the original string
        return s1.equals(s2);
    }

    // Method to remove non-alphanumeric characters from a string
    public static String filter(String s) {
        // Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        // Return the filtered string
        return stringBuilder.toString();
    }
}
