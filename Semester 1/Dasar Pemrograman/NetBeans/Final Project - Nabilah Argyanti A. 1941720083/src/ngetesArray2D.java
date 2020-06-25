
import java.util.Arrays;

//import java.util.Arrays;
public class ngetesArray2D {

    public static void main(String[] args) {
        /*int[][] a = { { 1, 2, 3 } };

        // Create a backup of the original array
        int[][] backup = a;
        int add = 3;

        // Increase the size of the array by the value of add
        a = new int[a.length + add][a[0].length];

        // Copy the backup into the enlarged array
        System.arraycopy(backup, 0, a, 0, backup.length);

        // Fill the remaining values in the enlarged array with 1
        for (int i = backup.length; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 1;
            }
        }

        // Print the enlarged array
        for (int i[] : a) {
            System.out.println(Arrays.toString(i));
            
            
        }*/
 /*int nambah = 1, add = 1;
        int hasil[][] = nambah(nambah, add);
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print(hasil[i][j]);
            }
            System.out.println("");
        
        }*/

        int a[][] = buatbaru();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }

    static int[][] membuat() {
        int a[][] = new int[10][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 0;
            }
        }
        return a;
    }

    static int[][] backup() {
        int hasil[][] = buatbaru();
        return hasil;
    }

    static int[][] buatbaru() {
        int a[][] = membuat();
        int backup[][] = a;
        a = new int[a.length + 1][a[0].length];
        System.arraycopy(backup, 0, a, 0, backup.length);
        for (int i = backup.length; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 1;
            }
        }
        return backup;
    }

}
