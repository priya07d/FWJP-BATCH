import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a Character: ");
char ch = scanner.next().charAt(0);

// Check if the character is a vowel using a ternary operator
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "The character is a vowel." 
                        : "The character is not a vowel.";

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}



