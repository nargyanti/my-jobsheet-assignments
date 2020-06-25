// Nabilah Argyanti Ardyningrum
// T1-1H
package onlinelibrarysystem;

import java.util.Scanner;

public class LibrarySystemMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibrarySystem library = new LibrarySystem(0);
        System.out.println("POLINEMA LIBRARY SYSTEM");
        boolean backMainMenu = true;
        while (backMainMenu) {
            System.out.println("\nMain menu: ");
            System.out.println("1. Input book data");
            System.out.println("2. Print book data");
            System.out.println("3. Searching book data");
            System.out.println("4. Borrow books");
            System.out.println("5. Return books");
            System.out.print("Choose the menu by typing the number: ");
            int menuAnswer = sc.nextInt();
            switch (menuAnswer) {
                case 1:
                    System.out.println("\nInput book data");
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("ISBN: ");
                    int isbn = sc.nextInt();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    Book book = new Book(isbn, name, stock);
                    library.totalData++;
                    library.inputBookData(book);
                    break;
                case 2:
                    System.out.println("\nPrint and Sort Data based on ISBN\n");
                    library.printBookData();
                    break;
                case 3:
                    System.out.println("\nSearching book based on ISBN");
                    System.out.print("Type the ISBN number: ");
                    int search =  sc.nextInt();
                    int position = library.searchingBookData(search, 0, library.totalData - 1);
                    library.printPosition(search, position);
                    break;
                case 4:
                    System.out.println("\nBorrow books\n");
                    System.out.println("Book list: ");
                    library.printBookData();
                    System.out.print("\nType the index: ");
                    int index = sc.nextInt();
                    System.out.print("Borrow amount: ");
                    int amount = sc.nextInt();
                    library.borrowBooks(index, amount);
                    break;
                case 5:
                    System.out.println("\nReturn books\n");
                    System.out.println("Book list: ");
                    library.printBookData();
                    System.out.print("\nType the index: ");
                    index = sc.nextInt();
                    System.out.print("Return amount: ");
                    amount = sc.nextInt();
                    library.returnBook(index, amount);
                    break;
            }
            System.out.println("Do you want to back to main menu? (0 = no, 1 = yes) ");
            System.out.print("Type your answer: ");
            int answerBackMainMenu = sc.nextInt();
            if (answerBackMainMenu == 1) {
                backMainMenu = true;
            } else {
                backMainMenu = false;
            }
        }
    }

}
