import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the row for your array: ");
        int row = sc.nextInt();
        System.out.print("Enter the length of the column for your array: ");
        int column = sc.nextInt();
        int transpose[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element of array in [" + i + "][" + j + "]: ");
                transpose[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe content of the array is: ");
        for (int tampil[] : transpose) {
            System.out.print("| ");
            for (int j = 0; j < column; j++) {
                System.out.print(tampil[j] + " | ");
            }
            System.out.println();
        }
        System.out.println("\nThe transpose of the array is: ");
        for (int i = 0; i < column; i++) {
            System.out.print("| ");
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[j][i] + " | ");
            }
            System.out.println();
        }
    }
}