import java.util.Scanner;
public class TriangleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 0) {
                for (int i = 1; i <= N; i++) {
                    for (int j = N; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("The number you entered is under 1, please try again");
            }
        }
    }
}
