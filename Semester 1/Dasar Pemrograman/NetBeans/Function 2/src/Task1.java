import java.util.Scanner;
public class Task1 {
    static void DescendingIteration(int N) {
        for (int i = N; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    static void DescendingRecursive(int N) {
        if (N >= 0) {
            System.out.print(N + " ");
            DescendingRecursive(--N);
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.println("\nDescending using iteration: ");
        DescendingIteration(N);
        System.out.println("\n\nDescending using recursive: ");
        DescendingRecursive(N);
    }
}