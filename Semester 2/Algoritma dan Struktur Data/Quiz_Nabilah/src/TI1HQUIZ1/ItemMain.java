package TI1HQUIZ1;

import java.util.Scanner;

public class ItemMain { // Nabilah Argyanti Ardyiningrum, Code: B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wrongInput = "Your data that you inputed is wrong, please try again";

        while (true) {
            System.out.print("Total of items: ");
            int totalItem = sc.nextInt();
            Item[] item = new Item[totalItem];

            int itemPrice[] = new int[totalItem];
            int stock[] = new int[totalItem];

            if (totalItem > 0) {
                System.out.println("=============================================");
                for (int i = 0; i < totalItem; i++) {
                    System.out.println("\nItem " + (i + 1));
                    item[i] = new Item();
                    System.out.print("Name: ");
                    sc.nextLine();
                    item[i].name = sc.nextLine();
                    while (true) {
                        System.out.print("Input the price: ");
                        item[i].price = sc.nextInt();
                        if (item[i].price > 0) {
                            while (true) {
                                System.out.print("Input the stock: ");
                                item[i].stock = sc.nextInt();
                                if (item[i].stock > 0) {
                                    stock[i] = item[i].stock;
                                    itemPrice[i] = item[i].calculateItemPrice(item[i].stock, item[i].price);
                                    break;
                                } else {
                                    System.out.println(wrongInput);
                                }
                            }
                            break;
                        } else {
                            System.out.println(wrongInput);
                        }
                    }
                }
                System.out.println("=============================================");
                int totalPrice = item[0].calculateTotalPrice(itemPrice, 0, totalItem - 1);
                int totalStock = item[0].calculateTotalStock(stock, 0, totalItem - 1);
                System.out.println("=============================================");
                for (int i = 0; i < totalItem; i++) {
                    System.out.println("\nItem " + (i + 1));
                    item[i].printItemData();
                }
                System.out.println("\nTotal Stock : " + totalStock);
                System.out.println("Total Price : " + totalPrice);
                System.out.println("=============================================");
                break;
            } else {
                System.out.println(wrongInput);
            }
        }
    }
}
