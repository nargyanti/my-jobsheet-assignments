
import java.util.*;

public class ngetes_inputan {

    static Scanner number = new Scanner(System.in);

    public static void main(String[] args) {
        

    }

    static String[][] buatPertama() {
        String buat[][] = new String[1][3];
        for (int i = 0; i < buat.length; i++) {
            for (int j = 0; j < buat[0].length; j++) {
                buat[i][j] = "5";
            }
        }
        return buat;
    }

    static String[][] isiLagi(String[][] hasil) {
        String backup[][] = hasil;
        hasil = new String[hasil.length + 1][hasil[0].length];
        System.arraycopy(backup, 0, hasil, 0, backup.length);
        for (int i = backup.length; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = "1";
            }
        }
        simpan(hasil);
            return hasil;
    }

    static String[][] yes(String[][] hasil) {
        System.out.print("Y/N: ");
        int in = number.nextInt();
        if (in == 1) {
            return yes(isiLagi(hasil));
        } else {
            return hasil;
        }
    }
    
    static String[][] simpan(String[][] hasil) {
        String simpan[][] = hasil;
        return simpan;
    }
}
    
   
