import java.util.Scanner;
public class Task5_ArrayMax {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the contents of the array: ");
            int content = sc.nextInt();
            if (content > 0) {
                int value[] = new int[content];
                for (int i = 0; i < value.length; i++) {
                    System.out.print("Enter the array " + i + ": ");
                    value[i] = sc.nextInt();
                }
                int biggest = value[0];
                for (int i = 0; i < value.length; i++) {
                    if (biggest < value[i]) {
                        biggest = value[i];
                    }
                }
                System.out.println("Biggest number: " + biggest);
                break;
            } else {
                System.out.println("The number you entered is incorrect, please try again");
            }
        }
    }
}