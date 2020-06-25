
import java.util.Scanner;

public class MidtermExam_Nabilah18 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner word = new Scanner(System.in);

        int dateBirth, monthBirth, yearBirth, dateNow, monthNow, yearNow, dateAge, monthAge, yearAge, yearLeap, monthLeap, dateLeap;
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

        yearLeap = dateNow % 4;
        monthAge = monthNow - monthBirth;
        if (yearLeap == 0) {
            if (dateNow < 0) {
                if (monthNow == 3) {
                    monthNow--;
                    dateNow += 29;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    monthNow--;
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }
                if (monthNow == 3) {
                    monthNow--;
                    dateNow += 29;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    monthNow--;
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }
            } else {
                if (monthNow == 3) {
                    dateNow += 28;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }

            }
        } else {
                        if (dateNow < 0) {
                if (monthNow == 3) {
                    monthNow--;
                    dateNow += 29;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    monthNow--;
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }
                if (monthNow == 3) {
                    monthNow--;
                    dateNow += 29;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    monthNow--;
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }
            } else {
                if (monthNow == 3) {
                    dateNow += 28;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                } else {
                    dateNow += 30;
                    if (monthAge < 0) {
                        yearNow--;
                        monthNow += 12;
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    } else {
                        dateAge = dateNow - dateBirth;
                        monthAge = monthNow - monthBirth;
                        yearAge = yearNow - yearBirth;
                        System.out.println(name + umur + yearAge + " years " + monthAge + " month " + dateAge + " days");
                    }
                }

            }
        }
    }
}
