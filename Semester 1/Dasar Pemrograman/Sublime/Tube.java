
import java.util.Scanner;

public class Tube {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int jari2, tinggi;
        float volume, phi = 3.14F;

        System.out.print("Enter the radian: ");
        jari2 = sc.nextInt();
        System.out.print("Enter height: ");
        tinggi = sc.nextInt();

        volume = phi * jari2 * jari2 * tinggi;

        System.out.println("Tube volume: " + volume);
    }
}
