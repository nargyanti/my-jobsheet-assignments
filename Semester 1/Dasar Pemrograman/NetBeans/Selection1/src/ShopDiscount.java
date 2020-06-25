import java.util.Scanner;
public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int purchase;
        float discount, total;
        
        System.out.println("Enter your total cost: ");
        purchase = sc.nextInt();
        
        if (purchase>1000000){
            discount = 0.1f * purchase;
            total = purchase - discount;
            System.out.println("You get a platinum member discount of 10%");
            System.out.println("Your total purchase is: " + purchase);
            System.out.println("Your total discount is: " + discount) ;
            System.out.println("The total you have to pay is: " + total);
        }
        else if (purchase>500000){
            discount = 0.05f * purchase;
            total = purchase - discount;
            System.out.println("You get a gold member discount of 5%");
            System.out.println("Your total purchase is: " + purchase);
            System.out.println("Your total discount is: " + discount);
            System.out.println("The total you have to pay is: " + total);
        }
        else if (purchase>200000){
            discount = 0.02f * purchase;
            total = purchase - discount;
            System.out.println("You get a silver member discount of 2%");
            System.out.println("Your total purchase is: " + purchase);
            System.out.println("Your total discount is: " + discount);
            System.out.println("The total you have to pay is: " + total);
        }
        else{
            System.out.println("Your total shopping is still not enough to get member discouts");
            System.out.println("Your total purchase is: " + purchase);
        }
    }
}
    

