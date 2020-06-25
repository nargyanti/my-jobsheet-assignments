import java.util.Scanner;
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Input the value in [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nThe list of the array's contents is\n");
        for (int[] tampil : arr) {
            System.out.print("| ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(tampil[j] + " | ");
            }
            System.out.println();
        }
        int big = arr[0][0];
        for (int hitung[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                if (hitung[l] > big) {
                    big = hitung[l];
                }
            }
        }
        System.out.println("\nThe max value of the array's contents is " + big);
    }
}
