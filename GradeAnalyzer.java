import java.util.Scanner;

public class GradeAnalyzer {
    private static Scanner input = new Scanner(System.in);

    public static double inputUserGrade() {
        // Declaring variables for User input
        boolean isAnswering = true;
        double answer = 0;
        // Creating a loop to check for valid answer
        while (isAnswering) {
            // Setting answer variable to the User's input
            answer = input.nextDouble();
            // Checking if the user's answer is greater than zero or if the user's answer is greater than 100
            if (answer < 0 || answer > 100) {
                System.out.println("Invalid Grade - Please enter a number between 0-100!");
            } else { // if the answer is valid, then stop the loop
                isAnswering = false;
            }
        };

        return answer;
    };

    public static double calculateGradeWeight(double assignmentGrade, double quizGrade, double midExamGrade, double finalExamGrade) {
        // Declaring grade weight variables
        double assignmentWeight = 0.30;
        double quizWeight = 0.20;
        double midExamWeight = 0.20;
        double finalExamWeight = 0.30;
        
        // Multiplying the user's inputted grades by their respective weights
        assignmentGrade = assignmentGrade * assignmentWeight;
        quizGrade = quizGrade * quizWeight;
        midExamGrade = midExamGrade * midExamWeight;
        finalExamGrade = finalExamGrade * finalExamWeight;

        // Returning the sum of the grades in order to get the User's Final Weighted Grade.
        return assignmentGrade + quizGrade + midExamGrade + finalExamGrade;
    }

    
    public static void main(String[] args) {

        // Declaring grade variables
        double assignmentGrade;
        double quizGrade;
        double midExamGrade;
        double finalExamGrade;
        double finalGrade;

        // calling inputUserGrade function to Prompt User to input Assignment grade
        System.out.println("Please enter your Assignment grade!");
        assignmentGrade = inputUserGrade();
        // calling inputUserGrade function to Prompt User to input Quiz grade
        System.out.println("Please enter your Quiz grade!");
        quizGrade = inputUserGrade();
        // calling inputUserGrade function to Prompt User to input Midterm Exam grade
        System.out.println("Please enter your Midterm grade!");
        midExamGrade = inputUserGrade();
        // calling inputUserGrade function to Prompt User to input Final Exam grade
        System.out.println("Please enter your Final Exam grade!");
        finalExamGrade = inputUserGrade();
        
        // Calling the calculateGradeWeight function to get the Final Weighted Grade
        finalGrade = calculateGradeWeight(assignmentGrade, quizGrade, midExamGrade, finalExamGrade);
        // Outputting Final Weighted Grade
        System.out.println("Your final grade is: " + Math.round(finalGrade * 100.0) / 100.0);
    }
}
