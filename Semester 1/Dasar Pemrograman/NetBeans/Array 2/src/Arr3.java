import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] value = new int[2][3];
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print("Enter value number-[" + i + "][" + j + "] ");
                value[i][j] = input.nextInt();
                j++;
            } while (j < 3);
            System.out.println("-----------------------------");
            i++;
        } while (i < 2);
        int k = 0;
        do {
            int l = 0;
            do {
                System.out.print(value[k][l] + " ");
                l++;
            } while (l < 3);
            System.out.println();
            k++;
        } while (k < 2);
    }
}
