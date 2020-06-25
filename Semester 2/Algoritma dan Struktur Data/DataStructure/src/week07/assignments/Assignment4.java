package week7.assignments;

public class Assignment4 {

    public int totalData, index = 0; // declare totalData and index
    Citizen[] citizen; // declare array of object citizen

    public Assignment4(int totData) {
        totalData = totData; // initialize totalData
        citizen = new Citizen[totalData]; // create array of object
    }

    void addData(Citizen data) { // method to add data
        citizen[index] = data; // add data to citizen[index]
        index++; // the index value increases
    }

    void printData() { // method to print the data
        System.out.println("----------------------------------------"); // print border
        for (int i = 0; i < totalData; i++) { // iteration to print data
            System.out.println("Citizen number " + i); // citizen number
            citizen[i].printCitizen(); // call method to print data
            if (i < totalData - 1) { // if i is the end of data
                System.out.println(""); // enter the line
            }
        }
        System.out.println("----------------------------------------"); // print border
    }

    int findSeqSearch(int search) { // method to find NIK
        int position = -1; // declare and initialize position
        for (int i = 0; i < totalData; i++) { // iteration to find NIK
            if (citizen[i].NIK == search) { // if citizen[i].NIK is same with search
                position = i; // change the value of position to i
                break; // end the iteration
            }
        }
        return position; // return position
    }

    void printPosition(int x, int pos) { // method to print position
        if (pos != -1) { // if NIK is found
            System.out.println("NIK " + x + " found at citizen number " + pos); // print position
            citizen[pos].printCitizen(); // print citizen data
        } else { // if NIK not found
            System.out.println("NIK " + x + " not found"); // print not found
        }
    }

}
