abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

class Circle extends Shape {
    // Data member
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area method for Circle
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    // Data members
    double height;
    double base;

    // Constructor
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Implementation of area method for Triangle
    double area() {
        return 0.5 * height * base;
    }
}

class Square extends Shape {
    // Data member
    double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of area method for Square
    double area() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(4, 6);
        Shape square = new Square(3);

        // Using dynamic method dispatch to call area method
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
