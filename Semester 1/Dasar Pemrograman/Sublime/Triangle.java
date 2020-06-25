
import java.util.Scanner;

public class Triangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int jari2, tinggi, radian;
        float volume, phi = 3.14F;

        System.out.println("Enter the radian: ");
        radian = sc.nextInt();
        System.out.println("Enter height: ");
        tinggi = sc.nextInt();

        volume = phi * radian * radian * tinggi;

        System.out.println("Tube volume: " + volume);
    }
}
