import java.io.*;
import java.util.Random;

public class RandomNumberFile {
    public static void main(String[] args) {
        // Generate random integers and store them in a file
        generateRandomNumbers("rand.dat", 10);

        // Read integers from the file and display on the screen
        readAndDisplayNumbers("rand.dat");
    }

    // Method to generate random integers and store them in a file
    private static void generateRandomNumbers(String fileName, int count) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(100); // Generate random integer between 0 and 99
                outputStream.writeInt(randomNumber); // Write random integer to the file
            }
            System.out.println("Random numbers written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing random numbers to file: " + e.getMessage());
        }
    }

    // Method to read integers from the file and display on the screen
    private static void readAndDisplayNumbers(String fileName) {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Random numbers read from file:");
            while (true) {
                int randomNumber = inputStream.readInt(); // Read integer from the file
                System.out.println(randomNumber); // Display the integer on the screen
            }
        } catch (EOFException e) {
            // End of file reached, do nothing
        } catch (IOException e) {
            System.out.println("Error occurred while reading random numbers from file: " + e.getMessage());
        }
    }
}
