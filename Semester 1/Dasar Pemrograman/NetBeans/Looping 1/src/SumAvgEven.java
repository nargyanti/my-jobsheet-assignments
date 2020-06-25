import java.util.Scanner;
public class SumAvgEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, even, total = 0;
        float avg;

        System.out.println("Calculate the sum of the multiples of even number of N numbers");
        System.out.println("-------------------------------------------------------------");
        while (true) {
            System.out.print("Enter the number range: ");
            n = sc.nextInt();
            if (n > 0 && n%2==0) {
                even = n / 2;
                for (i = 0; i <= n; i += 2) {
                    total += i;
                }
                avg = total / even;
                System.out.printf("The number of even numbers from 1 to %d is %d \n", n, even);
                System.out.printf("Total of even numbers from 1 to %d = %d\n", n, total);
                System.out.printf("The average of even numbers from 1 to %d = %.1f\n", n, avg);
                break;
            } else if (n < 0) {
                System.out.println("The number you entered is negative number, please try again");
            } else {
                System.out.println("The number you entered is odd number, please try again");
            }
        }
    }
}