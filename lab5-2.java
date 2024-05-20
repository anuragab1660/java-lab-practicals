class A3 {
    // Method in class A3
    void hello(String s) {
        System.out.println("A3: Hello From " + s);
    }
}

class B3 extends A3 {
    // Overriding method in class B3
    void hello(String s) {
        System.out.println("B3: Hello From " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        A3 obj1 = new A3(); // Object of class A3
        B3 obj2 = new B3(); // Object of class B3

        // Dynamic method dispatch
        A3 ref;

        // Assigning object of class A3
        ref = obj1;
        ref.hello("obj1");

        // Assigning object of class B3
        ref = obj2;
        ref.hello("obj2");

        // Using super keyword
        obj2.hello("super");
    }
}
