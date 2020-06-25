import java.util.Scanner;
public class ArrayPracticum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[4][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print("Input the value of index [" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int[] array11 : array1) {
            for (int j = 0; j < array1[0].length; j++) {
                total += array11[j];
            }
        }
        System.out.println("The total content of array1 is " + total);
    }
}
