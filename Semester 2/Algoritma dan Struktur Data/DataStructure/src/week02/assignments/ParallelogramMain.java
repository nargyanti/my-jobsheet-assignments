package week2.assignments;

import java.util.Scanner; // import scanner from library

public class ParallelogramMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        Parallelogram[] plgr = new Parallelogram[5]; // instantiate array object plgr with array length of 5 
        String wrongInput = "The number you entered is 0 or below 0, please try again"; // declare String wrongInput

        System.out.println("Input the size of each parallelogram"); // print text "Input the size of each parallelogram"
        for (int i = 0; i < 5; i++) { // iteration to instantiate new index array and input the value of each parallelogram
            System.out.println("----------------------------------"); // print the border
            plgr[i] = new Parallelogram(); // instantiate Parallelogram object at plgr[i]
            System.out.println("Parallelogram " + (i + 1)); // print the sequence of paralleogram 
            while (true) { // iteration to check whether the value of plgr[i].length is above 0 or not
                System.out.print("· Length: "); // print text "· Length: "
                plgr[i].length = sc.nextInt(); // input the value of plgr[i].length
                if (plgr[i].length > 0) { // if plgr[i].length is above 0, follow the commands below
                    while (true) { // iteration to check whether the value of plgr[i].height is above 0 or not
                        System.out.print("· Height: "); // print text "· Height: "
                        plgr[i].height = sc.nextInt(); // input the value of plgr[i].height
                        if (plgr[i].height > 0) { // if plgr[i].height is above 0, follow the commands below
                            while (true) { // iteration to check whether the value of plgr[i].hypotenuse is above 0 or not
                                System.out.print("· Hypotenuse: "); // print text "· Hypotenuse: "
                                plgr[i].hypotenuse = sc.nextInt(); // input the value of plgr[i].hypotenuse
                                if (plgr[i].hypotenuse > 0) { // if plgr[i].hypotenuse is above 0, follow the commands below
                                    break; // exit the iteration
                                } else { // if plgr[i].hypotenuse is 0 or below 0, follow the commands below
                                    System.out.println(wrongInput); // print text wrongInput
                                }
                            }
                            break; // exit the iteration
                        } else { // if plgr[i].height is 0 or below 0, follow the commands below
                            System.out.println(wrongInput); // print text wrongInput
                        }
                    }
                    break; // exit the iteration
                } else { // if plgr[i].length is 0 or below 0, follow the commands below
                    System.out.println(wrongInput); // print text wrongInput
                }
            }
        }
        System.out.println("\nCircumference and area of each parallelogram"); // print text "\nCircumference and area of each parallelogram"
        for (int i = 0; i < 5; i++) { // iteration to print the area and circumference of each parallelogram
            System.out.println("----------------------------------"); // print the border
            System.out.println("Parallelogram " + (i + 1)); // print the sequence of parallelogram
            System.out.println("· Circumference: " + plgr[i].calculateCircumference()); // print the value of circumference
            System.out.println("· Area: " + plgr[i].calculateArea()); // print the value of area
        }
    }

}
