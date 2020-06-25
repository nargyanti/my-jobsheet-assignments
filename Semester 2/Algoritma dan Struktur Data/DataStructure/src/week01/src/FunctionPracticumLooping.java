public class FunctionPracticumLooping {
    public static void main(String[] args) {
        int add = 0, add1 = 1, total = 0;
        fibonacci(add, add1, total);
    }

    static void fibonacci(int add, int add1, int total) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(add + " ");
            total = add + add1;
            add = add1;
            add1 = total;
        }
    }
}
