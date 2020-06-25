package week2.assignments;

import java.util.Scanner; // import scanner from library

public class GameRentalLoanMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        GameRentalLoan loan = new GameRentalLoan(); // instantiate loan from GameRentalLoan class 
        String wrongInput = "The data you entered is incorrect, please try again\n"; // declare string wrongInput
        
        System.out.println("Video Game Rental Shop"); // print text "Video Game Rental Shop" 
        while (true) { // iteration to check whether the value of loan.id is above 0 or not
            System.out.print("Input member ID: "); // print text "Input member ID: "
            loan.id = sc.nextInt(); // input the id of member
            if (loan.id > 0) { // if loan.id is above 0, follow the commands below
                System.out.print("Input member name: "); // print text "Input member name: "
                sc.nextLine(); // consuming the \n character
                loan.memberName = sc.nextLine(); // input the name of member
                while (true) { // iteration to check whether the value of select is 1 to 5 or not
                    loan.displayGameList(); // call the method loan.displayGameList()
                    System.out.print("Select a game (type the number): "); // print text "Select a game (type the number): " 
                    int select = sc.nextInt(); // input the number for choose the game that customer want to rent
                    if (select >= 1 && select <= 5) { // if the value of select is 1 to 5, follow the commands below
                        loan.saveNameAndPrice(select); // call the method loan.saveNameAndPrice(select)
                        while (true) { // iteration to check whether the value of loan.loanDuration is above 0 or not
                            System.out.print("Duration of the loan (days): "); // print text "Duration of the loan (days): "
                            loan.loanDuration = sc.nextInt(); // input the loan duration
                            if (loan.loanDuration > 0) { // if loan.loanDuration is above 0, follow the commands below
                                loan.printPaymentReceipt(); // call the method loan.printPaymentReceipt()
                                break; // exit the iteration
                            } else { // if loan.loanDuration is 0 or below 0, follow the commands below
                                System.out.println(wrongInput); 
                            }
                        }
                        break; // exit the iteration
                    } else {
                        System.out.println(wrongInput); // print wrongInput
                    }
                }
                break; // exit the iteration
            } else {
                System.out.println(wrongInput); // print wrongInput
            }
        }
    }

}
