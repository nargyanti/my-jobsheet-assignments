package week2.assignments;

import java.util.Scanner;

public class PacManMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan pm = new PacMan();
        String wrongInput = "Sorry, the number you entered is wrong, please try again\n";
        
        while (true) { // iteration to check whether the pm.width is above 0 or not
            System.out.print("Enter the width of area: "); // print text "Enter the width of area: "
            pm.width = sc.nextInt(); // input the value of pm.width
            if (pm.width > 0) { // if pm.width is above 0, follow the commands below
                while (true) { // iteration to check whether the pm.height is above 0 or not
                    System.out.print("Enter the height of area: "); // print text "Enter the height of area: "
                    pm.height = sc.nextInt(); // input the value of pm.height
                    if (pm.height > 0) { // if pm.height is above 0, follow the commands below
                        pm.x = 0; // declare pm.x = 0
                        pm.y = 0; // declare pm.y = 0
                        System.out.println("Default position: "); // print text "Default position: "
                        pm.printPosition(); // call method pm.printPosition() to print default position
                        OUTER:
                        while (true) { // iteration to check whether the movePosition is 1 to 4 or not
                            System.out.println("Move the PacMan position: "); // print text "Move the PacMan position: "
                            System.out.println("1. Move left"); // print text "1. Move left"
                            System.out.println("2. Move right"); // print text "2. Move right"
                            System.out.println("3. Move up"); // print text "3. Move up"
                            System.out.println("4. Move down"); // print text "4. Move down"
                            System.out.print("Input your answer: "); // print text "Input your answer: "
                            int movePosition = sc.nextInt(); // input the value of movePosition
                            if (movePosition >= 1 && movePosition <= 4) { // if movePosition is 1 to 4, follow the commands below
                                switch (movePosition) { // selection to determine the position shift made by PacMan
                                    case 1: // if movePosition is 1, follow the commands below
                                        pm.moveLeft(); // call pm.moveLeft() to move left the PacMan
                                        break; // exit the selection
                                    case 2: // if movePosition is 2, follow the commands below
                                        pm.moveRight(); // call pm.moveRight() to move right the PacMan
                                        break; // exit the selection
                                    case 3: // if movePosition is 3, follow the commands below
                                        pm.moveUp(); // call pm.moveUp() to move up the PacMan
                                        break; // exit the selection
                                    case 4: // if movePosition is 4, follow the commands below
                                        pm.moveDown(); // call pm.moveDown() to move down the PacMan
                                        break; // exit the selection
                                }
                                System.out.println("The current position: "); // print text "The current position: "
                                pm.printPosition(); // call method pm.printPosition() to print current position
                                OUTER_1: 
                                while (true) { // iteration to check whether moveAgain is 0, 1, or not both 
                                    System.out.print("Do you want to move PacMan again (0 = No, 1 = Yes)? "); // print text to comfirmation
                                    int moveAgain = sc.nextInt(); // input the value of moveAgain
                                    switch (moveAgain) { // selection to determine the next commands
                                        case 0: // if moveAgain is 0, follow the commands below
                                            System.out.println("The final position: "); // print text "The final position: "
                                            pm.printPosition(); // call method pm.printPosition() to print final position
                                            break OUTER; // exit the iteration OUTER
                                        case 1: // if moveAgain is 0, follow the commands below
                                            break OUTER_1; // exit the iteration OUTER_1
                                        default: // if moveAgain is not 0 or 1, follow the commands below
                                            System.out.println(wrongInput); // print wrongInput
                                            break; // repeat the question
                                    }
                                }
                            } else { // if the movePosition is not 1 to 4, follow the commands below
                                System.out.println(wrongInput); // print wrongInput
                            }
                        }
                        break; // exit the iteration
                    } else { // if pm.height is 0 or below 0, follow the commands
                        System.out.println(wrongInput); // print wrongInput
                    }
                }
                break; // exit the iteration
            } else { // if pm.width is 0 or below 0, follow the commands
                System.out.println(wrongInput); // print wrongInput
            }
        } 
    }

}
