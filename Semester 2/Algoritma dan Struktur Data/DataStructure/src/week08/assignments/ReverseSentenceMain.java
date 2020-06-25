package week8.assignments;

import java.util.Scanner;

public class ReverseSentenceMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        System.out.print("Enter the sentence: "); // print imperative sentence
        String sentence = sc.nextLine(); // input sentence from keyboard
        String[] splitToWords = sentence.split(" "); // convert sentence to words
        ReverseSentence reverse = new ReverseSentence(splitToWords.length); // instantiate object reverse
        reverse.push(splitToWords); // push splitToWords
        reverse.print(); // print the reserve sentence
    }
}
