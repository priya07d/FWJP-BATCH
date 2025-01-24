//Q1 write a java program to print your name.
import java.util.Scanner;
class Name
{
public static void main(String args[])
{ 
 // Create a Scanner object to read input
Scanner sc =new Scanner(System.in);

System.out.println("Enter your name");

String name=sc.nextLine();//read the input as a string

System.out.println("My Name Is: "+name);//name is entered
sc.close();//to close the scanner object
}
}