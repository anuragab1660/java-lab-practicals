public class Persons {
    // Instance variables
    String name;
    int age;
    double salary;

    // Constructor
    public Persons(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Create a Person object using the constructor
        Persons persons = new Persons("John", 30, 50000.0);

        // Display the instance variables
        System.out.println("Name: " + persons.name);
        System.out.println("Age: " + persons.age);
        System.out.println("Salary: " + persons.salary);
    }
}
