package week02;

public class Cuboid {

    public int length, width, height;

    public Cuboid(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public int calculateVolume() {
        return length * width * height;
    }
}
