import java.util.Scanner;
public class Experiment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int value1, value2, average;
        
        System.out.print("Enter the first value: ");
        value1 = input.nextInt();
        System.out.print("Enter the second value: ");
        value2 = input.nextInt();
        
        average = (value1 + value2) / 2;
        
        if (average>=100){
            average-=5;
        }
        else{
            average+=0;
        }
        
        System.out.println("The average value is " +average);
    }   
}
