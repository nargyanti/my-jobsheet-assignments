
import java.util.Scanner;

public class DiscussionTheory {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        int total = 0;
        System.out.print("Input the total of student: ");
        int student = number.nextInt();
        int a[] = new int[student];
                    String nama[] = new String[student];
        for (int i = 0; i <= student; i++) {
            System.out.print("Name: \n");
            String name = text.nextLine();
            nama[i] = name;
        }
        for (String k : nama) {
            System.out.println(k);
        }
    }

}
