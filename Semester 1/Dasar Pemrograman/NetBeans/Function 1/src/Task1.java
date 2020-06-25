import java.util.Scanner;
public class Task1 {
    static int Max3(int bil1, int bil2, int bil3) {
        int arr[] = {bil1, bil2, bil3};
        int biggest = 0;
        for (int check : arr) {
            if (check > biggest) {
                biggest = check;
            }
        }
        return biggest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.println("The maximum value between the three values is " + Max3(num1, num2, num3));
    }
}
