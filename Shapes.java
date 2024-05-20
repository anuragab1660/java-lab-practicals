// Interface Shape2D
interface Shape2D {
    double getArea();
}

// Class Point3D
class Point3D {
    // Coordinates of a point
    double x, y, z;

    // Constructor
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

// Abstract class Shape
abstract class Shape {
    // Abstract method to display shape
    abstract void display();
}

// Class Circle extending Shape and implementing Shape2D interface
class Circle extends Shape implements Shape2D {
    // Data member
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea method from Shape2D interface
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of display method from Shape abstract class
    void display() {
        System.out.println("Circle with radius " + radius);
    }
}

// Shapes class to exercise methods
public class Shapes {
    public static void main(String[] args) {
        // Create an object of Circle
        Circle circle = new Circle(5);
        
        // Display the circle
        circle.display();
        
        // Calculate and display the area of the circle
        double area = circle.getArea();
        System.out.println("Area of the circle: " + area);
    }
}
