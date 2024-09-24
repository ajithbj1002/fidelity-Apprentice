import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        char grade;
        String feedback;

        // Determine the grade using switch case
        switch (marks / 10) {

            case 9:
                grade = 'A';
                feedback = "Excellent performance!";
                break;
            case 8:
                grade = 'B';
                feedback = "Very good performance!";
                break;
            case 7:
                grade = 'C';
                feedback = "Good performance!";
                break;
            case 6:
                grade = 'D';
                feedback = "Satisfactory performance.";
                break;
            case 5:
                grade = 'E';
                feedback = "Needs improvement.";
                break;
            default:
                grade = 'F';
                feedback = "Failed. Better luck next time.";
                break;
        }

        // Display the grade and feedback
        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + feedback);

        scanner.close();
    }
}
