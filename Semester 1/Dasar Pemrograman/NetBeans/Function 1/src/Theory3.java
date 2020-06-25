import java.util.Scanner;
public class Theory3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int amount = scan.nextInt();
        String namess[] = new String[amount];
        float gradess[] = new float[amount];
        for (int i = 0; i < amount; i++) {
            scan.nextLine();
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namess[i] = scan.nextLine();
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            gradess[i] = scan.nextFloat();
        }
        print(namess, gradess);
    }

    private static float calculate(float grades[]) {
        float studentsGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            studentsGrade += grades[i];
        }
        float average = studentsGrade / grades.length;
        return average;
    }

    private static void print(String names[], float grades[]) {
        System.out.println("Nama\t\tNilai");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + "\t\t" + grades[i]);
        }
        System.out.println("Rata-rata: " + calculate(grades));
    }
}
