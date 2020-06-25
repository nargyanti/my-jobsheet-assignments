package week2.assignments;

import java.util.Scanner; // import Scanner from library

public class CircleMain { // declare the CircleMain class

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        Circle crcl = new Circle(); // instantiate crcl from Circle class
        crcl.PHI = 3.14; // declare the value of crcl.PHI
        
        while (true) {
            System.out.print("Enter the radius of circle: "); // display the text "Enter the radius of circle: "
            crcl.r = sc.nextDouble(); // input the value of crcl.r
            if (crcl.r > 0) { // if crcl.r is above 0, follow the commands
                System.out.println("The area of circle is " + crcl.calculateArea()); // display the value of area
                System.out.println("The circumference of circle is " + crcl.calculateCircumference()); // display the value of circumference
                break; // exit the iteration
            } else { // if crcl.r is 0 or below 0, follow the commands
                System.out.println("The value you entered is incorrect, please try again\n"); // display wrong input and input radius again
            }
        }
    }

}
