package week2.test;


import java.util.Scanner;

public class pacman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x : ");
        int x = sc.nextInt();
        System.out.print("y : ");
        int y = sc.nextInt();
        System.out.print("width : ");
        int width = sc.nextInt();
        System.out.print("height : ");
        int height = sc.nextInt();
        
        for (int i = 0; i < width; i++) {
            System.out.print(" ____ ");
        }
        for (int i = 0; i < height; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                if (i == x && j == y) {
                    if (j == width - 1) {
                        System.out.print(" :v ");
                    } else {
                        System.out.print(" :v   ");
                    }
                } else {
                    if (j == width - 1) {
                        System.out.print("    ");
                    } else {
                        System.out.print("      ");
                    }
                }

            }
            System.out.println("| " + i);
        }
        for (int i = 0; i < width; i++) {
            System.out.print(" ¯¯¯¯ ");
        }
        System.out.println("");
        for (int i = 0; i < width; i++) {
            System.out.print("  " + i + "   ");
        }
    }

}
