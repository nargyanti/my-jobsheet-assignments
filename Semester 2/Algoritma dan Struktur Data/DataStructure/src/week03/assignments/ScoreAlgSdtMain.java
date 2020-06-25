package week3.assignments;

import java.util.Scanner;

public class ScoreAlgSdtMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc

        System.out.print("Input the total of students: "); // print text input total student
        int totalStudents = sc.nextInt(); // input the value of totalStudents from keyboard

        ScoreAlgSdt sas = new ScoreAlgSdt(); // instantiate array of object sas
        String nameStudent[] = new String[totalStudents]; // instantiate array nameStudent
        double totalScore[] = new double[totalStudents]; // instantiate array totalScore[]

        for (int i = 0; i < totalStudents; i++) { // iteration to input and calculate the total score and average
            System.out.println("\nStudent " + (i + 1) + ": "); // print text the sequence of student
            System.out.print("Name: "); // print text "Name: "
            sc.nextLine(); // function to consuming the leftover new line
            sas.nameSdt = sc.nextLine(); // input the value of sas[i].nameSdt from keyboard
            System.out.print("Assignment score: "); // print text "Assignment score: "
            sas.scoreAssgment = sc.nextInt(); // input the value of sas[i].scoreAssgment from keyboard
            System.out.print("Quiz score: "); // print text "Quiz score: "
            sas.scoreQuiz = sc.nextInt(); // input the value of sas[i].scoreQuiz from keyboard
            System.out.print("Mid-semester Score: "); // print text "Mid-semester Score: "
            sas.scoreMid = sc.nextInt(); // input the value of sas[i].scoreMid from keyboard 
            System.out.print("Final semester Score: "); // print text "Final semester Score: "
            sas.scoreFinal = sc.nextInt(); // input the value of sas[i].scoreFinal from keyboard
            nameStudent[i] = sas.nameSdt; // fill the nameStudent[i] with sas.nameSdt
            totalScore[i] = sas.calculateTotalScore(); // calculate the student's total score
        }

        double average = sas.calculateAverage(totalScore, 0, totalStudents - 1); // calculate the all of student's average score
        System.out.println("\n====================================================="); // print the border
        System.out.println("        Total Student Score of Algorithm Courses       "); // print the title 
        System.out.println("====================================================="); // print the border
        for (int i = 0; i < totalStudents; i++) { // iteration to print the name and total score
            System.out.println(nameStudent[i] + ": " + totalScore[i]); // print name and total
        }
        System.out.printf("Average score: %.2f\n", average); // print the all of student's average score
    }

}
