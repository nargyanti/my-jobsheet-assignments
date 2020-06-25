import java.util.Scanner;
public class GlassHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 1) {
                for (int i = N; i >= 1; i--) {
                    for (int j = N; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k != (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 2; i <= N; i++) {
                    for (int j = N; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k != (2 * i - 1); k++) {
                        System.out.print("*");
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
