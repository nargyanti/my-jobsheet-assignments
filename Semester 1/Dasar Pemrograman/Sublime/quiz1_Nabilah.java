
import java.util.Scanner;

public class quiz1_Nabilah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int land, buy, price;
        float tax, discount;

        System.out.println("------------------------------------------------------------------ ");
        System.out.print("Input the area of land that you want to buy (meter square): ");
        buy = sc.nextInt();

        land = buy * 1300000;
        tax = 15f / 1000f * land;
        discount = 5f / 100f * land;
        price = (int) (land + tax - discount);

        System.out.println("Your land price: Rp " + price);
        System.out.print("-------------------------------------------------------------------- ");
    }
}
