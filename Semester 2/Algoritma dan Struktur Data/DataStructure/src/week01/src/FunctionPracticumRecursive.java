public class FunctionPracticumRecursive {
    public static void main(String[] args) {
        int i = 1, add = 0, add1 = 1, total = 0;
        System.out.print("Fibonacci sequence: ");
        System.out.println(fibonacci(i, add, add1, total));
    }

    static int fibonacci(int i, int add, int add1, int total) {
        if (i == 9) {
            return (add);
        } else {
            System.out.print(add + " ");
            total = add + add1;
            add = add1;
            add1 = total;
            i++;
            return (fibonacci(i, add, add1, total));
        }
    }
}
