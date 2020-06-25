package week7.assignments;

import java.util.Scanner;

public class Assignment2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instantiate Scanner sc
        int data[][] = {{45, 78, 7, 200, 80}, {90, 1, 17, 100, 50},
        {21, 2, 40, 18, 65}}; // declare and instantiate data[][]
        Assignment2 sch = new Assignment2(data, 3, 5); // create object sch

        System.out.println("Array data: "); // print text "Array data: "
        sch.printData(); // call method printData to print the array

        System.out.print("Type the number that you want to search: "); // print command
        int search = sc.nextInt(); // type the value of search in keyboard

        int position[] = sch.findSequenceSearch(search); // call method to find the position
        sch.printPosition(search, position); // print the position that contain the search value

    }

}
