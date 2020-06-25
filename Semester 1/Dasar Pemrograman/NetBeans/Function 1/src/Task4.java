import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int studentScore[] = inputStudentScore();
        System.out.println("\nThe student's score list: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Student number " + (i + 1) + ": " + studentScore[i]);
        }
        System.out.println("\nScore average: " + calculateScore(studentScore));
        int maxMin[] = selectionScore(studentScore);
        System.out.println("The maximum score: " + maxMin[0]);
        System.out.println("The minimum score: " + maxMin[1]);
    }

    static int[] inputStudentScore() {
        Scanner sc = new Scanner(System.in);
        int scores[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Input the score of student number " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        return scores;
    }

    static int calculateScore(int score[]) {
        int allStudentScore = 0;
        for (int i = 0; i < 10; i++) {
            allStudentScore += score[i];
        }
        int average = allStudentScore / score.length;
        return average;
    }
    
    static int[] selectionScore(int score[]) {
        int max = score[0], min = score[0]; 
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }
        int maxMin[] = {max, min};
        return maxMin;
    }
}
