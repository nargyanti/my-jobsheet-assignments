package week2.assignments;

import java.util.Scanner; // import scanner from library

public class LandCompanyMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        String wrongInput = "The data you entered is incorrect, please try again\n"; // declare String wrongInput

        while (true) { // iteration to check whether landAmount is above 0 or not
            System.out.print("Enter the amount of land: "); // print text "Enter the amount of land: "
            int landAmount = sc.nextInt(); // input the landAmount value
            if (landAmount > 0) { // if landAmount is above 0, follow the commands below
                LandCompany[] landComp = new LandCompany[landAmount]; // instantiate new array object landComp
                System.out.println(""); // print enter
                for (int i = 0; i < landAmount; i++) { // iteration to print and input the length and width
                    landComp[i] = new LandCompany(); // instantiate new index from landComp 
                    System.out.println("========================================="); // print border
                    System.out.println("Land " + (i + 1)); // print the sequence of land
                    while (true) { // iteration to check whether landComp[i].length is above 0 or not
                        System.out.print("· Length: "); // print text "· Length: "
                        landComp[i].length = sc.nextInt(); // input the landComp[i].length value
                        if (landComp[i].length > 0) { // if landComp[i].length is above 0, follow the commands below
                            while (true) { // iteration to check whether landComp[i].width is above 0 or not
                                System.out.print("· Width: "); // print text "· Width: "
                                landComp[i].width = sc.nextInt(); // input the landComp[i].width value
                                if (landComp[i].width > 0) { // if landComp[i].width is above 0, follow the commands below
                                    break; // exit the iteration
                                } else { // if landComp[i].width is 0 or below 0, follow the commands below
                                    System.out.println(wrongInput); // print wrongInput
                                }
                            }
                            break; // exit the iteration
                        } else { // if landComp[i].length is 0 or below 0, follow the commands below
                            System.out.println(wrongInput); // print wrongInput
                        }
                    }
                }
                System.out.println(""); // print enter
                for (int i = 0; i < landAmount; i++) { // iteration to print the area of land
                    System.out.println("Land area " + (i + 1) + ": " + landComp[i].calculateArea()); //print the area
                }
                int widestArea = landComp[0].calculateArea(); // declare widestArea with landComp[0].calculateArea()
                int count = 1; // declare count = 1
                for (int i = 0; i < landAmount; i++) { // iteration to determine the widest area
                    if (landComp[i].calculateArea() > widestArea) { // if area is larger than widestArea, follow the commands
                        widestArea = landComp[i].calculateArea(); // change the widestArea with new value
                        count += i; // add the count value with i
                    }
                }
                System.out.println("\nThe widest land: land " + (count)); // print the widest area
                break; // exit the iteration
            } else { // if landAmount is 0 or below 0, follow the commands below
                System.out.println(wrongInput); // print wrongInput
            }
        }
    }

}
