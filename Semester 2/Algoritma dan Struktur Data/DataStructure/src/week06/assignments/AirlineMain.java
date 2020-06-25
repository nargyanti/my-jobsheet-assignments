package week6.assignments;

import java.util.Scanner;

public class AirlineMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        AirlineTicket ticket = new AirlineTicket(); // create object ticket
        String name[] = {"SRIWIJAYA AIR", "CITILINK INDONESIA", "BATIK AIR", "LION AIR",
            "GARUDA INDONESIA", "CITILINK INDONESIA", "BATIK AIR"}; // declare and initialize name[]
        String time[]= {"09.35 - 11.00", "15.35 - 17.05", "14.30 - 16.00", "12.45 - 13.55",
        "13.10 - 15.00", "10.30 - 12.00", "11.15 - 12.45"}; // declare and initialize time[]
        int price[] = {443000,408900,542000,418800,1334000,517800,477100};

        for (int i = 0; i < name.length; i++) { // iteration to input array to object
            TicketList list = new TicketList(name[i], time[i], price[i]);// instantiate list
            ticket.addTicket(list); // call method ticket.addTicket with parameter list
        }
        ticket.printTicketList(); // call the method to print the list of ticket
        System.out.println("\n1. Bubble Sort\n2. Selection Sort"); // print the list of sorting 
        System.out.print("Choose the sorting method by typing the number: "); // print the command
        int answer = sc.nextInt(); // input the answer to decide the sorting method
        if (answer == 1) { // if answer = 1, follow the command
            System.out.println("\nBUBBLE SORT:"); // print text "\nBUBBLE SORT:"
            ticket.ticketBubbleSort();// call the method to do sorting with bubble sort
        } else if (answer == 2) { // if answer = 2, follow the command
            System.out.println("\nSELECTION SORT:"); // print text "\nSELECTION SORT:"
            ticket.ticketSelectionSort();// call the method to do sorting with selection sort
        }
        ticket.printTicketList(); // call the method to print the result
    }
}
