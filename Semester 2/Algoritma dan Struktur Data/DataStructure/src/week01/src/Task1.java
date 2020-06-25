import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);
    static String packageList[] = {"Chicken Package", "Oke Package"};
    static String menuList[][] = {{"Chicken A : Rp 12.000", "Chicken B : Rp 15.000", "Chicken C : Rp 20.000"},
    {"Oke A : Rp 10.000", "Oke B : Rp 12.000", "Oke C : Rp 15.000"}};
    static int menuPrice[][] = {{12000, 15000, 20000}, {10000, 12000, 15000}};
    static String typeAnswer = "Type your answer by typing the number: ";
    static String wrongInput = "Sorry, the input you entered is invalid, please try again";
    static int totalPrice = 0;

    public static void main(String[] args) {
        while (true) { // iteration to check whether the package that you typed is correct or not
            System.out.println("\nChoose your package:");
            System.out.print("1. Chicken Package\n2. Oke Package\n" + typeAnswer);
            int choosePackage = sc.nextInt(); //input the package you want to buy
            if (choosePackage == 1 || choosePackage == 2) { // if you input 1 and 2, follow the commands below
                while (true) { // iteration to check whether the item that you typed is correct or not
                    System.out.println("\nChoose your " + packageList[choosePackage - 1] + " menu: ");
                    for (int i = 0; i < menuList[0].length; i++) { // iteration to show the menu list
                        System.out.println((i + 1) + ". " + menuList[choosePackage - 1][i]); // print the menu list
                    } // closing iteration menu list
                    System.out.print(typeAnswer);
                    int selectedItem = sc.nextInt(); // input the selected item
                    if (selectedItem >= 1 && selectedItem <= 3) { // if you input values 1, 2, or 3, follow the commands below
                        while (true) { // iteration to check whether the quantity that you typed is correct or not
                            System.out.print("Type the amount of items you want to buy: ");
                            int itemQuantity = sc.nextInt(); // input the quantity of item that you want to buy
                            if (itemQuantity > 0) { // if the quantity of items purchased is above 0, follow the commands below
                                totalPrice = totalPrice + addPrice(choosePackage, selectedItem, itemQuantity, totalPrice); // calculate tha totalPrice 
                                System.out.println("\nYour total price is Rp " + totalPrice); // displays the current total price
                                break; // exit the quantity iteration
                            } else { // if the quantity is below 0, follow the commads below
                                System.out.println(wrongInput); // display the messages and the question will be repeated
                            } // closing quantity selection
                        } // closing typing quantity iteration
                        break; // exit the item iteration
                    } else { // if the number typed is other than 1, 2, or 3, follow the commands below
                        System.out.println(wrongInput); // display the messages and the question will be repeated
                    } // closing item selection
                } // closing typing item iteration
                while (true) { // iteration to check whether the answer you typed is correct or not
                    System.out.print("\nDo you want to buy again?\n0 = No\n1 = Yes\n" + typeAnswer);
                    int buyAgain = sc.nextInt(); //input the answer (buy again or not)
                    switch (buyAgain) { // selection to check whether to order again or not
                        case 1: // if you want to buy again, then follow the commands
                            main(args); // back to function main(args)
                            break; // exit the order iteration
                        case 0: // if you don't want to buy again, then follow the commands
                            System.out.println("\nThe price you have to pay is Rp " + totalPrice); // print the total price
                            System.exit(buyAgain); //exit the program
                            break; // exit the order iteration
                        default: // if the answer is other than 1 and 0, follow the commands below
                            System.out.println(wrongInput); // display the messages and the question will be repeated
                            break; // exit the order iteration
                    } // closing order selection
                } // closing typing answer iteration
            } else { // if the package is other than 1 or 2, follow the commands
                System.out.println(wrongInput); // display the messages and the question will be repeated
            } // closing package selection
        } // closing typing package iteration
    }

    static int addPrice(int choosePackage, int selectedItem, int itemQuantity, int totalPrice) { // calculate the total price of the item you just ordered
        int addPrice = (menuPrice[choosePackage - 1][selectedItem - 1] * itemQuantity); // calculate the price by multiply the price with the quantity
        return addPrice; // return the value of addPrice
    }
}
