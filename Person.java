public class Person {
    // Instance variables
    String name;
    int age;
    double salary;

    public static void main(String[] args) {
        // Create a Person object using the new operator
        Person person = new Person();

        // Set the instance variables
        person.name = "John";
        person.age = 30;
        person.salary = 50000.0;

        // Display the instance variables
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Salary: " + person.salary);
    }
}
