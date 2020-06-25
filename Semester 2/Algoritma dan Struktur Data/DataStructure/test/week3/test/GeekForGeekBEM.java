package week3.test;

import java.util.Scanner;

public class GeekForGeekBEM {

    public String candidate[] = {"Haris", "Dian", "Rani", "Bisma"};

    /* Function to print Majority Element */
    void printMajority(int a[], int size) {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand)) {
            System.out.println("Winner: " + cand + " ");
        } else {
            System.out.println("No Majority Element");
        }
    }

    /* Function to find the candidate for Majority */
    int findCandidate(int a[], int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more 
       than n/2 times */
    boolean isMajority(int a[], int size, int cand) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand) {
                count++;
            }
        }
        return count > size / 2;
    }

    /* Driver program to test the above functions */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input orang yg ngevote: ");
        int voteAmount = sc.nextInt();
        GeekForGeekBEM majorelement = new GeekForGeekBEM();
        int a[] = new int[voteAmount];
        for (int i = 0; i < voteAmount; i++) {
            System.out.print("Participant " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        majorelement.printMajority(a,voteAmount);
    }
}
