import java.util.Scanner;
public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        
        String menu, choose;
        double area, volume, side, pedestal, height, radius, pi = 3.14;
        
        System.out.print("Choose the operation (1 = area, 2 = volume) : ");
        menu = sc1.next();
        
        if (menu.equals("1")){
            System.out.print("Choose the geometry (a = square, b = triangle) : ");
            choose = sc1.next();
                if (choose.equalsIgnoreCase("a")){
                    System.out.println("-------THE AREA OF SQUARE-------");
                    System.out.print("Input the side: ");
                    side = sc.nextDouble();
                    area = side * side;
                    System.out.println("The area of square is " + area);
                } else if (choose.equalsIgnoreCase("b")){
                    System.out.println("-------THE AREA OF TRIANGLE-------");
                    System.out.print("Input the pedestal: ");
                    pedestal = sc.nextDouble();
                    System.out.print("Input the height: ");
                    height = sc.nextDouble();
                    area = 0.5 * height * pedestal;
                    System.out.println("The area of triangle is " + area);
                } else {
                    System.out.println("The input you entered is incorrect");
                }
        } else if (menu.equals("2")){
            System.out.print("Choose the geometry (a = cube, b = tube) : ");
            choose = sc1.next();
                if (choose.equalsIgnoreCase("a")){
                    System.out.println("-------THE VOLUME OF CUBE-------");
                    System.out.print("Input the side: ");
                    side = sc.nextDouble();
                    volume = side * side * side;
                    System.out.println("The volume of cube is " + volume);
                } else if (choose.equalsIgnoreCase("b")){
                    System.out.println("-------THE VOLUME OF TUBE-------");
                    System.out.print("Input the radius: ");
                    radius = sc.nextDouble();
                    System.out.print("Input the height: ");
                    height = sc.nextDouble();
                    volume = pi * radius * radius * height;
                    System.out.println("The volume of tube is " + volume);
                } else {
                    System.out.println("The input you entered is incorrect");
                }
        } else {
            System.out.println("The menu you entered is incorrect");
        }
    }
}
