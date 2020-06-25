package LinkedListSorting;

public class SelectionSorting {

    public static void main(String[] args) {
        LinkedList library = new LinkedList();
        library.inputBookData(1902, "Daspro", 10);
        library.inputBookData(1900, "Matdis", 9);
        library.inputBookData(1783, "Algostruk", 7);
        library.inputBookData(1853, "Agama", 8);
        library.printBookData();
    }

}

class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int ISBN, String name, int stock) {
        head = new Node(ISBN, name, stock, head);
        size++;
    }

    public void inputBookData(int ISBN, String name, int stock) {
        if (isEmpty()) {
            addFirst(ISBN, name, stock);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(ISBN, name, stock, null);
        }
        size++;
    }

    public void printBookData() {
        sortBookData();
        Node tmp = head;
        while (tmp != null) {
            tmp.print();
            tmp = tmp.next;
            System.out.println("-----------------------------------------");
        }
    }

    public Node getBook(int ISBN) {
        Node tmp = head;
        while (tmp.ISBN != ISBN) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void sortBookData() {
        Node i = head;
        while (i != null) {           
            Node min = i;
            Node j = i.next;
            while (j != null) {
                if (j.ISBN < min.ISBN) {
                    min = j;
                }
                j = j.next;
            }
            Node tmp = min;
            min = i;
            i = tmp;            
        }
    }
}

class Node {

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
