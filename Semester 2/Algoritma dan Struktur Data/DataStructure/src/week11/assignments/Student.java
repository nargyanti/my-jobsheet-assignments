package week11.assignments;

public class Student {
    
    String NIM, name, address; // declare NIM, name, address
    Student next; // declare next
    
    public Student (String NIM, String name, String address, Student next) { // constructor
        this.NIM = NIM; // initialize NIM
        this.name = name; // initialize name
        this.address = address; // initialize address
        this.next = next; // initialize next
    }
    
    public void print() { // method to print data
        System.out.println("NIM: " + NIM); // print NIM
        System.out.println("Name: " + name); // print name
        System.out.println("Address: " + address); // print address
    }
    
}
