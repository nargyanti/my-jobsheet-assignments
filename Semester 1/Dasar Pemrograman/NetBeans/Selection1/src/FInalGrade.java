import java.util.Scanner;
public class FInalGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int uas, uts, quiz, assign, finscore;
        
        System.out.print("Enter your final semester exam score: ");
        uas = sc.nextInt();
        System.out.print("Enter your midterm exam score: ");
        uts = sc.nextInt();
        System.out.print("Enter your quiz score: ");  
        quiz = sc.nextInt();
        System.out.print("Enter your assignment score: ");
        assign = sc.nextInt();
        
        uas *= 0.4;
        uts *= 0.3;
        quiz *= 0.1;
        assign *= 0.2;
        
        /*System.out.println(uas);
        System.out.println(uts);
        System.out.println(quiz);
        System.out.println(assign);*/
        
        finscore = uas + uts + quiz + assign;
        
        String output = (finscore<65)? "You will receive remedial" : "You will not receive remedial";
        
        //System.out.println(finscore);
        System.out.println(output);
    }
}
