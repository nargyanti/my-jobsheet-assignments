package week3;

import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Program for calculating total profits");
        System.out.print("Input the amount of company: ");
        int companyAmount = sc.nextInt();
        double companyProfitBF[] = new double[companyAmount];
        double companyProfitDC[] = new double[companyAmount];
        for (int i = 0; i < companyAmount; i++) {
            System.out.println("====================================================");
            System.out.println("Company " + (i + 1));
            System.out.print("Input the number of months: ");
            int totElemen = sc.nextInt();
            Sum sm = new Sum(totElemen);
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Input the profit of the month to-" + (j + 1) + " = ");
                sm.profit[j] = sc.nextDouble();
            }
            companyProfitBF[i] = sm.totalBF(sm.profit, 0);
            companyProfitDC[i] = sm.totalDC(sm.profit, 0, sm.elemen - 1);
            System.out.println("====================================================");
            System.out.println("Algorithm Brute Force");
            System.out.println("Total profits of the company " + (i + 1) + " for " + sm.elemen + " month is = " + companyProfitBF[i]);
            System.out.println("----------------------------------------------------");
            System.out.println("Algorithm Divide Conquer");
            System.out.println("Total profits of the company " + (i + 1) + " for " + sm.elemen + " month is = " + companyProfitDC[i]);
            System.out.println("====================================================");
        }
    }
}
