package week02;

public class TriangleMain {

    public static void main(String[] args) {
        Triangle[] sgArray = new Triangle[15];

        sgArray[0] = new Triangle(10, 4);
        sgArray[1] = new Triangle(20, 10);
        sgArray[2] = new Triangle(15, 6);
        sgArray[3] = new Triangle(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle number " + i);
            System.out.println("Area: " + sgArray[i].calculateArea());
            System.out.println("Circumference: " + sgArray[i].calculateCircumference());
            System.out.println("");
        }
    }

}
