import java.util.Scanner;
class Lingkaran {
    static float pi = 3.14f;
    static float circumferenceCircle(float r) {
        float circumference = 2 * pi * r;
        return circumference;
    }
    static float areaCircle(float r) {
        float area = pi * r * r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the radian of circle: ");
        float radian = sc.nextFloat();
        System.out.println("\nThe circumference of circle is " + circumferenceCircle(radian));
        System.out.println("The area of circle is " + areaCircle(radian));
    }
}
