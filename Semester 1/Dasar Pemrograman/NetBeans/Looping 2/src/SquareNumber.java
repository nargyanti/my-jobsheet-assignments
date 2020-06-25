import java.util.Scanner;
public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 2) {
                for (int i = 1; i <= N; i++) {
                    if (i == 1 || i == N) {
                        for (int j = 1; j <= N; j++) {
                            System.out.print(N);
                        }
                    } else {
                        for (int j = 1; j <= N; j++) {
                            if (j == 1 || j == N) {
                                System.out.print(N);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("The number you entered is under 3, please try again");
            }
        }
    }
}
