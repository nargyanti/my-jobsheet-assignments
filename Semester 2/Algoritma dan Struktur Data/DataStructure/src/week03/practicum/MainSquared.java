package week3;

import java.util.Scanner;

public class MainSquared {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Input the number of elements you want to count: ");
        int element = sc.nextInt();
        Squared[] png = new Squared[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input the value to be squared to-" + (i + 1) + ": ");
            int base = sc.nextInt();
            System.out.print("Input the squared value to-" + (i + 1) + ": ");
            int power = sc.nextInt();
            png[i] = new Squared(base, power);
        }
        OUTER:
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Calculate with Brute Force");
            System.out.println("2. Calculate with Divide Conquer");
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("==================================================");
                    System.out.println("Result with Brute Force Squared");
                    for (int i = 0; i < element; i++) {
                        System.out.println("Value " + png[i].num + " squared " + png[i].squared
                                + " is: " + png[i].squaredBF(png[i].num, png[i].squared));
                    }   System.out.println("==================================================");
                    break OUTER;
                case 2:
                    System.out.println("==================================================");
                    System.out.println("Result with Divide and Conquer Squared");
                    for (int i = 0; i < element; i++) {
                        System.out.println("Value " + png[i].num + " squared " + png[i].squared
                                + " is: " + png[i].squaredDC(png[i].num, png[i].squared));
                    }   System.out.println("==================================================");
                    break OUTER;
                default:
                    System.out.println("The data you inputed is wrong");
                    break;
            }
        }
    }

}
