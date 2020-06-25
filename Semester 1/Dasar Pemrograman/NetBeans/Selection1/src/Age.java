import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age;
        
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        String output = (age>=17)? "Allowed to drive" : "Not allowed to drive"; 
        
        System.out.println(output);
    }    
}
