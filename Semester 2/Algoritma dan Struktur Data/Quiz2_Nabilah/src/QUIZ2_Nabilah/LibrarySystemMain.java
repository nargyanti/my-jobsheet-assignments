// Nabilah Argyanti Ardyningrum
// T1-1H
package QUIZ2_Nabilah;

import java.util.Scanner;

public class LibrarySystemMain {

    static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("\nMain menu: ");
        System.out.println("1. Input book data");
        System.out.println("2. Print book data");
        System.out.println("3. Borrow books");
        System.out.println("4. Return books");
        System.out.println("5. Exit");
        System.out.print("Choose the menu by typing the number: ");
    }

    public static String inputName() {
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        return name;
    }

    public static int inputISBN() {
        System.out.print("ISBN: ");
        int ISBN = sc.nextInt();
        return ISBN;
    }

    public static int inputStock() {
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        return stock;
    }

    public static int inputAmount() {
        System.out.print("Amount: ");
        int amount = sc.nextInt();
        return amount;
    }

    public static void main(String[] args) {

        LibrarySystem library = new LibrarySystem();
        System.out.println("POLINEMA LIBRARY SYSTEM");
        boolean backMainMenu = true;
        while (backMainMenu) {
            try {
                mainMenu();
                int answer = sc.nextInt();
                switch (answer) {
                    case 1:
                        System.out.println("\n---Input book data---");                        
                        int ISBN = inputISBN();
                        String name = inputName();
                        int stock = inputStock();
                        library.inputBookData(ISBN, name, stock);
                        break;
                    case 2:
                        System.out.println("\n---Print book data---\n");                        
                        library.printBookData();
                        break;
                    case 3:
                        System.out.println("\n---Borrow books---\n");
                        library.printBookData();
                        ISBN = inputISBN();
                        int amount = inputAmount();
                        library.borrowBook(ISBN, amount);
                        break;
                    case 4:
                        System.out.println("\n---Return books---\n");
                        library.printBookData();
                        ISBN = inputISBN();
                        amount = inputAmount();
                        library.returnBook(ISBN, amount);
                        break;
                    case 5:
                        System.out.println("\nGood bye!");
                        backMainMenu = false;
                        break;
                    default:
                        System.out.println("\nYour answer is incorrect");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
