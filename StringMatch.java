// Custom exception class
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class StringMatch {
    public static void main(String[] args) {
        try {
            // Check if the string is "India"
            String input = "USA";
            if (!input.equals("India")) {
                throw new NoMatchException("Input string does not match 'India'.");
            } else {
                System.out.println("Input string is 'India'.");
            }
        } catch (NoMatchException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
