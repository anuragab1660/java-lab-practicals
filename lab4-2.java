class Employee {
    // Instance variables
    int empCode;
    String name;
    String designation;
    double basicPay;
    double hra;
    double da;
    double totalPay;

    // Constructor to assign initial values
    public Employee(int empCode, String name, String designation, double basicPay) {
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    // Method to calculate HRA, DA, and Total pay
    public void calculateSalary() {
        // Calculate HRA (10% of basic pay)
        hra = 0.1 * basicPay;

        // Calculate DA (45% of basic pay)
        da = 0.45 * basicPay;

        // Calculate Total pay
        totalPay = basicPay + hra + da;
    }

    // Method to print employee details
    public void displayDetails() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Pay: " + totalPay);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for three different employees
        Employee emp1 = new Employee(101, "John Doe", "Manager", 50000);
        Employee emp2 = new Employee(102, "Jane Smith", "Software Engineer", 40000);
        Employee emp3 = new Employee(103, "Alice Johnson", "HR Assistant", 30000);

        // Calculate salary for each employee
        emp1.calculateSalary();
        emp2.calculateSalary();
        emp3.calculateSalary();

        // Display details for each employee
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
        System.out.println("\nEmployee 3 Details:");
        emp3.displayDetails();
    }
}
