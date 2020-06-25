package week6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ListAchievementStudents data = new ListAchievementStudents();
        int totalStd = 5;

        for (int i = 0; i < totalStd; i++) {
            System.out.print("Name = ");
            String name = s.next();
            System.out.print("Year of entry = ");
            int year = s.nextInt();
            System.out.print("Age = ");
            int age = s.nextInt();
            System.out.print("GPA = ");
            double gpa = s.nextDouble();

            Student m = new Student(name, year, age, gpa);
            data.add(m);
        }
        
        System.out.println("Ascending or descending? ");
        int answer = s.nextInt();
        boolean ans = true;
        if (answer == 1) {
            ans = true;
        } else if (answer == 2) {
            ans = false;
        }

        System.out.println("Student data before sorting");
        data.print();
        System.out.println("Student data after sorting with Bubble Sort based on GPA");
        data.bubbleSort();
        data.print();
        System.out.println("Student data after asc sorting with Selection Sort based on GPA");
        data.selectionSort();
        data.print();
        System.out.println("Student data after asc sorting with Insertion Sort based on GPA");
        data.insertionSort(ans);
        data.print();
    }

}
