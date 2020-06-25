package week02;

public class CuboidMain {

    public static void main(String[] args) {
        Cuboid[] b1Array = new Cuboid[3];
        
        b1Array[0] = new Cuboid(100, 30, 12);
        b1Array[1] = new Cuboid(120, 40, 15);
        b1Array[2] = new Cuboid(210, 50, 25);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Cuboid volume no " + i + " : " + b1Array[i].calculateVolume());
        }
    }
    
}
