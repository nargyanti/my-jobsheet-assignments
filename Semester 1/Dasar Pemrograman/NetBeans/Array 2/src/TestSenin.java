
import java.util.Scanner;

public class TestSenin {

    public static void main(String[] args) {
        
        int i, j, selang = 1;
        Scanner sc = new Scanner(System.in);
        String arr[][];
        System.out.print("Masukkan nilai: ");
        int N = sc.nextInt();
        arr = new String[N][N];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[0].length - 1 || i == j || (j == arr[0].length - (i+1))) {
                    arr[i][j] = "* ";
                    selang++;
                } else {
                    arr[i][j] = "  ";
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
