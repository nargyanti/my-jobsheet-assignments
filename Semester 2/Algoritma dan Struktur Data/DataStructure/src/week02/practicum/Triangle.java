package week02;

public class Triangle {
    public int base;
    public int height;
    
    Triangle (int b, int t) {
        base = b;
        height = t;
    }
    
    public int calculateArea() {
        return base * height / 2;
    }
    
    public int calculateCircumference() {
        return 3 * base;
    }
}
