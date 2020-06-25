import java.util.Scanner;
public class LetsEatRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String food, deliv;
        int price, total, delivCost;

        System.out.print("Enter the food name: ");
        food = sc.nextLine();
        System.out.print("Enter the food price: ");
        price = sc1.nextInt();
        
        if (price > 0){
            if (price < 100000) {
                delivCost = 20000;
            } else {
                delivCost = 30000;
            }
            System.out.print("Do you want to express delivery? (0 = no, 1 = yes)? ");
            deliv = sc1.next();
                if (deliv.equals("0")) {
                    total = price + delivCost;
                    System.out.println("RECEIPT");
                    System.out.println(food + "\t\t Rp " + price);
                    System.out.println("Delivery cost\t Rp " + delivCost);
                    System.out.println("TOTAL\t\t Rp " + total);
                } else if (deliv.equals("1")) {
                    delivCost += 25000;
                    total = price + delivCost;
                    System.out.println("RECEIPT");
                    System.out.println(food + "\t\t Rp " + price);
                    System.out.println("Delivery cost\t Rp " + delivCost);
                    System.out.println("TOTAL\t\t Rp " + total);
                } else {
                    System.out.println("The number you entered is wrong");
                }
        } else { 
            System.out.println("The price you entered is incorrect ");
        }
    }
}
