public class StringBufferAppendAndReverse {
    public static void main(String[] args) {
        // Create a StringBuffer with a default string
        StringBuffer stringBuffer = new StringBuffer("Hello World");

        // Append a string to the 5th position (index 4) of the original string
        String appendString = " from Java!";
        stringBuffer.insert(4, appendString);

        // Display the modified string
        System.out.println("Modified string: " + stringBuffer);

        // Display the reverse of the modified string
        String reverseString = stringBuffer.reverse().toString();
        System.out.println("Reverse of modified string: " + reverseString);
    }
}
