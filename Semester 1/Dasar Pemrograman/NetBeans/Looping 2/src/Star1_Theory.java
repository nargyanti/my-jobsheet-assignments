
public class Star1_Theory {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = -1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
