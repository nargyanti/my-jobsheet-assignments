import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu;
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Guess the numbers (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer != number) {
                    if (answer > number) {
                        System.out.println("The number you entered is larger than the correct answer");
                    } else {
                        System.out.println("The number you entered is smaller than the correct answer");
                    }
                } else {
                    success = (answer == number);
                }
                System.out.print(success);
            } while (!success);
            System.out.print("Do you want to repeat the game (Y/y)? ");
            menu = input.findInLine(".").charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    } 
}
