import java.util.Scanner;
public class SumAvgOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, odd, total = 0;
        float avg;

        System.out.println("Calculate the sum of the squares of odd number of N numbers");
        System.out.println("-------------------------------------------------------------");
        while (true) {
            System.out.print("Enter the number range: ");
            n = sc.nextInt();
            if ((n > 0) && (n%2==1)) {
                odd = n / 2 + 1;
                for (i = 1; i <= n; i += 2) {
                    total = total + (i*i);
                }
                avg = (float) total / odd;
                System.out.printf("The number of odd numbers from 1 to %d is %d \n", n, odd);
                System.out.printf("Total of odd numbers from 1 to %d = %d\n", n, total);
                System.out.printf("The average of odd numbers from 1 to %d = %.2f\n", n, avg);
                break;
            } else if (n < 0) {
                System.out.println("The number you entered is negative number, please try again");
            } else {
                System.out.println("The number you entered is even number, please try again");
            }
        }
    }
}