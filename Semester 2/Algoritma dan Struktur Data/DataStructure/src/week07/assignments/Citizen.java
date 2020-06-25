package week7.assignments;

public class Citizen {

    String name, address, gender; // declare name, address, gender
    int NIK; // declare NIK

    public Citizen(int nik, String nm, String addr, String gdr) { // constructor
        NIK = nik; // initialize NIK 
        name = nm; // initialize name
        address = addr; // initialize address
        gender = gdr; // initialize gender
    }

    public void printCitizen() { // method to print citizen 
        System.out.println("NIK: " + NIK); // print NIK
        System.out.println("Name: " + name); // print name
        System.out.println("Address: " + address); // print address
        System.out.println("Gender: " + gender); // print gender
    }
}
