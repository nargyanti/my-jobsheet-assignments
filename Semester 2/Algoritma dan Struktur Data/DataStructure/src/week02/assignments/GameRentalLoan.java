package week2.assignments;

public class GameRentalLoan {
    public int id, loanDuration, gamePrice; // declare integer attributes (id, loanDuration, and gamePrice)
    public String memberName, gameName; // declare String attributes (memberName, gameName)
    
    public void displayGameList() { // method to display the list of game
        System.out.println("List of games (rental price every 1 day)"); // print text "List of games (rental price every 1 day)"
        System.out.println("1. Dota 2 : Rp 15.0000"); // print text "1. Dota 2 : Rp 15.0000" 
        System.out.println("2. Minecraft : Rp 20.000"); // print text "2. Minecraft : Rp 20.000"
        System.out.println("3. Super Mario : Rp 5.000"); // print text "3. Super Mario : Rp 5.000"
        System.out.println("4. Fortnite : Rp 18.000"); // print text "4. Fortnite : Rp 18.000"
        System.out.println("5. League of Legends : Rp 12.000"); // print text "5. League of Legends : Rp 12.000"
    }
    
    public void saveNameAndPrice(int selectGame) { // method to save game name and price
        switch (selectGame) { // selection to determine what game that customer want to rent
            case 1: // if you type 1, follow the commands below
                gameName = "Dota 2"; // declare gameName = "Dota 2"
                gamePrice = 15000; // declare gamePrice = 15000
                break; // exit the selection
            case 2: // if you type 2, follow the commands below
                gameName = "Minecraft"; // declare gameName = "Minecraft"
                gamePrice = 20000; // gamePrice = 20000
                break; // exit the selection
            case 3: // if you type 3, follow the commands below
                gameName = "Super Mario"; // declare gameName = "Super Mario"
                gamePrice = 5000; // declare gamePrice = 5000 
                break; // exit the selection
            case 4: // if you type 4, follow the commands below
                gameName = "Fortnite"; // declare gameName = "Fortnite"
                gamePrice = 18000; // declare gamePrice = 18000
                break; // exit the selection
            case 5: // if you type 5, follow the commands below
                gameName = "League of Legends"; // declare gameName = "League of Legends"
                gamePrice = 12000; // declare gamePrice = 12000
                break; // exit the selection
        }
    }
    
     public int calculateTotalPrice() { // method to calculate the total price to be paid
        return loanDuration * gamePrice; // return the value of total price
    } 
    
    public void printPaymentReceipt() { // method to display payment receipt
        System.out.println("\n============================================"); // print the border
        System.out.println("              Payment Receipt"               ); // print "Payment Receipt"
        System.out.println("============================================"); // print the border
        System.out.println("Name: " + memberName); // print the name of customer
        System.out.println("ID: " + id); // print the ID of customer
        System.out.println("Game: " + gameName); // print the game that customer want to rent
        System.out.println("Duration: " + loanDuration + " day(s)"); // print the duration of rental
        System.out.println("Price to be paid: Rp " + calculateTotalPrice()); // print the price paid by customer
        System.out.println("============================================"); // print the border
    }
    
}
