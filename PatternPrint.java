public class PatternPrint {
    public static void main(String[] args) {
        int rows = 6;

        // Upper part of the pattern
        for (int i = 1; i <= rows / 2; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (rows - 2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = rows / 2; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (rows - 2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
