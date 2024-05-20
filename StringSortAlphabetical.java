import java.util.Arrays;

public class StringSortAlphabetical {
    public static void main(String[] args) {
        // Array of strings to be sorted
        String[] strings = {"banana", "apple", "orange", "grape", "kiwi"};

        // Sort the array
        Arrays.sort(strings);

        // Output the sorted array
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
