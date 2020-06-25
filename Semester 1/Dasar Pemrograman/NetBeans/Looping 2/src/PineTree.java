import java.util.Scanner;
public class PineTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 1) {
                int ulang = 1;
                while (ulang <= N) {
                    for (int i = 1; i <= N; i++) {
                        for (int j = N; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k != (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    ulang++;
                }
                break;
            } else {
                System.out.println("The number you entered is under 2, please try again");
            }
        }
    }
}
