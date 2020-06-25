package week6;

public class Student {

    String name;
    int yearEntry, age;
    double gpa;

    public Student(String n, int y, int a, double g) {
        name = n;
        yearEntry = y;
        age = a;
        gpa = g;
    }

    void print() {
        System.out.println("Name = " + name);
        System.out.println("Year of entry = " + yearEntry);
        System.out.println("Age = " + age);
        System.out.println("GPA = " + gpa);
    }
}
