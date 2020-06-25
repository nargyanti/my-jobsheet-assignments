package week8.assignments;

import java.util.Scanner;

public class PrefixMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        System.out.print("Enter mathematical expression: "); // print command
        String infix = sc.nextLine(); // input infix from keyboard
        infix = infix.trim(); // delete space in beginning and ending of infix

        int total = infix.length(); // declare and initialize total

        Prefix prefix = new Prefix(total); // instantiare object prefix
        infix = prefix.reverseExpression(infix) + ")"; // add reserved infix with ")"
        String resultPrefix = prefix.convert(infix); // convert infix to prefix
        System.out.println("Prefix: " + resultPrefix); // print the result
    }

}
