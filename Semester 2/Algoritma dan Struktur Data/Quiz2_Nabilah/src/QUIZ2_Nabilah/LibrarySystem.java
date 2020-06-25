package QUIZ2_Nabilah;

public class LibrarySystem {

    Node head;
    int size;

    public LibrarySystem() {
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

    public String status(Node m) {
        String status;
        if (m.stock > 0) {
            status = "Available";
        } else {
            status = "Not available";
        }
        return status;
    }

    public void printBookData() {
        if (!isEmpty()) {
            sortBookData();
            Node tmp = head;
            while (tmp != null) {
                tmp.print();
                System.out.println("Status: " + status(tmp));
                tmp = tmp.next;
                System.out.println("-----------------------------------------");
            }
        } else {
            System.out.println("The book is empty");
        }
    }

    public void sortBookData() {
        Node current = head, index;
        int temp;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.ISBN > index.ISBN) {
                    temp = current.ISBN;                    
                    current.ISBN = index.ISBN;
                    current.bookName = index.bookName; 
                    current.stock = index.stock;
                    index.ISBN = temp;
                   
                }
                index = index.next;
            }
            current = current.next;
            
        }
    }

    public Node getBook(int ISBN) {
        Node tmp = head;
        while (tmp.ISBN != ISBN) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void borrowBook(int ISBN, int amount) {
        Node tmp = getBook(ISBN);
        if (tmp == null) {
            System.out.println("Book not found");
        } else {
            if (tmp.stock > 0 && tmp.stock - amount >= 0) {
                tmp.stock -= amount;
            } else {
                System.out.println("You can't borrow the book because the book stock is less than the amount of book(s) you borrowed");
            }
        }
    }

    public void returnBook(int ISBN, int amount) {
        Node tmp = getBook(ISBN);
        if (tmp == null) {
            System.out.println("Book not found");
        } else {
            tmp.stock += amount;
        }
    }

}
