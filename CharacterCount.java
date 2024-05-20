import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello world";
        
        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            // If character is not a space
            if (c != ' ') {
                // Increment count of character in map
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Print character counts
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
