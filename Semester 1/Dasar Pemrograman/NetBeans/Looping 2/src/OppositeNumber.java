import java.util.Scanner;
public class OppositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 1) {
                for (int i = 1; i <= N; i++) {
                    if (i % 2 == 1) {
                        for (int j = 1; j <= N; j++) {
                            System.out.print(j + " " );
                        }
                    } else {
                        for (int j = N; j >= 1; j--) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("The number you entered is under 2, please try again");
            }
        }
    }
}
