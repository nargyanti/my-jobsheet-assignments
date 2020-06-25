import java.util.Scanner;
public class LoopingPracticum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "which has been reduced by number 3 and repeated 5 times";
        System.out.print("Input the value of A: ");
        int A = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            A -= 3;
        }
        if (A % 2 == 0) {
            System.out.println("The number of A (" + A + ") " + sentence + " is an even number");
        } else {
            System.out.println("The number of A (" + A + ") " + sentence + " is an odd number");
        }
    }
}
