package week2.assignments;

import java.util.Scanner; // import scanner from library

public class ItemMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        Item item = new Item(); // instantiate item from Item class
        String wrongInput = "The data you entered is incorrect, please try again\n"; // declare String wrongInput

        System.out.print("Enter item name: "); // print text "Enter item name: "
        item.name = sc.nextLine(); // input the item.name 
        while (true) { // iteration to check whether the value of item.unitPrice is above 0 or not
            System.out.print("Enter price per item: "); // print text "Enter price per item: "
            item.unitPrice = sc.nextInt(); // input the item.unitPrice 
            if (item.unitPrice > 0) { // if the item.unitPrice is above 0, follow the commands below
                while (true) { // iteration to check whether the value of item.total is above 0 or not
                    System.out.print("Enter the item amount: "); // print text "Enter the item amount: "
                    item.total = sc.nextInt(); // input item.total
                    if (item.total > 0) { // if the item.total is above 0, follow the commands below
                        System.out.println("==========================================="); // print border
                        System.out.println("Item name: " + item.name); // print the item name
                        System.out.println("Price per item: Rp" + item.unitPrice); // print the price per item
                        System.out.println("Item amount: " + item.total); // print the item amount
                        System.out.println("Total price: Rp " + item.pricePaid()); // print the total price
                        System.out.println("==========================================="); // print border
                        break; // exit the iteration
                    } else { // if item.total is 0 or below 0, follow the commands below
                        System.out.println(wrongInput); // print text wrongInput
                    }
                }
                break; // exit the iteration
            } else { // if item.unitPrice is 0 or below 0, follow the commands below
                System.out.println(wrongInput); // print text wrongInput
            }
        }
    }

}
