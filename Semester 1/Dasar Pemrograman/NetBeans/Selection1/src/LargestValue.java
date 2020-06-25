import java.util.Scanner;
public class LargestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b, largest;
        
        System.out.print("Enter the first value: ");
        a = sc.nextInt();
        System.out.print("Enter the second value: ");
        b = sc.nextInt();
        
        String output = (a>b)? a + " is larger than " + b : b + " is larger than " + a;
        
        System.out.println(output);
    }
}
