
import java.util.Scanner;

public class Practicum1_While2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, b;
        System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        b = 0;
        while (true) {
            System.out.print("Masukkan bilangan: ");
            angka = input.nextInt();
            b += angka;
            if (b > 50) {
                break;
            }
        }
        System.out.printf("Angka berhenti pada jumlah angka: %d \n", b);
    }

}
