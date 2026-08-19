package homework;
import java.util.Scanner;

public class employeemenu2 {

    // Instance variables / Data members
    String name;
    int age;
    String designation;
    double salary;

    // Instance block
    {
        System.out.println("Employee object is created");
    }

    // Constructor
    employeemenu2(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
    }

    // Raise salary method
    void raiseSalary(double amount) {
        salary = salary + amount;
        System.out.println("Salary raised successfully!");
        System.out.println("New Salary  : " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        employeemenu emp = null;

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                sc.nextLine();

                // Name validation
                String name;

                while (true) {
                    System.out.print("Enter Name (only two words): ");
                    name = sc.nextLine();

                    String[] words = name.trim().split("\\s+");

                    if (words.length == 2) {
                        break;
                    } else {
                        System.out.println("Please enter exactly two words.");
                    }
                }

                // Age validation
                int age;

                while (true) {
                    System.out.print("Enter Age (18-60): ");
                    age = sc.nextInt();

                    if (age >= 18 && age <= 60) {
                        break;
                    } else {
                        System.out.println("Age must be between 18 and 60.");
                    }
                }

                sc.nextLine();

                // Yes / No
                System.out.print("Do you want to continue? (yes/no): ");
                String answer = sc.nextLine();

                if (answer.equalsIgnoreCase("yes")) {

                    System.out.println("\nSelect Designation:");
                    System.out.println("1. Programmer");
                    System.out.println("2. Manager");
                    System.out.println("3. Tester");

                    System.out.print("Enter choice: ");
                    int d = sc.nextInt();

                    String designation;

                    if (d == 1) {
                        designation = "Programmer";
                    } else if (d == 2) {
                        designation = "Manager";
                    } else {
                        designation = "Tester";
                    }

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    // Constructor
                    emp = new employeemenu(name, age, designation, salary);

                    System.out.println("Employee created successfully!");

                } else {
                    System.out.println("Creation cancelled.");
                }

                break;

            case 2:

                if (emp != null) {
                    emp.display();
                } else {
                    System.out.println("Please create employee first.");
                }

                break;

            case 3:

                if (emp != null) {

                    sc.nextLine();

                    System.out.println("\n--- Raise Salary ---");

                    System.out.print("Enter Name: ");
                    String rname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int rage = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String rdesignation = sc.nextLine();

                    if (emp.name.equalsIgnoreCase(rname)
                            && emp.age == rage
                            && emp.designation.equalsIgnoreCase(rdesignation)) {

                        System.out.print("Enter salary raise amount: ");
                        double amount = sc.nextDouble();

                        emp.raiseSalary(amount);

                    } else {
                        System.out.println("Employee details not found.");
                    }

                } else {
                    System.out.println("Please create employee first.");
                }

                break;

            case 4:

                System.out.println("Program exited.");
                break;

            default:

                System.out.println("Invalid choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}


