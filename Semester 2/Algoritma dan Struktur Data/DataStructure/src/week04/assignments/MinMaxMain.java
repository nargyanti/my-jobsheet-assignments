package week4.assignments;

import java.util.Scanner;

public class MinMaxMain {

    public static void main(String[] args) {
        MinMax[] ppArray = new MinMax[5];
        ppArray[0] = new MinMax();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new MinMax();
            System.out.println("Index array value to-" + i);
            System.out.print("Input value: ");
            ppArray[i].valueArray = sc.nextInt();
        }
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = ppArray[i].valueArray;
        }
        Result hasilBF = new Result();
        Result hasilDC = new Result();
        Result mM = new Result();
        mM.max_minBF(arr, hasilBF);
        mM.max_minDC(arr, 0, 4, hasilDC);
        System.out.println("Brute Force");
        System.out.println("Minimum value: " + hasilBF.minimum);
        System.out.println("Maximum value: " + hasilBF.maximum);
        System.out.println("Divide and Conquer");
        System.out.println("Minimum value: " + hasilDC.minimum);
        System.out.println("Maximum value: " + hasilDC.maximum);
    } 
}
