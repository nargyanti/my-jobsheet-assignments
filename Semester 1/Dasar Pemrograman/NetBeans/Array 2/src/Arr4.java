import java.util.Scanner;
public class Arr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowA, columnA;
        System.out.print("Enter row size of Matrix A: ");
        rowA = input.nextInt();
        System.out.print("ENter column size of Matrix A: ");
        columnA = input.nextInt();
        int[][] MatrixA = new int[rowA][columnA];
        System.out.println("Input element of Matrix A: ");
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("Matrix A[" + i + "][" + j + "]: ");
                MatrixA[i][j] = input.nextInt();
                j++;
            } while (j < columnA);
            System.out.println();
            i++;
        } while (i < rowA);
        System.out.println("The Matrix output is: ");
        int k = 0;
        do {
            int l = 0;
            do {
                System.out.print(MatrixA[k][l] + " ");
                l++;
            } while (l < columnA);
            System.out.println();
            k++;
        } while (k < rowA);
    }
}
