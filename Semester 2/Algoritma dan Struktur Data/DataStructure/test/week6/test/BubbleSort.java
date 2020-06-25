package week6.test;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nAscending: ");
        bubbleSortAsc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nDescending: ");
        bubbleSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void bubbleSortAsc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { 
            System.out.println("Posisi awal: " + arr[0] + " " + arr[1] + " " +  arr[2] + " " + arr[3] + " " + arr[4]);
            System.out.println("Mulai ganti baris, pengecekan awal baris: " + i);
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { 
                    System.out.println("Array ditukar");
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println("Temp = " + temp + "\narr[j] = " + arr[j] + "\narr[j-1] = " + arr[j-1]);
                }
                System.out.println("\nPosisi hasil tukar: " + arr[0] + " " + arr[1] + " " +  arr[2] + " " + arr[3] + " " + arr[4]);
            }
            System.out.println("");
        }
    }
    
    static void bubbleSortDesc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }


}
