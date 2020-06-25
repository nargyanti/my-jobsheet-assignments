package week2.test;


import java.util.Scanner;

public class DecimaltoBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan value: ");
        int value = sc.nextInt();
        int basis = 1, pangkat = 0;
        while (value > basis) {
            pangkat++;
            basis *= 2;
        }
        int arr[] = new int[pangkat];
        for (int i = pangkat - 1; i >= 0; i--) {
            arr[i] = value % 2;
            value = value / 2;
        }
        for (int i = 0; i < pangkat; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
