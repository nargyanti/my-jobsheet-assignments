import java.util.Scanner;
public class Selection1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println("Enter your number: ");
        number = input.nextInt();
        
        String output = (number%2==0)? "Even number" : "odd number";
   
        System.out.println(output);
    }
}
