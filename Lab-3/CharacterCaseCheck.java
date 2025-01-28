import java.util.Scanner;

public class CharacterCaseCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is lowercase or uppercase
        String result = (ch >= 'a' && ch <= 'z') 
            ? "The character is in lowercase." 
            : (ch >= 'A' && ch <= 'Z') 
                ? "The character is in uppercase." 
                : "The character is not an alphabet.";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
