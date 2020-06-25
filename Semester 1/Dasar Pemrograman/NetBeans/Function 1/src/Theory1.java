
import java.util.Scanner;

public class Theory1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        int length = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int width = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int height = sc.nextInt();
        System.out.println("Keliling: " + surface(length,width,height));
        System.out.println("Luas: " + area(length,width,height));
    }

    static int surface(int P, int L, int T) {
        int keliling = 2 * (P * L + P * T + L * T);
        return keliling;
    }

    static int area(int P, int L, int T) {
        int luas = P * L * T;
        return luas;
    }

}
