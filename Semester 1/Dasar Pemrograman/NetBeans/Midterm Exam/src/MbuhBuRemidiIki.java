
import java.util.Scanner;

public class MbuhBuRemidiIki {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner teks = new Scanner(System.in);
        
        String nama;
        int umur, umurYear, umurBulan, umurHari, dateBirth, monthBirth, yearBirth, dateNow, monthNow, yearNow, yearLeap, yearCommon, hariLahir, hariNow, bulanKeHari1, bulanKeHari2, kabisatKali, tidakKabisat, mod4Now, mod4Birth, tahunKeHari, hari;

        System.out.print("Input your name: ");
        nama = teks.nextLine();
        System.out.print("Date of birth: ");
        dateBirth = angka.nextInt();
        System.out.print("Month of birth: ");
        monthBirth = angka.nextInt();
        System.out.print("Year of birth: ");
        yearBirth = angka.nextInt();
        System.out.print("Current date: ");
        dateNow = angka.nextInt();
        System.out.print("Current month: ");
        monthNow = angka.nextInt();
        System.out.print("Current year: ");
        yearNow = angka.nextInt();
                
        mod4Birth = yearBirth % 4;
        mod4Now = yearNow % 4;
        
        if (mod4Birth == 0) {
            hari = 359;
            if (monthBirth > 2) 
                bulanKeHari1 = ((monthBirth - 2) * 30) + 29;
            } else {
                bulanKeHari1 = (monthBirth - 1) * 30;
            }
        } else {
            hari = 358;
            if (monthBirth > 2) {
                bulanKeHari1 = ((monthBirth - 2) * 30) + 28;
            } else {
                bulanKeHari1 = (monthBirth - 1) * 30;
            }
        }

        if (mod4Now == 0) {
            if (monthNow > 2) {
                bulanKeHari2 = ((monthNow - 2) * 30) + 29;
            } else {
                bulanKeHari2 = (monthNow - 1) * 30;
            }
        } else {
            if (monthNow > 2) {
                bulanKeHari2 = ((monthNow - 2) * 30) + 28;
            } else {
                bulanKeHari2 = (monthNow - 1) * 30;
            }
        }

        kabisatKali = (int) (yearNow - yearBirth) / 4;
        tidakKabisat = (yearNow - yearBirth) - kabisatKali;
        
        if (mod4Now == 0 || mod4Birth == 0) {
            tahunKeHari = ((kabisatKali - 2) * 359) + ((tidakKabisat) * 358);
        } else {
            tahunKeHari = ((kabisatKali * 359) + ((tidakKabisat - 2) * 358));
        }
        
        umur = (tahunKeHari + bulanKeHari2 + dateNow) + (hari - (dateBirth + bulanKeHari1));
      
        System.out.println(kabisatKali);
        System.out.println(nama + "'s age is " + umur + " days");
    }

}
