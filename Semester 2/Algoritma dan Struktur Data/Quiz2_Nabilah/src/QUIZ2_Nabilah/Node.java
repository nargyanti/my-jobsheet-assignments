package QUIZ2_Nabilah;

public class Node {
    public String bookName;
    public int ISBN, stock;
    Node next;
    
    public Node(int isbn, String name, int stk, Node next) {
        this.ISBN = isbn;
        this.bookName = name;
        this.stock = stk;
        this.next = next;
    }
    
    public void print() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Name: " + bookName);
        System.out.println("Stock: " + stock);
    }

}
