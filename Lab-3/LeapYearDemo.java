/* Wap to check whether an year is leap or not?
	(Year%4==0  && year%100!=0)  || year%400==0  leap year*/
import java.util.Scanner;
class LeapYearDemo
{
         public static void main(String args[])
{
          Scanner scanner =new Scanner(System.in);
         System.out.println("Enter the year");
int year = scanner.nextInt();

        // Check leap year using ternary operator
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                        ? "Leap Year" 
                        : "Not a Leap Year";

       
        System.out.println(result);
scanner.close();
}
}