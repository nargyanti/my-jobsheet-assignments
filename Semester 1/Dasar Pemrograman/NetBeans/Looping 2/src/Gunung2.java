
public class Gunung2 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            i++;
            for (int j = 11; j > i; j--) {
                System.out.print(" ");
                j++;
            } 
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
