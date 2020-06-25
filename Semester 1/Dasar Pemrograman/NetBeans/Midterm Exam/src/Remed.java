
import java.util.Scanner;

public class Remed {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner word = new Scanner(System.in);

        int dateBirth, monthBirth, yearBirth, dateNow, monthNow, yearNow, dateAge, monthAge, yearAge, yearLeap, monthLeap, dateLeap, dateDays, monthDays, yearDays;
        String name, umur = "'s age: ";

        System.out.print("Input your name: ");
        name = word.nextLine();
        System.out.print("Input your date of birth: ");
        dateBirth = number.nextInt();
        System.out.print("Input your month of birth: ");
        monthBirth = number.nextInt();
        System.out.print("Input your year of birth: ");
        yearBirth = number.nextInt();
        System.out.print("Input the date of current year: ");
        dateNow = number.nextInt();
        System.out.print("Input the month of current year: ");
        monthNow = number.nextInt();
        System.out.print("Input the year of current year: ");
        yearNow = number.nextInt();

        yearLeap = (int) ((yearNow - yearBirth) / 4);
        dateDays = dateNow - dateBirth;
        if (dateDays < 0) {
            if (monthNow == 3) {
                monthNow--;
                dateNow += 29;
            } else {
                monthNow--;
                dateNow += 30;
            }
        } else {
            if (monthNow == 3) {
                monthNow--;
                dateNow += 29;
            } else {
                monthNow--;
                dateNow += 30;
            }
        }
    }
}
