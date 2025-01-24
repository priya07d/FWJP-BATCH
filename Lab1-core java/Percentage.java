//Q3 write a java program to calculate and print the percentage of total marks where student has scored 430 marks out of 500.
public class Percentage {
    public static void main(String[] args) {
        // Variables to store marks obtained and total marks
        int marksObtained = 430;
        int totalMarks = 500;

        // Calculate the percentage
     double    percentage =  marksObtained / totalMarks * 100;

        // Print the result
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
