
import java.util.Scanner;

public class Practicum1_DoWhile1 {

    public static void main(String[] args) {
        int number, fac, i;
        System.out.println("===Program Calculates Factorial Values With While===");
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        fac = 1;
        i = 1;
        do {
            fac = fac * i;
            i++;
        } while (i <= number);
        System.out.printf("Factorial value of that number is: %d \n", fac);
    }
}
