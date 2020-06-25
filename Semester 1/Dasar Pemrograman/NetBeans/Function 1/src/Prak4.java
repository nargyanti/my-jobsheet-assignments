import java.util.Scanner;
public class Prak4 {
    static int Kali(int C, int D) {
        int H = (C + 10) % (D + 19);
        return H;
    }

    static int Kurang(int A, int B) {
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }

    static void selection(int E, int F) {
        if (E >= 0 && F >= 0) {
            int hasil = Kurang(E, F);
            System.out.println("Hasil akhir adalah " + hasil);
        } else {
            System.out.println("Nilai yang Anda masukkan salah");
        }
    }

    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai2 = input.nextInt();
        selection(nilai1, nilai2);
    }
}