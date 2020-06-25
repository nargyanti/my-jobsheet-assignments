package week6.assignments;

public class TicketList {

    String airlineName, time;// declare String attribute
    int price; // declare integer attribute

    public TicketList(String name, String tm, int prc) { // method to initialize the value
        airlineName = name; // initialize the value of airlineName
        time = tm; // initialize the value of time
        price = prc; // initialize the value of price
    }
    
    void print() { // method to print the data of airline ticket
        System.out.println(airlineName); // print the title (airline name)
        System.out.println("Time: " + time); // print the time
        System.out.println("Price: Rp " + price); // print the price
        System.out.println("------------------------------------------"); // print border
    }

}
