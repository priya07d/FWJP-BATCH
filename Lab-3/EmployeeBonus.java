import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Experience and Salary
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        // Calculate bonus using ternary operator
        double bonus = (experience > 20) ? (0.20 * salary) : (0.10 * salary);

        // Output: Bonus
        System.out.println("The bonus is: " + bonus);

        scanner.close();
    }
}
