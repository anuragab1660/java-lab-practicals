import java.util.Scanner;

class Employee {
    // Data members
    String name;
    int empNumber;
    char gender;

    // Method to input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        name = scanner.nextLine();
        System.out.println("Enter employee number:");
        empNumber = scanner.nextInt();
        System.out.println("Enter employee gender (M/F):");
        gender = scanner.next().charAt(0);
    }

    // Method to display data
    public void showData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Employee Gender: " + gender);
    }
}

class SalariedEmployee extends Employee {
    // New data member
    double salary;

    // Constructor
    public SalariedEmployee() {
        super.inputData(); // Call base class's input_data() method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee salary:");
        salary = scanner.nextDouble();
        scanner.close();
    }

    // Method to calculate allowance and display gross salary
    public void allowance() {
        double hra, da;
        if (gender == 'F') {
            hra = 0.1 * salary;
        } else {
            hra = 0.09 * salary;
        }
        da = 0.05 * salary;
        double grossSalary = salary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
    }

    // Method to increment salary
    public void increment() {
        salary += 0.1 * salary;
    }
}

public class Main {
    public static void main(String[] args) {
        SalariedEmployee employee = new SalariedEmployee();
        employee.allowance();
        employee.increment();
        System.out.println("After increment:");
        employee.allowance();
    }
}
