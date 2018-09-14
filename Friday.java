import java.util.Scanner;

public class Friday {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int quizzes;
        int quizAmount = 0;
        int score = 0;
        int totalScores = 0;
        int avg = 0;
        String grade = "A";

        System.out.println("How many quizzes will you be entering? Please enter an exact amount.");
        quizzes = scan.nextInt();
        quizAmount = quizzes;

        while (quizzes > 0) {
            System.out.println("Please enter your quiz score: ");
            score = scan.nextInt();
            totalScores = score + score;
            avg = totalScores / quizAmount;
            quizzes = quizzes - 1;
        }

        if (avg <= 60) {
            grade = "F";
        }

        if (avg >= 60 && avg <= 70) {
            grade = "D";
        }

        if (avg >= 70 && avg <= 80) {
            grade = "C";
        }

        if (avg >= 80 && avg <= 90) {
            grade = "B";
        }

        if (avg >= 90 && avg <= 100) {
            grade = "A";
        }

        System.out.println("Average: " + avg + " Total scores: " + totalScores + " Overall grade: " + grade);
    }
}