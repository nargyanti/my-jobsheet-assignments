import java.util.Scanner;
public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String category;
        int salary, netSalary;
        double tax = 0;
        
        System.out.print("Enter category: ");
        category = sc.nextLine();
        System.out.print("Enter the salary amount: ");
        salary = sc.nextInt();
        
        if (category.equals("workers")){
            if (salary > 0){
                if (salary <= 2000000){
                    tax = 0.1;
                } else if (salary <= 3000000){
                    tax = 0.15;
                } else {
                    tax = 0.2;
                }
                netSalary = (int)(salary - (salary * tax));
                System.out.println("Net salary that you receive: " + netSalary);
            } else {
                System.out.println("The income you entered is incorrect");
            }
        } else if (category.equals("Business People")){
            if (salary > 0){
                if (salary <= 2500000){
                    tax = 0.15;
                } else if (salary <= 3500000){
                    tax = 0.2;
                } else {
                    tax = 0.25;
                }
                netSalary = (int) (salary - (salary * tax));
                System.out.println("Net salary that you receive: " + netSalary);
            } else {
                System.out.println("The income you entered is incorrect");                
            }
        } else {
            System.out.println("The category you entered is incorrect");
        }
    }
}
