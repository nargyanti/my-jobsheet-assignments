package week2.test;

import java.util.Scanner;

public class PascalBahasaInggris {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Input the number index [" + (i) + "]: ");
            arr[i] = sc.nextInt();
        } 
        int biggest = searchBiggestNumber(arr);
        printResult(biggest);
    }
    
    static void printResult(int biggest) {
        System.out.println("=======================================");
        System.out.println("The biggest number is: " + biggest);
        System.out.println("=======================================");
    }
    
    static int searchBiggestNumber(int arr[]) {
        int biggest = arr[0];
        for (int i = 0; i < 3; i++) {
            if (biggest < arr[i]) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
    
}

