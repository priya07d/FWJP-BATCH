import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt();

            // Check if the age is valid
            if (age < 0) {
                System.out.println("Age cannot be negative. Please enter a valid age.");
            } else if (age >= 18) {
                System.out.println("You are eligible to vote!");
            } else {
                System.out.println("You are not eligible to vote. You need to wait " + (18 - age) + " more year(s).");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value for age.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
