package week3;

import java.util.Scanner;

public class MainFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Input the number of elements you want to count: ");
        int element = sc.nextInt();
        Factorial[] fc = new Factorial[element];
        for (int i = 0; i < element; i++) {
            fc[i] = new Factorial();
            System.out.print("Input the data value to-" + (i + 1) + ": ");
            fc[i].num = sc.nextInt();
        }
        long startTime = System.currentTimeMillis();
        System.out.println("====================================================");
        System.out.println("Factorial result with Brute Force");
        for (int i = 0; i < element; i++) {
            System.out.println("Factorial of value " + fc[i].num + " is: " + fc[i].factorialBF(fc[i].num));
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("execution time: "+ String.valueOf(elapsedTime) +" milisecond");
        long StartTime1 = System.currentTimeMillis();
        System.out.println("====================================================");
        System.out.println("Factorial result with Divide and Conquer");
        for (int i = 0; i < element; i++) {
            System.out.println("Factorial of value " + fc[i].num + " is: " + fc[i].factorialDC(fc[i].num));
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - StartTime1;
        System.out.println("execution time: "+ String.valueOf(elapsedTime) +" milisecond");
        System.out.println("====================================================");
        
    
        
        
}

}
