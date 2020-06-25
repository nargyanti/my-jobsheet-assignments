package week7.assignments;

public class Assignment3Main {

    public static void main(String[] args) {
        int array[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90}; // declare and initialize array

        Assignment3 searchMax = new Assignment3(array, 10); // create object searchMax

        System.out.println("Array data:"); // print "Array data: "
        searchMax.printArray(); // print the array

        searchMax.mergeSort(); // merge sort the data
        System.out.println("\nArray after sorting: "); // print "\nArray after sorting: "
        searchMax.printArray(); // print array 

        int maximum = searchMax.findMaxValue(); // call method to search max value
        System.out.println("\nMaximum value: " + maximum); // print max value
        System.out.print("Location: "); // print "Location"
        searchMax.printPosition(maximum, 0, 9); // print location of max value
        System.out.println("\nMaximum value amount: " + searchMax.maxAmount); // print maxAmount

    }

}
