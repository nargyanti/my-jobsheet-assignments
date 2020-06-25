import java.util.Scanner;
public class Task4_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the length of index you want to generate: ");
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Enter the element " + (i + 1) + ": ");
                a[i] = sc.nextInt();
            }
            System.out.println("\nArray list: ");
            for (int i = 0; i < N; i++) {
                System.out.print("  a[" + i + "]");
            }
            System.out.print("\n|  ");
            for (int hasil : a) {
                System.out.print(hasil + "  |  ");
            }
            System.out.print("\n\nEnter the index number of a[ ] that you want to delete: ");
            int delete = sc.nextInt();
            if (delete < N) {
                for (int i = delete; i < N - 1; i++) {
                    a[i] = a[i + 1];
                }
                System.out.println("\nResult: ");
                for (int i = 0; i < N-1; i++) {
                    System.out.print("  a[" + i + "]");
                }
                System.out.print("\n|  ");
                for (int i = 0; i < N-1; i++) {
                    System.out.print(a[i] + "  |  ");
                }
                System.out.println();
                break;
            } else {
                System.out.println("The position you entered is larger than the length of index, please try again");
            }
        }
    }
}