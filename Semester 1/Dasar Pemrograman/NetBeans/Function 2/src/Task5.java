public class Task5 {
    static int fibonacci(int i, int add, int add1, int total) {
        System.out.println("The total pair of twin rabbit in month " + i + " is " + add);
        if (i == 12) {
            return (add);
        } else {
            total = add + add1;
            add = add1;
            add1 = total;
            i++;
            return (fibonacci(i, add, add1, total));
        }
    }

    public static void main(String[] args) {
        int i = 1, add = 1, add1 = 1, total = 0;
        System.out.println("\nThe total pairs of rabbits at the end of 12th month is " + fibonacci(i, add, add1, total));
    }
}
