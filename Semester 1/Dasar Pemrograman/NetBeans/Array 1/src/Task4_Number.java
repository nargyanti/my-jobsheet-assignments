import java.util.Scanner;
public class Task4_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of index you want to generate: ");
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("\nArray list: \n|  ");
        for (int hasil : a) {
            System.out.print(hasil + "  |  ");
        }
        System.out.print("\n\nEnter the number you want to delete: ");
        int delete = sc.nextInt();
        int banyaknya = 0;
        for (int i = 0; i < N; i++) {
            if (delete == a[i]) {
                banyaknya++;
                for (int j = i; j < N - banyaknya; j++) {
                    a[j] = a[j + 1];
                }
            }
        }
        System.out.print("\nResult: \n|  ");
        for (int i = 0; i < N - banyaknya; i++) {
            System.out.print(a[i] + "  |  ");
        }
        System.out.println();
    }
}