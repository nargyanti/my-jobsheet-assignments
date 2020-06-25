package week6.test;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nAscending: ");
        insertionSortAsc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nDescending: ");
        insertionSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionSortAsc(int arr[]) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println("i = " + i + ", temp = " + temp);
            j = i;
            System.out.println("j = " + j);
            while ((j > 0) && (arr[j - 1] > temp)) {
                System.out.println("Posisi awal: " + arr[0] + " " + arr[1] + " " +  arr[2] + " " + arr[3] + " " + arr[4]);
                arr[j] = arr[j - 1];
                System.out.println("Yang diubah: arr[j] = " + arr[j]);
                System.out.println("Posisi skrg: " + arr[0] + " " + arr[1] + " " +  arr[2] + " " + arr[3] + " " + arr[4]);
                j--;
            }
            arr[j] = temp;
            System.out.println("arr[j] skrg didapat dari temp: arr[j] = " + arr[j]);
        }
    }

    public static void insertionSortDesc(int arr[]) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] < temp)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp; // 
        }
    }

}
