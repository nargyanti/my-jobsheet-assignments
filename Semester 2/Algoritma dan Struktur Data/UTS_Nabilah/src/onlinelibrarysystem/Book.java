package onlinelibrarysystem;

public class Book {
    public String bookName;
    public int ISBN, stock;
    
    public Book(int isbn, String name, int stk) {
        ISBN = isbn;
        bookName = name;
        stock = stk;
    }
    
    public void print() {
        System.out.println("Name: " + bookName);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Stock: " + stock);
    }

}
