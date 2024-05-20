import java.util.Scanner;

class Employee {
    // Data members
    protected String name;
    protected int empNum;
    protected char gender;

    // Method to input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        name = scanner.nextLine();
        System.out.println("Enter employee number:");
        empNum = scanner.nextInt();
        System.out.println("Enter employee gender (M/F):");
        gender = scanner.next().charAt(0);
        scanner.close();
    }

    // Method to display data
    public void showData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Number: " + empNum);
        System.out.println("Employee Gender: " + gender);
    }
}

class SalariedEmployee extends Employee {
    // New data member
    protected double salary;

    // Method to calculate allowance
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
        salary += 0.01 * salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of SalariedEmployee
        SalariedEmployee employee = new SalariedEmployee();
        
        // Input data for the employee
        employee.inputData();
        
        // Calculate and display gross salary
        employee.allowance();
        
        // Increment salary
        employee.increment();
        
        // Calculate and display gross salary after increment
        employee.allowance();
    }
}
