import java.util.Scanner;

public class CharacterAnalysis {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is an alphabet
        String result = (Character.isLetter(ch)) 
            ? ((Character.isUpperCase(ch)) 
                ? "The character is uppercase. Converting to lowercase: " + Character.toLowerCase(ch) + ". "
                    + (isVowel(Character.toLowerCase(ch)) ? "It is a vowel." : "It is not a vowel.")
                : "The character is lowercase. "
                    + (isVowel(ch) ? "It is a vowel." : "It is not a vowel."))
            : "The character is not an alphabet.";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
