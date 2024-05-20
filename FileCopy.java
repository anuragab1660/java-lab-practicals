import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Check if two command line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide source and destination file names as command line arguments.");
            return;
        }

        // File names from command line arguments
        String sourceFileName = args[0];
        String destinationFileName = args[1];

        // Copy using character stream classes
        copyUsingCharacterStreams(sourceFileName, destinationFileName);

        // Copy using byte stream classes
        copyUsingByteStreams(sourceFileName, destinationFileName);

        // Copy using buffered stream classes
        copyUsingBufferedStreams(sourceFileName, destinationFileName);
    }

    // Copy using character stream classes
    private static void copyUsingCharacterStreams(String sourceFileName, String destinationFileName) {
        try (FileReader reader = new FileReader(sourceFileName);
             FileWriter writer = new FileWriter(destinationFileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied using character stream classes.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying file using character stream classes: " + e.getMessage());
        }
    }

    // Copy using byte stream classes
    private static void copyUsingByteStreams(String sourceFileName, String destinationFileName) {
        try (FileInputStream inputStream = new FileInputStream(sourceFileName);
             FileOutputStream outputStream = new FileOutputStream(destinationFileName)) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
            System.out.println("File copied using byte stream classes.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying file using byte stream classes: " + e.getMessage());
        }
    }

    // Copy using buffered stream classes
    private static void copyUsingBufferedStreams(String sourceFileName, String destinationFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied using buffered stream classes.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying file using buffered stream classes: " + e.getMessage());
        }
    }
}
