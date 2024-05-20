import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Input the substring to be replaced
        System.out.print("Enter the substring to be replaced: ");
        String oldSubstring = scanner.nextLine();

        // Input the new substring
        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();
        
        scanner.close();

        // Perform the replacement
        String replacedString = originalString.replace(oldSubstring, newSubstring);

        // Output the result
        System.out.println("Original string: " + originalString);
        System.out.println("String after replacement: " + replacedString);
    }
}
