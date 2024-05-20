public class CommandLineArguments {
    public static void main(String[] args) {
        try {
            // Check if exactly two command line arguments are provided
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two command line arguments.");
            }

            // Parse the command line arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Check if the second argument is 0
            if (num2 == 0) {
                throw new ArithmeticException("Second command line argument cannot be zero.");
            }

            // Calculate the result of division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            // Handle exception for invalid integer format
            System.out.println("Please provide valid integers as command line arguments.");
        } catch (ArithmeticException e) {
            // Handle exception for division by zero
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle exception for incorrect number of command line arguments
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please provide exactly two command line arguments.");
        }
    }
}
