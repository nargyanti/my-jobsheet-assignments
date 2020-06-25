import java.util.Scanner;
public class MinValueAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        System.out.print("Enter the length of the row for your array: ");
        int row = sc.nextInt();
        System.out.print("Enter the length of the column for your array: ");
        int column = sc.nextInt();
        System.out.println();
        int cek[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element of array in [" + i + "][" + j + "]: ");
                cek[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe content of the array is: ");
        for (int tampil[] : cek) {
            System.out.print("| ");
            for (int j = 0; j < column; j++) {
                System.out.print(tampil[j] + " | ");
            }
            System.out.println();
        }
        int terkecil = cek[0][0], terbesar = cek[0][0], banyakKecil = 0, ada = 0, banyakBesar = 0;
        String seket;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (terkecil >= cek[i][j]) {
                    terkecil = cek[i][j];
                }
                if (terbesar < cek[i][j]) {
                    terbesar = cek[i][j];
                }
                if (cek[i][j] == 50) {
                    ada++;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (cek[i][j] == terkecil) {
                    banyakKecil++;
                }
                if (cek[i][j] == terbesar) {
                    banyakBesar++;
                }
            }
        }
        while (true) {
            System.out.println("\nSelect the menu below by typing a, b, or c: ");
            System.out.println("a. Display the smallest element value.");
            System.out.println("b. Display the smallest element value, the amount of the smallest element, and the location of the biggest value.");
            System.out.println("c. Is there a number 50 in the array?");
            System.out.print("Option: ");
            String pilih = text.next();
            System.out.println();
            if (pilih.equalsIgnoreCase("a")) {
                System.out.println("The smallest element value is " + terkecil);
                break;
            } else if (pilih.equalsIgnoreCase("b")) {
                System.out.println("The smallest element value is " + terkecil + " as many as " + banyakKecil);
                System.out.print("The biggest element value is " + terbesar + " in: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        if (cek[i][j] == terbesar) {
                            System.out.print("[" + i + "][" + j + "] ");
                        }
                    }
                }
                System.out.println();
                break;
            } else if (pilih.equalsIgnoreCase("c")) {
                if (ada == 1) {
                    System.out.print("Yes, there is one number 50 in: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            if (cek[i][j] == 50) {
                                System.out.println("[" + i + "][" + j + "]");
                            }
                        }
                    }
                } else if (ada > 1) {
                    System.out.print("Yes, there are " + ada + " number 50 in ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            if (cek[i][j] == 50) {
                                System.out.print("[" + i + "][" + j + "] ");
                            }
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("No, there is no number 50 in this array");
                }
                break;
            } else {
                System.out.println("The option you entered is incorrect, please try again");
            }
        }
    }
}
