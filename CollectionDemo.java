import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        // Demonstrate Stack
        System.out.println("Demonstrating Stack:");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stack after operations: " + stack);
        System.out.println();

        // Demonstrate Vector
        System.out.println("Demonstrating Vector:");
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        System.out.println("Vector: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("Vector size: " + vector.size());
        System.out.println();

        // Demonstrate ArrayList
        System.out.println("Demonstrating ArrayList:");
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.14);
        arrayList.add(2.71);
        arrayList.add(1.618);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Removing element at index 1: " + arrayList.remove(1));
        System.out.println("ArrayList size: " + arrayList.size());
    }
}
