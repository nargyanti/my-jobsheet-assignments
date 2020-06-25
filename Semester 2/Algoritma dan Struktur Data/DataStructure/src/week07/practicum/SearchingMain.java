package week7;

import week7.Searching;

public class SearchingMain {

    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        Searching sch = new Searching(data, 8);
        
        System.out.println("Array data: ");
        sch.printData();
        
        int search = 30;
        System.out.println("Sequential search algorithm");
        int position = sch.FindSeqSearch(search);
        sch.printPosition(search, position);
        System.out.println("===============================");
        System.out.println("Binary search algorithm");
        position = sch.FindBinarySearch(search, 0, data.length - 1);
        sch.printPosition(search, position);
    }

}
