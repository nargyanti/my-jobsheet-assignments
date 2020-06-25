package week2.assignments;

import java.util.Scanner; // import scanner from library

public class StudentScoreMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        String wrongInput = "The data you entered is incorrect, please try again\n"; // declare String wrongInput

        while (true) { // iteration to check whether totalStudent is above 0 or not
            System.out.print("Total student: "); // print text "Total student: "
            int totalStudent = sc.nextInt(); // input totalStudent value
            if (totalStudent > 0) { // if totalStudent is above 0, follow the commands below
                StudentScore[] stdscr = new StudentScore[totalStudent]; // instantiate stdscr from StudentScore class
                for (int i = 0; i < totalStudent; i++) { // iteration to input the score1 and score2
                    stdscr[i] = new StudentScore(); // instantiate new array index stdscr[i]
                    System.out.println("===================================="); // print border
                    System.out.println("Student " + (i + 1)); // print the sequence of student
                    while (true) { // iteration to check whether stdscr[i].score1 is above 0 or not
                        System.out.print("Score 1: "); // print text "Score 1: "
                        stdscr[i].score1 = sc.nextInt(); // input stdscr[i].score1 value
                        if (stdscr[i].score1 > 0) { // if stdscr[i].score1 is above 0, follow the commands below
                            while (true) { // iteration to check whether stdscr[i].score2 is above 0 or not
                                System.out.print("Score 2: "); // print text "Score 2: "
                                stdscr[i].score2 = sc.nextInt(); // input stdscr[i].score2 value
                                if (stdscr[i].score2 > 0) { // if stdscr[i].score2 is above 0, follow the commands below
                                    break; // exit the iteration
                                } else { // if stdscr[i].score2 is 0 or below 0, follow the commands below
                                    System.out.println(wrongInput); // print wrongInput
                                }
                            }
                            break; // exit the iteration
                        } else { // if stdscr[i].score1 is 0 or below 0, follow the commands below
                            System.out.println(wrongInput); // print wrongInput
                        }
                    }
                }
                System.out.println(""); // print enter
                for (int i = 0; i < totalStudent; i++) { // iteration to print the best score
                    System.out.println("The best score student " + (i + 1) + ": " + stdscr[i].calculateBestScore()); // print the best score
                }
                break; // exit the iteration
            } else { // if totalStudent is 0 or below 0, follow the commands below
                System.out.println(wrongInput); // print wrongInput
            }
        }
    }

}
