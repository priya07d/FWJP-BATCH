import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        try {
            int number = scanner.nextInt();

            // Determine if the number is even or odd using a ternary operator
            String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";

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
