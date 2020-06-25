package week2.test;

import java.util.Scanner;

public class pacmanbackup {

    static String wrongInput = "Sorry, the number you entered is wrong, please try again";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan pm = new PacMan();
        System.out.print("Enter the width of area: ");
        pm.width = sc.nextInt();
        System.out.print("Enter the height of area: ");
        pm.height = sc.nextInt();
        outerloop:
        while (true) {
            System.out.println("Enter the current PacMan position: ");
            System.out.print("Horizontal (x): ");
            pm.x = sc.nextInt();
            if (pm.x >= 0 && pm.x <= pm.width) {
                while (true) {
                    System.out.print("Vertical (y): ");
                    pm.y = sc.nextInt();
                    if (pm.y >= 0 && pm.y <= pm.height) {
                        pm.printPosition();
                        break;
                    } else {
                        System.out.println(wrongInput);
                    }
                }
                while (true) {
                    System.out.print("Do you want to move PacMan again (0 = No, 1 = Yes)? ");
                    int answer = sc.nextInt();
                    if (answer == 0) {
                        break outerloop;
                    } else if (answer == 1) {
                        break;
                    } else {
                        System.out.println(wrongInput);
                    }
                }
            } else {
                System.out.println(wrongInput);
            }

        }

    }

}
