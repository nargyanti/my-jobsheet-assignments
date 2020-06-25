import java.util.Scanner;
public class SelectionPracticum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of Y: ");
        int Y = sc.nextInt();
        if (Y % 2 == 0 && Y % 6 != 0 && Y % 15 != 0) {
            System.out.println("Multiples number 2");
        } else if (Y % 6 == 0 && Y % 15 != 0) {
            System.out.println("Multipples number 6");
        } else if (Y % 15 == 0) {
            System.out.println("Multiples number 15");
        } else {
            System.out.println("Numbers are not multiples of 2, 6, or 15");
        }
    }
}
