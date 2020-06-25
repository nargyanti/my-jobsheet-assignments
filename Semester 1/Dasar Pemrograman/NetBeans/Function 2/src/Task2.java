import java.util.Scanner;
public class Task2 {
    static int Sum(int N) {
        if (N == 0) {
            return (0);
        } else {
            return (N + Sum(N - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the value of N: ");
        int N = sc.nextInt();
        System.out.println("the result of adding the number N is: " + Sum(N));
    }
}