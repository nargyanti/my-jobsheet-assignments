import java.util.Scanner;
public class BigValueRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter the element of array in [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe element of the array is: ");
        for (int tampil[] : arr) {
            System.out.print("| ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(tampil[j] + " | ");
            }
            System.out.println();
        }
        int bigRow[] = new int[3], bigColumn[] = new int[5], terbesar;
        for (int i = 0; i < arr.length; i++) {
            int besarRow = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (besarRow < arr[i][j]) {
                    besarRow = arr[i][j];
                }
                bigRow[i] = besarRow;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            int besarColumn = 0;
            for (int[] arr1 : arr) {
                if (besarColumn < arr1[i]) {
                    besarColumn = arr1[i];
                }
                bigColumn[i] = besarColumn;
            }
        }
        System.out.print("\nThe biggest number in each row and column is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (bigRow[i] == bigColumn[j]) {
                    System.out.print(bigRow[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
