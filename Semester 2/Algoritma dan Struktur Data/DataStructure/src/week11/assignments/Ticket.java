package week11.assignments;

public class Ticket {

    int queueNum, price; // declare queueNum, price
    String name, movie; // declare name, movie
    Ticket next; // declare next

    public Ticket(int queue, String name, String movieCode, Ticket next) { // constructor
        this.queueNum = queue; // initialize queueNUm
        this.name = name; // initialize name
        this.movie = movieList(movieCode); // initialize movie
        this.price = 35000; // initialize price
        this.next = next; // initialize next
    }

    private String movieList(String movie) { // method to init movie
        if (movie.equalsIgnoreCase("M01")) { // if movie == M01
            return "Orang Kaya Baru"; // return "Orang Kaya Baru"
        } else if (movie.equalsIgnoreCase("M02")) { // if movie == M02
            return "Terlalu Tampan"; // return "Terlalu Tampan"
        } else if (movie.equalsIgnoreCase("M03")) { // if movie == M03
            return "Escape Room"; // return "Escape Room"
        } else if (movie.equalsIgnoreCase("M04")) { // if movie == M04
            return "Welcome Home"; // return "Welcome Home"
        }
        return null; // if not in above, return null
    }

    public void print() { // method to print Ticket
        System.out.println("Queue number: " + queueNum); // print queueNum
        System.out.println("Customer name: " + name); // print name
        System.out.println("Movie: " + movie); // print movie
        System.out.println("Ticket price: " + price); // print price
    }
}
