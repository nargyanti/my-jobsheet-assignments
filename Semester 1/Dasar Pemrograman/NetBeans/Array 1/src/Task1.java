import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value of a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nArray list: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  a[" + i + "]");
        }
        System.out.print("\n|  ");
        for (int hasil : a) {
            System.out.print(hasil + "  |  ");
        }
        int awal = 4;
        for (int i = 0; i < a.length / 2; i++) {
            int ganti = a[i];
            a[i] = a[awal];
            a[awal] = ganti;
            awal--;
        }
        System.out.println("\n\nArray in reverse order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("  a[" + i + "]");
        }
        System.out.print("\n|  ");
        for (int hasil : a) {
            System.out.print(hasil + "  |  ");
        }
        System.out.println();
    }
}