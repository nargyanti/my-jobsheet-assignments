import java.util.Scanner;
public class Task3 {
    static int checkPrime(int N, int decrease) {
        int hasil = N % decrease;
        if (decrease == 1) {
            return (1);
        } else {
            if (hasil != 0) {
                System.out.println(N + " % " + decrease + " = " + hasil);
                return (checkPrime(N, decrease - 1));
            } else {
                System.out.println(N + " % " + decrease + " = " + hasil);
                return (0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input the value of N: ");
            int N = sc.nextInt();
            if (N > 1) {
                /*int hasil;
                for (int i = N - 1; i > 1; i--) {
                    hasil = N % i;
                    System.out.println(i + " " + hasil);
                }*/
                int numberDecrease = N - 1;
                if (checkPrime(N, numberDecrease) == 0) {
                    System.out.println("Number " + N + " is not prime");
                } else {
                    System.out.println("Number " + N + " is prime");
                }
                break;
            } else {
                System.out.println("The value of N is under 2, please try again\n");
            }
        }
    }
}
