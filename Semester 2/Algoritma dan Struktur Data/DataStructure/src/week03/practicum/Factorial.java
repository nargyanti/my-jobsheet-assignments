package week3;

public class Factorial {
    public int num;
    
    public int factorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }
    
    public int factorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * factorialDC(n - 1);
            return fakto;
        }
    }
}
