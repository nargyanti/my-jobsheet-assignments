package week7;

import week7.MergeSort;

public class SortMain {

    public static void main(String[] args) {
        int[] data = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting with merge sort");
        MergeSort mSort = new MergeSort();
        System.out.println("Data array:");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("After sorting...");
        mSort.printArray(data);
    }

}
