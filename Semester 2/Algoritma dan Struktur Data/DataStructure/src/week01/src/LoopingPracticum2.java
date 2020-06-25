import java.util.Scanner;
public class LoopingPracticum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input your current balance: Rp ");
            double balance = sc.nextDouble();
            if (balance > 0) {
                for (int i = 0; i < 12; i++) {
                    balance = balance + (balance * 0.02);
                }
                System.out.printf("Your balance after 12 months is Rp %.2f" , balance);
                System.out.println();
                break;
            } else {
                System.out.println("Sorry, the input you entered is invalid, please try again");
            }
        }
    }
}
