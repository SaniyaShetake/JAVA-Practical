import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = Math.max(monthlySalary, 0.0);
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary *= 1.10;
    }

    public String getDetails() {
        return firstName + " " + lastName + " Yearly Salary: " + getYearlySalary();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first employee's first name: ");
        String firstName1 = scanner.next();
        System.out.print("Enter first employee's last name: ");
        String lastName1 = scanner.next();
        System.out.print("Enter first employee's monthly salary: ");
        double salary1 = scanner.nextDouble();

        System.out.print("Enter second employee's first name: ");
        String firstName2 = scanner.next();
        System.out.print("Enter second employee's last name: ");
        String lastName2 = scanner.next();
        System.out.print("Enter second employee's monthly salary: ");
        double salary2 = scanner.nextDouble();

        Employee emp1 = new Employee(firstName1, lastName1, salary1);
        Employee emp2 = new Employee(firstName2, lastName2, salary2);

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("After 10% Raise:");
        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());

        scanner.close();
    }
}
