import java.util.Scanner;
public class SelectionPracticum1 {
    static String wrongInput = "Sorry, the input you entered is invalid, please try again";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input your assignment score: ");
            double assignmentScore = sc.nextDouble();
            if (assignmentScore >= 0 && assignmentScore <= 100) {
                while (true) {
                    System.out.print("Input your midterm score: ");
                    double midtermScore = sc.nextDouble();
                    if (midtermScore >= 0 && midtermScore <= 100) {
                        while (true) {
                            System.out.print("Input your final exam score: ");
                            double finalExamScore = sc.nextDouble();
                            if (finalExamScore >= 0 && finalExamScore <= 100) {
                                double finalScore = (assignmentScore * 0.2) + (midtermScore * 0.35) + (finalExamScore * 0.45);
                                System.out.println("====================================");
                                System.out.println("Your final score is " + finalScore);
                                System.out.println("====================================");
                                break;
                            } else {
                                System.out.println(wrongInput);
                            }
                        }
                        break;
                    } else {
                        System.out.println(wrongInput);
                    }
                }
                break;
            } else {
                System.out.println(wrongInput);
            }
        }
    }
}
