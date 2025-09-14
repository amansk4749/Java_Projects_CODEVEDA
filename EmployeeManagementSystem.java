import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        employees.add(e);

        System.out.println(" Employee Added!\n");
    }

    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found.\n");
        } else {
            System.out.println(" Employee List:");
            for (Employee e : employees) {
                System.out.println(e);
            }
            System.out.println();
        }
    }

    public static void updateEmployee() {
        System.out.print("Enter Employee ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.print("Enter New Name: ");
                e.name = sc.nextLine();
                System.out.print("Enter New Salary: ");
                e.salary = sc.nextDouble();
                System.out.println(" Employee Updated!\n");
                return;
            }
        }
        System.out.println(" Employee Not Found!\n");
    }

    public static void deleteEmployee() {
        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                employees.remove(e);
                System.out.println(" Employee Deleted!\n");
                return;
            }
        }
        System.out.println(" Employee Not Found!\n");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: updateEmployee(); break;
                case 4: deleteEmployee(); break;
                case 5: System.out.println(" Exiting..."); break;
                default: System.out.println(" Invalid Choice!\n");
            }
        } while (choice != 5);
    }
}
