import java.util.Scanner;
public class TotalContentsOfArray {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int Array1[][] = new int[4][5];
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[0].length; j++) {
                System.out.print("Enter the value of [" + i + "][" + j + "]: ");
                Array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe content of the Array1 is: ");
        for (int tampil[] : Array1) {
            System.out.print("| ");
            for (int j = 0; j < Array1[0].length; j++) {
                System.out.print(tampil[j] + " | ");
            }
            System.out.println();
        }
        for (int hitung[] : Array1) {
            for (int j = 0; j < Array1[0].length; j++) {
                total += hitung[j];
            }
        }
        System.out.println("\nThe total number of contents of the Array1 is " + total);
    }
}
