public class Fibonacci {
    public static void main(String[] args) {
        int i, add = 0, add1 = 1, total;
        for (i = 1; i <= 9; i++) {
            System.out.print(add + " ");
            total = add + add1;
            add = add1;
            add1 = total;
        }
    }
}