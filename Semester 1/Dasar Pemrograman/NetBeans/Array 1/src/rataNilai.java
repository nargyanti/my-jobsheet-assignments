import java.util.Scanner;
public class rataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();
        int[] nilaiMHS = new int[N];
        int total = 0;
        double rataLulus, rataGagal, nilaiLulus = 0, nilaiGagal = 0, jumlahLulus = 0, jumlahGagal = 0;
        for (int i = 0; i < nilaiMHS.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMHS[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            total+=nilaiMHS[i];
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            if (nilaiMHS[i] > 70) {
                nilaiLulus += nilaiMHS[i];
                        jumlahLulus++;
            } else {
                nilaiGagal += nilaiMHS[i];
                        jumlahGagal++;
            }
        }
        rataLulus = nilaiLulus / jumlahLulus;
        rataGagal = nilaiGagal / jumlahGagal;
        System.out.println("Nilai rata-rata yang lulus = " + rataLulus);
        System.out.println("Nilai rata-rata yang tidak lulus = " + rataGagal);
    }
}