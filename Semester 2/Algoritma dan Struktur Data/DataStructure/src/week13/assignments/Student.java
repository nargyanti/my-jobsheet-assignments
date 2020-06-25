package week13.assignments;

public class Student {

    String name; // declare name
    int score; // declare score
    Student prev, next; // declare prev, next

    Student(Student prev, String name, int score, Student next) { //constructor
        this.prev = prev; // initialize prev
        this.name = name; // initialize name
        this.score = score; // initialize score
        this.next = next; // initialize next
    }
    
    public void print() { // method to print data
        System.out.println("Name: " + name); // print name
        System.out.println("Score: " + score); // print score
    }
}
