package week2.assignments;

public class PacMan {

    public String cantMove = "You can't move the PacMan because of PacMan's position outside the area\n"; // declare String cantMove 
    public int x, y, width, height; // declare integer attributes (x, y, width, height)

    public void moveLeft() { // method to move left the PacMan
        if (x > 0) { // if x is above 0, follow the commands below
            x--; // the value of x decreases
        } else { // if x is 0 or below 0, follow the commands below
            System.out.println(cantMove); // print cantMove
        }
    }

    public void moveRight() { // method to move right the PacMan
        if (x < width) { // if x is below width, follow the commands below
            x++; // the value of x increases
        } else { // if x is equal to width or above width, follow the commands below
            System.out.println(cantMove); // print cantMove
        }
    }

    public void moveUp() { // method to move up the PacMan
        if (y > 0) { // if y is above 0, follow the commands below
            y--; // the value of y decreases
        } else { // if y is 0 or below 0, follow the commands below
            System.out.println(cantMove); // print cantMove
        }
    }

    public void moveDown() { // method to move down the PacMan
        if (y < height) { // if x is below height, follow the commands below
            y++; // the value of y increases
        } else { // if y is equal to height or above height, follow the commands below
            System.out.println(cantMove); // print cantMove
        }
    }

    public void printPosition() { // method to print the position of PacMan
        for (int j = 0; j < width; j++) { // iteration to print the top of area
            System.out.print(" ___ "); // print the area border 
        }
        for (int i = 0; i < height; i++) { // iteration to print the inner area
            System.out.println(""); // enter the line
            System.out.print("|"); // print the left border
            for (int j = 0; j < width; j++) { // iteration to fill the inner area
                if (i == y && j == x) { // selection to print the PacMan
                    if (j == width - 1) { // if j == width - 1, follow the commands below
                        System.out.print(" x "); // print the PacMan 
                    } else { // if j is not equal to width - 1, follow the commands below
                        System.out.print(" x   "); // print the PacMan
                    }
                } else { // if i is not equal to y and j is not equal to x, follow the commands below 
                    if (j == width - 1) { // if j == width - 1, follow the commands below
                        System.out.print("   "); // print the empty area
                    } else { // if j is not equal to width - 1, follow the commands below
                        System.out.print("     "); // print the empty area
                    }
                }
            }
            System.out.println("| " + i); // print the right border and print the index
        }
        for (int j = 0; j < width; j++) { // iteration to print the bottom of area
            System.out.print(" ¯¯¯ "); // print the area border
        }
        System.out.println(""); // enter the line 
        for (int j = 0; j < width; j++) { // iteration to print the position of area
            System.out.print("  " + j + "  "); // print the index
        }
        System.out.println(""); // enter the line
    }
    
}
