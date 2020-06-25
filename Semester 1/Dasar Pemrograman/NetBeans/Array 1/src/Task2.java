import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.print("Masukkan jumlah Array: ");
        int N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan Array ke-" + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Angka genap: " + arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("Angka ganjil: " + arr[i]);
            }
        }
    }
}
