import java.util.Scanner;
public class RaharjaSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int totalSal, baseSal, food, trans;
        float tax, finalSal;
        
        System.out.print("Enter the base salary: ");
        baseSal = sc.nextInt();
        System.out.print("Enter the food allowance: ");
        food = sc.nextInt();
        System.out.print("Enter the transport money: ");
        trans = sc.nextInt();
        
        totalSal = baseSal + food + trans;
        
        if (totalSal >= 1000000){
            tax = totalSal * 0.1f;
            finalSal = totalSal - tax;
            System.out.println("Your net salary is: " + finalSal);
        }
        else{
            System.out.println("Your net salary is: " + totalSal);
        }   
    }
}
