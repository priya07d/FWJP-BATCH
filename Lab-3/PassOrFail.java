import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.print("Enter your marks (out of 100): ");
        try {
            int marks = scanner.nextInt();

            // Validate marks input
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            } else {
                // Determine pass or fail
                String result = (marks >= 40) 
                    ? "Pass" 
                    : "Fail";

                // Print the result
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric marks.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
