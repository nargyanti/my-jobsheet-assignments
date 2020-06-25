package week6.assignments;

public class AirlineTicket {
    
    TicketList[] ticket = new TicketList[7]; // create array of object ticket
    int index; // declare index (integer)
    
    void addTicket(TicketList tck) { // method to add ticket to array of object
        ticket[index] = tck; // add tck to ticket[index]
        index++; // increase the value of index
    }
    
    void printTicketList() { // method to print the list of ticket
        System.out.println("------------------------------------------"); // print border
        System.out.println("         MALANG - JAKARTA FLIGHT          "); // print title
        System.out.println("------------------------------------------"); // print border
        for (TicketList printList : ticket) { // iteration to call the value of ticket
            printList.print(); // print the informatioon
        }
    }
    
    void ticketBubbleSort() { // method to do ascending sorting using bubble sort
        for (int i = 0; i < ticket.length - 1; i++) { // iteration to start the checking, from index i
            for (int j = 1; j < ticket.length - i; j++) { // iteration to do a selection 
                if (ticket[j].price < ticket[j - 1].price) { // if ticket[j].price < ticket[j - 1].price
                    TicketList temp = ticket[j]; // save the ticket[j] to temp
                    ticket[j] = ticket[j - 1]; // change the value of ticket[j] to ticket[j-1]
                    ticket[j - 1] = temp; // fill the value ticket[j-1] with temp
                }
            }
        }
    }
    
    void ticketSelectionSort() { // method to do ascending sortin gusing selection sort
        for (int i = 0; i < ticket.length - 1; i++) { // iteration to start the checking from index i
            int indexMin = i; // declare and initialize indexMin 
            for (int j = i + 1; j < ticket.length; j++) { // iteration to search the index that have smallest value
                if (ticket[j].price < ticket[indexMin].price) { // selection to check the smallest value
                    indexMin = j; // change the value of indexMin with j
                }
            }
            TicketList temp = ticket[indexMin]; // save the value of ticket[indexMin] to temp
            ticket[indexMin] = ticket[i]; // the value of ticket[i] is saved to ticket[indexMin]
            ticket[i] = temp; // the ticket[i] is filled with temp as smallest value
        }
    }
}
