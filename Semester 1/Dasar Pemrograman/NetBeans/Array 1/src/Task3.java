import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        
        double jumlahNilai, nilaiKaliSKS = 0, totalSKS = 0, GPA;
        
        System.out.print("Masukkan jumlah MK yang Anda ambil: ");
        int N = angka.nextInt();
        String namaMK[] = new String[N];
        int SKS[] = new int[N];
        String nilaiHuruf[] = new String[N];
        double nilaiAngka[] = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nama MK " + (i + 1) + ": ");
            namaMK[i] = text.nextLine();
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            while (true) {
                System.out.print("Masukkan bobot SKS " + namaMK[i] + ": ");
                SKS[i] = angka.nextInt();
                if (SKS[i] > 0) {
                    System.out.print("Masukkan nilai " + namaMK[i] + " (A, B+, B, C+, C, D, E): ");
                    nilaiHuruf[i] = text.nextLine();
                    switch (nilaiHuruf[i].toUpperCase()) {
                        case "A":
                            nilaiAngka[i] = 4;
                            break;
                        case "B+":
                            nilaiAngka[i] = 3.5;
                            break;
                        case "B":
                            nilaiAngka[i] = 3;
                            break;
                        case "C+":
                            nilaiAngka[i] = 2.5;
                            break;
                        case "C":
                            nilaiAngka[i] = 2;
                            break;
                        case "D":
                            nilaiAngka[i] = 1;
                            break;
                        case "E":
                            nilaiAngka[i] = 0;
                            break;
                    }
                    System.out.println();
                    break;
                } else {
                    System.out.println("Jumlah SKS yang Anda masukkan salah, silakan coba lagi");
                }
            }
        }
        for (int i = 0; i < N; i++) {
            jumlahNilai = nilaiAngka[i] * SKS[i];
            nilaiKaliSKS = nilaiKaliSKS + jumlahNilai;
            totalSKS = totalSKS + SKS[i];
        }
        GPA = nilaiKaliSKS / totalSKS;
        System.out.println("IP semester Anda adalah = " + GPA);
    }
}