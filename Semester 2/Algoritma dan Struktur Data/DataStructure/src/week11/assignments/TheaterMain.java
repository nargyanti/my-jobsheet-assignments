package week11.assignments;

import java.util.Scanner;

public class TheaterMain {

    public static void menu() { // method to print menu
        System.out.println(""); // print enter
        System.out.println("1. Enqueue"); // print "1. Enqueue"
        System.out.println("2. Dequeue"); // print "2. Dequeue"
        System.out.println("3. Print"); // print "3. Print"
        System.out.println("4. Peek front"); // print "4. Peek front"
        System.out.println("5. Peek rear"); // print "5. Peek rear"
        System.out.println("6. Peek position by input customer queue"); // print "6. Peek position"
        System.out.println("7. Peek customer by input position"); // print "7. Peek customer"
        System.out.println("8. Exit"); // print "8. Exit"
        System.out.print("Type your answer: "); // print "Type your answer: "
    }

    public static void movieList() { // method to print movieList
        System.out.println("M01. Orang Kaya Baru"); // print "M01. Orang Kaya Baru"
        System.out.println("M02. Terlalu Tampan"); // print "M02. Terlalu Tampan"
        System.out.println("M03. Escape Room"); // print "M03. Escape Room"
        System.out.println("M04. Welcome Home"); // print "M04. Welcome Home"
        System.out.println("Type your choice by typing the code"); // print command
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate sc
        System.out.println("======= POLINEMA THEATER ======="); // print title
        Theater queue = new Theater(); // create new object queue
        boolean backToMenu = true; // declare and initialize backToMenu
        while (backToMenu) { // iteration to check back to main menu or not
            try { // try
                menu(); // call menu method
                int select = sc.nextInt(); // input select from keyboard                
                switch (select) { // selection to check select
                    case 1: // enqueue
                        System.out.print("\nName: "); // print command
                        sc.nextLine(); // to enter 1 line 
                        String name = sc.nextLine(); // input name from keyboard
                        movieList(); // call movieList
                        System.out.print("Movie: "); // print command
                        String movieCode = sc.next(); // input movie from keyboard                       
                        queue.enqueue(name, movieCode); // call queue.enqueue()
                        System.out.println("\nCurrent queue: "); // print text
                        queue.print(); // print queue
                        break; // exit the selection
                    case 2: // dequeue
                        System.out.println(""); // enter
                        Ticket dataRetrieve = queue.dequeue(); // call queue.dequeue()
                        if (dataRetrieve != null) { // if data not null
                            System.out.println("Data retrieved: "); // print data retrieved
                            dataRetrieve.print(); // print data retrieve
                            System.out.println("\nCurrent queue: "); // print text
                            queue.print(); // print queue
                            break; // exit the selection
                        }
                    case 3: // print queue
                        System.out.println(""); // print enter
                        queue.print(); // print queue
                        break; // exit the selection
                    case 4: // peek front
                        System.out.println(""); // enter
                        queue.peekFront(); // call method queue.peekFront()
                        break; // exit the selection
                    case 5: // peek rear 
                        System.out.println(""); // enter
                        queue.peekRear(); // call method queue.peekRear()
                        break; // exit the selection
                    case 6: // peek queue position
                        System.out.print("\nEnter queue number: "); // print command
                        sc.nextLine(); // enter 1 line
                        int queueNum = sc.nextInt(); // input queueNum from keyboard
                        queue.peekPosition(queueNum); // call queue.peekPosition(queueNum)
                        break; // exit the selection
                    case 7: // peek customer that have position number x
                        System.out.print("\nEnter queue position: "); // print command
                        int position = sc.nextInt(); // enter position from keyboard
                        queue.peekCustomer(position); // call queue.peekCustomer(position)
                        break; // exit the selection
                    case 8: // exit from program
                        System.out.println("Good bye!"); // print good bye
                        backToMenu = false; // backToMenu = false
                        break; // exit the selection
                    default: // if answer is not 1 until 8
                        System.out.println("Your answer is incorrect\n"); // print text
                        break; // end switch 
                }
            } catch (Exception e) { // catch error
                System.out.println(e.getMessage()); // print error
            }
        }

    }
}
