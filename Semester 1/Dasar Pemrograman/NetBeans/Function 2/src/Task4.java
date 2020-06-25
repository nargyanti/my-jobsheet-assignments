import java.util.Scanner;
public class Task4 {
    static int FPB(int M, int N) {
        int residual = M % N;
        if (residual == 0) {
            return (N);
        } else {
            return (FPB(N, residual));
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int M = sc.nextInt();
            System.out.print("Input the second number: ");
            int N = sc.nextInt();
            if (M > 0 && N > 0) {

                System.out.println("\nThe greatest common factor between " + M + " and " + N + " is: " + FPB(M, N));
                break;
            } else {
                System.out.println("The number that you inputed is negative number, please try again");
            }
        }
    }
}
