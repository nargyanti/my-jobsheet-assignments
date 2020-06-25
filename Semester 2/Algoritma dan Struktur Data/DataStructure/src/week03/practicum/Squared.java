package week3;

public class Squared {

    public int num, squared;

    public Squared(int n, int s) {
        num = n;
        squared = s;
    }
    
    public int squaredBF(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    public int squaredDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                System.out.println("Ganjil ==== a: " + a + " n / 2 : " + (n / 2) + " a : " + a);
                int hasil = (squaredDC(a, n / 2) * squaredDC(a, n / 2) * a);
                System.out.println("Hasil: " + hasil);
                return hasil;
            } else {
                System.out.println("Genap ==== a: " + a + " n / 2 : " + n / 2);
                int hasil = (squaredDC(a, n / 2) * squaredDC(a, n / 2));
                System.out.println("Hasil: " + hasil);
                return hasil;
            }
        }
    }
}
