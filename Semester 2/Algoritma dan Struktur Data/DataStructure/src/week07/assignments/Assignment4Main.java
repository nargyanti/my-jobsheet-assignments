package week7.assignments;

import java.util.Scanner;

public class Assignment4Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        System.out.print("Input the total data: "); // print command
        int totalData = sc.nextInt(); // input totalData from keyboard
        Assignment4 citizenData = new Assignment4(totalData); // create object citizenData
        for (int i = 0; i < totalData; i++) { // iteration to type the data
            System.out.println(""); // print enter
            System.out.println("Citizen number " + i); // print citizen number
            System.out.print("NIK: "); // print "NIK: "
            int NIK = sc.nextInt(); // input NIK from keyboard
            sc.nextLine(); // to give enter
            System.out.print("Name: "); // print "Name: "
            String name = sc.nextLine(); // input name from keyboard
            System.out.print("Address: "); // print "Address: " 
            String address = sc.nextLine(); // input address from keyboard
            System.out.print("Gender: "); // print "Gender: "
            String gender = sc.nextLine(); // input gender from keyboard

            Citizen citizen = new Citizen(NIK, name, address, gender); // create object citizen
            citizenData.addData(citizen); // add data citizen to array of object citizenData
        }

        System.out.println("\nCitizen data: "); // print "\nCitizen data: "
        citizenData.printData(); // print all citizen data

        System.out.print("Type NIK that you want to search: "); // print command
        int search = sc.nextInt(); // input search from keyboard

        int position = citizenData.findSeqSearch(search); // method to search the position value
        System.out.println(""); // print enter
        citizenData.printPosition(search, position); // print position and citizen data

    }

}
