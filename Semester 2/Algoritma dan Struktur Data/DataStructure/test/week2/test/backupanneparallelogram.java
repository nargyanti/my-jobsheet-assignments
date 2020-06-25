package week2.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class backupanneparallelogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parallelogram[] plgr = new Parallelogram[5];
        
        System.out.println("Input the size of each parallelogram");
        for (int i = 0; i < 5; i++) {
            System.out.println("----------------------------------");
            plgr[i] = new Parallelogram();
            System.out.println("Parallelogram " + (i + 1));
            System.out.print("· Length: ");
            plgr[i].length = sc.nextInt();
            System.out.print("· Height: ");
            plgr[i].height = sc.nextInt();
            System.out.print("· Hypotenuse: ");
            plgr[i].hypotenuse = sc.nextInt();
        }
        System.out.println("\nCircumference and area of each parallelogram");
        for (int i = 0; i < 5; i++) {
            System.out.println("----------------------------------");
            System.out.println("Parallelogram " + (i + 1));
            System.out.println("· Circumference: " + plgr[i].calculateCircumference());
            System.out.println("· Area: " + plgr[i].calculateArea());
        }
    }
    
}
