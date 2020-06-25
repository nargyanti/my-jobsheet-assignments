package DVDRental;

public class Node {
    Node next, prev;
    public int stock, broken, code;
    public String title, distributor;
    
    public Node(Node prev, int code, String title, String distributor, int stock, Node next) {
        this.prev = prev;
        this.code = code;
        this.title = title;
        this.distributor = distributor;
        this.stock = stock;
        this.broken = 0;
        this.next = next;
    }
    
    public void print() {
        System.out.println("DVD code: " + code);
        System.out.println("DVD title: " + title);
        System.out.println("Distributor: " + distributor);
        System.out.println("Stock: " + (stock - broken));
        System.out.println("Broken: " + broken);
    }
    
}
