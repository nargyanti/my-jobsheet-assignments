import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int ending = 0;
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 0) {
                for (int i = 1; i > 0; i++) {
                    int prime = 0;
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            prime++;
                            break;
                        }
                    }
                    if (prime == 0 && i != 1) {
                        System.out.print(i + " ");
                        ending++;
                    }
                    if (ending==N) {
                        System.out.println();
                        break;
                    }
                }
                break;
            } else {
                System.out.println("The number you entered is under 1, please try again");
            }
        }
    }
}
