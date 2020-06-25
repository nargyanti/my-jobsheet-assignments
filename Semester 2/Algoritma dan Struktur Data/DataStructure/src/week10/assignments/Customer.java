package week10.assignments;

public class Customer {

    String accountNum, name; // declare accountNum, name

    public Customer(String accNum, String nm) { // constructor
        accountNum = accNum; // initialize accountNum
        name = nm; // intialize name
    }

    public void print() { // method to print custumer data
        System.out.println("Name: " + name); // print name
        System.out.println("Account number: " + accountNum); // print acc num
    }
}
