import java.util.Scanner;

public class Task4 {

    static Scanner sc = new Scanner(System.in);
    static String wrongInput = "Sorry, the input you entered is invalid, please try again\n";
    static double side, length, height, width, area, diagonal1, diagonal2, radius, triangleArea, circleArea;

    public static void main(String[] args) {
        int selectedMainMenu = mainMenu(); // declare the selectMainMenu value by calling the function mainMenu()
        switch (selectedMainMenu) { // selection to check whether the selectedMainMenu value is correct or not
            case 1: // if you choose calculate the triangle, follow the commands below
                while (true) { // iteration to check whether the value of length is above 0 or not
                    System.out.print("\nEnter the length of the triangle (cm): ");
                    length = sc.nextInt(); // input the value of length
                    if (length > 0) { // if length is above 0, follow the commands
                        while (true) { // iteration to check whether the value of height is above 0 or not
                            System.out.print("Enter the height of the triangle (cm): ");
                            height = sc.nextInt(); // input the value of height
                            if (height > 0) { // if height is above 0, follow the commands
                                System.out.println("\nSo, the area of the triangle is " + triangleArea(length, height) + " cm"); // display the result 
                                break; // exit from the iteration
                            } else { // if height is equal or below 0, follow the commands
                                System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                            } // closing height selection
                        } // closing height iteration
                        break; // exit from the iteration
                    } else { // if length is equal or below 0, follow the commands
                        System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                    } // closing length iteration
                } // closing length iteration
                break; // exit from the iteration
            case 2:
                OUTER:
                while (true) {
                    System.out.println("\n1. Rectangle\n2. Square");
                    System.out.print("Choose the type of quadrilateral: ");
                    int selectMenu = sc.nextInt(); // input the type of quadrilateral
                    switch (selectMenu) { // selection to check whether the selectMenu value is correct or not
                        case 1: // if you choose rectangle, follow the commands
                            while (true) { // iteration to check whether the value of length is above 0 or not
                                System.out.print("\nEnter the length of the rectangle (cm): ");
                                length = sc.nextInt(); // input the value of length
                                if (length > 0) { // if length is above 0, follow the commands
                                    while (true) { // iteration to check whether the value of width is above 0 or not
                                        System.out.print("Enter the width of the rectangle (cm): ");
                                        width = sc.nextInt(); // input the value of width
                                        if (width > 0) { // if width is above 0, follow the commands
                                            System.out.println("\nSo, the area of the rectangle is " + rectangleArea(length, width) + " cm"); // display the result 
                                            break; // exit from the iteration
                                        } else { // if width is equal or below 0, follow the commands
                                            System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                                        } // closing width selection
                                    } // closing width iteration
                                    break; // exit from the iteration
                                } else { // if length is equal or below 0, follow the commands
                                    System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                                } // closing length selection
                            } // closing length iteration
                            break OUTER; // exit from the iteration
                        case 2: // if you choose square, follow the commands
                            while (true) { // iteration to check whether the value of side is above 0 or not
                                System.out.print("\nEnter the side of the square (cm): ");
                                side = sc.nextInt(); // input the value of side
                                if (side > 0) { // if side is above 0, follow the commands
                                    System.out.println("\nSo, the area of the square is " + squareArea(side) + " cm"); // display the result
                                    break; // exit from the iteration
                                } else { // if side is equal or below 0, follow the commands
                                    System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                                } // closing side selection
                            } // closing side iteration
                            break OUTER; // exit from the iteration
                        default: // if you choose other than 1 and 2, follow the commands below
                            System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                            break; // exit from the iteration
                    } // closing selectMenu selection
                } // closing selectMenu iteration
                break; // exit from the iteration
            case 3: // if you choose calculate the circle, follow the commands below
                while (true) { // iteration to check whether the value of length is above 0 or not
                    System.out.print("\nEnter the radius of circle (cm): ");
                    radius = sc.nextInt(); // input the radius
                    if (radius > 0) { // if radius is above 0, follow the commands
                        System.out.println("\nSo, the area of the circle is " + circleArea(radius) + " cm"); // print the result 
                        break; // exit from the iteration
                    } else { // if radius is equal or below 0, follow the commands
                        System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                    } // closing radius selection
                } // closing radius iteration
                break; // exit from the iteration
            default: // if you choose other than 1, 2, and 3, follow the commands below
                System.out.println(wrongInput); // display wrong answer, and the command will be repeated
                main(args); // back tu function main(args)
                break; // exit from the iteration
        } // closing selectedMenu selection
    }

    static int mainMenu() { // function to display the main menu and return the selectedMainMenu value
        System.out.println("Main Menu"); 
        System.out.println("1. Calculate the area of a triangle");
        System.out.println("2. Calculate the area of a quadrilateral");
        System.out.println("3. Calculate the area of a circle");
        System.out.print("Type your answer by typing the number: ");
        int selectedMainMenu = sc.nextInt(); // input the menu to be selected
        if (selectedMainMenu >= 1 && selectedMainMenu <= 3) { // if selectedMainMenu is 1, 2, or 3, follow the commands
            return (selectedMainMenu); // return the selectedMainMenu value
        } else { // if selectedMainMenu is other than 1, 2, or 3, follow the commands
            System.out.println(wrongInput); // display the wrong input
            return (mainMenu()); // return the mainMenu() function
        } // closing selectedMainMenu selection
    } // closing mainMenu() function

    static double triangleArea(double length, double height) { // function to calculate the area of triangle
        area = 0.5 * length * height; // calculate the area of triangle
        return area; // return the value of area
    } // closing triangleArea() function

    static double rectangleArea(double length, double width) { // function to calculate the area of rectangle
        area = length * width; // calculate the area of rectangle
        return area; // return the value of area
    } // closing rectangleArea() function

    static double squareArea(double side) { // function to calculate the area of square
        area = side * side; // calculate the area of square
        return area; // return the value of area
    } // closing squareArea() function

    static double circleArea(double radius) { // function to calculate the area of circle
        area = 3.14 * radius * radius; // calculate the area of circle
        return (area); // return the value of area
    } // closing circleArea() function
    
}
