import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        try {
            double number = scanner.nextDouble();

            // Use ternary operators to determine the result
            String result = (number > 0) 
                ? "The number is positive." 
                : (number < 0) 
                    ? "The number is negative." 
                    : "The number is zero.";

            // Print the result
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
