package week7.assignments;

public class Assignment2 {

    public int data[][]; // declare data[][]
    public int totalRow, totalColumn; // declare totalRow and totalColumn

    public Assignment2(int Data[][], int totRow, int totColumn) { // constructor
        totalRow = totRow; // initialize totalRow
        totalColumn = totColumn; // initialize totalColumn
        data = new int[totalRow][totalColumn]; // instantiate data 
        for (int i = 0; i < totalRow; i++) { // iteration to copy array
            System.arraycopy(Data[i], 0, data[i], 0, totalColumn); // copy array
        }
    }

    public int[] findSequenceSearch(int search) { // method to find the position of search value
        int position[] = {-1, -1}; // declare and initialize position[]
        for (int i = 0; i < totalRow; i++) { // iteration to search row position
            for (int j = 0; j < totalColumn; j++) { // // iteration to search column position 
                if (data[i][j] == search) { // if data[i][j] is same with search
                    position[0] = i; // save row value in position[0]
                    position[1] = j; // save column value in position[1]
                    break; // end the iteration
                }
            }
        }
        return position; // return position
    }

    public void printData() { // method to print the data
        System.out.println("  | 0   1   2    3   4"); // print index
        System.out.println("-----------------------"); // print border
        for (int i = 0; i < totalRow; i++) { // iteration to print data 
            System.out.print(i + " | "); // print index
            for (int j = 0; j < totalColumn; j++) { // iteration to print data
                if (data[i][j] < 10) { // if data[i][j] < 10
                    System.out.print(data[i][j] + "   "); // print data with 3 space
                } else if (data[i][j] < 100) { // if data[i][j] < 100
                    System.out.print(data[i][j] + "  "); // print data with 2 space
                } else { // if data[i][j] >= 100
                    System.out.print(data[i][j] + " "); // print data with 1 space
                }
            }
            System.out.println(); // print enter
        }
        System.out.println(); // print enter
    }

    public void printPosition(int x, int pos[]) { // print the position of search
        if (pos[0] != -1 && pos[1] != -1) { // if position[0] and position[1] not -1
            System.out.println("\nData " + x + " found at index [" + pos[0] + "][" + pos[1] + "]"); // print position
        } else { // if position[0] and position[1] is -1
            System.out.println("\nData " + x + " not found"); // print not found
        }
    }

}
