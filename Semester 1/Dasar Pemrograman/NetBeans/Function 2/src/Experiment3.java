import java.util.Scanner;
public class Experiment3 {
    static double hitungBunga(double saldo, int tahun) {
        if (tahun < 1) {
            return (saldo);
        } else {
            return (1.11 * hitungBunga(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Jumlah saldo awal: ");
        int saldoAwal = sc.nextInt();
        System.out.print("Lamanya menabung (tahun): ");
        int tahun = sc.nextInt();
        System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }
    
}
