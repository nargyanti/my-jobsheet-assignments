package week6.test;

import java.util.*;

public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nAscending: ");
        selectionSortAsc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nDescending: ");
        selectionSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void selectionSortAsc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Posisi awal: " + arr[0] + " " + arr[1] + " " +  arr[2] + " " + arr[3] + " " + arr[4]);
            
            int indexMin = i;
             System.out.println("Mulai ganti baris, indexMin awal: " + i);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("Pengecekan dimulai");
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                    System.out.println("Menentukan yg terkecil siapa, indexMin skrg: " + j);
                }
            }
            int temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
            System.out.println("Temp = " + temp + "\narr[indexMin] = " + arr[indexMin] + "\narr[i] = " + arr[i]);
            System.out.println("");
        }
    }

    static void selectionSortDesc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
    }

}
