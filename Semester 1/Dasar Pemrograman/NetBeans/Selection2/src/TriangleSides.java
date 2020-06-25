import java.util.Scanner;
public class TriangleSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int lenght1, lenght2, lenght3;
        String triangle;
        
        System.out.print("Enter the first lenght of triangle: ");
        lenght1 = sc.nextInt();
        System.out.print("Enter the second lenght of triangle: ");
        lenght2 = sc.nextInt();
        System.out.print("Enter the third lenght of triangle: ");
        lenght3 = sc.nextInt();
        
        if (lenght1 > 0 && lenght2 > 0 && lenght3 > 0){
            if (lenght1==lenght2 && lenght2==lenght3){
                triangle = "equilateral";
            } else if (lenght1 == lenght2 || lenght2 == lenght3 || lenght1==lenght3){
                triangle = "isosceles";
            } else{
                triangle = "just any";
            }
                System.out.println("The type of triangle is " + triangle);
        } else {
            System.out.println("The number you entered is incorrect");
        }
    }
}
