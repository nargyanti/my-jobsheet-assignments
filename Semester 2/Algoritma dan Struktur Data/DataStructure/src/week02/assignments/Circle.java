package week2.assignments;

public class Circle { // declare the Circle class
    public double PHI, r; // declare attributes PHI and r with data type double
    
    public double calculateArea() { // method to calculate the area 
        return PHI * r * r; // return the value of PHI * r * r
    } 
    
    public double calculateCircumference() { // method to calculate the circumference
        return 2 * PHI * r; // return the value of 2 * PHI * r
    }
}
