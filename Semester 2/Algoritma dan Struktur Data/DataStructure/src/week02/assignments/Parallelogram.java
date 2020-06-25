package week2.assignments;

public class Parallelogram {
    
    public int height, length, hypotenuse; // declare integer attributes (height, length, hypotenuse)
    
    public int calculateArea() { // method to calculate the area of parallelogram
        return length * height; // return the value from length * height
    }
    
    public int calculateCircumference() { // method to calculate the circumference of parallelogram
        return (2 * length) + (2 * hypotenuse); // return the value from (2 * length) + (2 * hypotenuse)
    }
 }
