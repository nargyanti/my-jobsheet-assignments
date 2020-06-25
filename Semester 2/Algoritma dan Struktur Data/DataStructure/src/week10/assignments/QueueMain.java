package week10.assignments;

import java.util.Scanner;

public class QueueMain {

    public static void menu() { // method to print menu
        System.out.println(""); // print enter
        System.out.println("1. Enqueue"); // print "1. Enqueue"
        System.out.println("2. Dequeue"); // print "2. Dequeue"
        System.out.println("3. Print"); // print "3. Print"
        System.out.println("4. Peek front"); // print "4. Peek front"
        System.out.println("5. Peek rear"); // print "5. Peek rear"
        System.out.println("6. Peek position"); // print "6. Peek position"
        System.out.println("7. Peek customer"); // print "7. Peek customer"
        System.out.println("8. Exit"); // print "8. Exit"
        System.out.print("Type your answer: "); // print "Type your answer: "
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate sc
        System.out.println("==== POLINEMA BANK QUEUE SYSTEM ===="); // print title
        System.out.print("Enter the maximum number of queue: "); // print command
        int n = sc.nextInt(); // input max queue from keyboard
        Queue Q = new Queue(n); // create new object Q
        boolean backToMenu = true; // declare and initialize backToMenu
        while (backToMenu) { // iteration to check back to main menu or not
            menu(); // call menu method
            int select = sc.nextInt(); // input select from keyboard
            System.out.println("---------------------------"); // print border
            switch (select) { // selection to check select
                case 1: // enqueue
                    System.out.print("Name: "); // print command
                    sc.nextLine(); // to enter 1 line 
                    String name = sc.nextLine(); // input name from keyboard
                    System.out.print("Account number: "); // print command
                    String accNum = sc.nextLine(); // input acc num from keyboard
                    Customer cust = new Customer(accNum, name); // create object cust
                    Q.enqueue(cust); // call Q.enqueue(cust)
                    break; // exit the selection
                case 2: // dequeue
                    Customer dataRetrieve = Q.dequeue(); // call Q.dequeue()
                    if (dataRetrieve != null) { // if data not null
                        System.out.println("Data retrieved: "); // print data retrieved
                        dataRetrieve.print(); // print data retrieve
                        break; // exit the selection
                    }
                case 3: // print customer data
                    Q.print(); // print customer data
                    break; // exit the selection
                case 4: // peek front
                    Q.peek(); // call method Q.peek()
                    break; // exit the selection
                case 5: // peek rear
                    Q.peekRear(); // call method Q.peekRear()
                    break; // exit the selection
                case 6: // peek position of customer
                    System.out.print("Enter account number: "); // print command
                    sc.nextLine(); // enter 1 line
                    accNum = sc.nextLine(); // input accNum from keyboard
                    Q.peekPosition(accNum); // call Q.peekPosition(accNum)
                    break; // exit the selection
                case 7: // peek customer that have position number x
                    System.out.print("Enter queue position: "); // print command
                    int position = sc.nextInt(); // enter position from keyboard
                    Q.peekCustomer(position); // call Q.peekCustomer(position)
                    break; // exit the selection
                case 8: // exit from program
                    System.out.println("Good bye!"); // print good bye
                    backToMenu = false; // backToMenu = false
                    break; // exit the selection
            }
        } 
    }

}
