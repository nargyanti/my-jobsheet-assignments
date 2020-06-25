package week2.assignments;

public class Item {

    public String name; // declare String attribute (name)
    public int unitPrice, total; // declare integer attributes (unitPrice, total) 

    public int totalPrice() { // method to calculate the total price
        return unitPrice * total; // return the value from unitPrice * total
    }
    
    public int discount() { // method to determine the discount obtained
        int totalPrice = totalPrice(); // declare the value of totalPrice from totalPrice()
        if (totalPrice > 100000) { // if the totalPrice is above 100000, follow the commands below
            return (int) (totalPrice * 0.1); // return the value totalPrice * 10% 
        } else if (totalPrice >= 50000) { // if the totalPrice is equal to or above 50000, follow the commands below
            return (int) (totalPrice * 0.05); // return the value totalPrice * 5% 
        } else { // if the totalPrice is below 50000, follow the commands below
            return 0; // return 0
        }
    }

    public int pricePaid() { // method to calculate the final price after the total price minus the discount
        return totalPrice() - discount(); // return the value from totalPrice() - discount()
    }
    
}
