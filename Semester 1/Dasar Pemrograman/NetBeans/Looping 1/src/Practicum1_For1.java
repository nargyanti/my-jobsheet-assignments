
import java.util.Scanner;

public class Practicum1_For1 {

    public static void main(String[] args) {
        int number, fac, i;
        System.out.println("===Program Calculates Factorial Values With For===");
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        fac = 1;
        for (i = 1; 1 <= number; i++) {
            fac = fac * i;
        }
        System.out.printf("Factorial value of that number is: %d \n", fac);
    }
}
