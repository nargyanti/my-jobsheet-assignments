
import java.util.Scanner;

public class Theory1 {

    public static void main(String[] args) {
        
        int i, j;
        Scanner sc = new Scanner(System.in);
        String arr[][];
        System.out.print("Nilaimu piro: ");
        int N = sc.nextInt();
        arr = new String[N][N];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[0].length - 1) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = " ";
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
