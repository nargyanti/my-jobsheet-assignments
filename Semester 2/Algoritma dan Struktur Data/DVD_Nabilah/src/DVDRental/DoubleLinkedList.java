package DVDRental;

public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int code, String name, String distributor, int stock) {
        if (isEmpty()) {
            head = new Node(null, code, name, distributor, stock, null);
        } else {
            Node newNode = new Node(null, code, name, distributor, stock, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void DVDEntered(int code, String name, String distributor, int stock) {
        if (isEmpty()) {
            addFirst(code, name, distributor, stock);
        } else {                        
            Node current = head;
            while (current.next != null) {                
                current = current.next;
            }
            Node newNode = new Node(null, code, name, distributor, stock, null);
            current.next = newNode;
            size++;
        }        
    }    
    
     public void DVDOut(int index, int amount) throws Exception {
        Node tmp = getByIndex(index);
        if (tmp == null) {
            System.out.println("DVD not found");
        } else {
            if ((tmp.stock - tmp.broken) > 0 && (tmp.stock - tmp.broken) - amount >= 0) {
                tmp.stock -= amount;
            } else {
                System.out.println("You can't borrow the book because the book stock is less than the amount of book(s) you borrowed");
            }
        }
    }
    
    public void addBroken(int code, int broken) {
        Node current = head;
        while (current != null) {
            if (current.code == code) {
                current.broken = broken;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public void print() {
        System.out.println("Data sorted ascending");
        if (!isEmpty()) {
            sortAscending();
            Node current = head;
            int idx = 0;
            while (current != null) {                
                System.out.println("DVD Index [" + idx + "]");
                current.print();
                current = current.next;
                System.out.println("");
                idx++;
            }
        } else {
            System.out.println("Linked Lists is empty");
        }
    }

    public Node getByTitleAndDistributor(String title, String distributor) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        Node current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title) && current.distributor.equalsIgnoreCase(distributor)) {
               break;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Node getByIndex(int index) throws Exception { 
        if (isEmpty() || index >= size) { 
            throw new Exception("Index value out of bounds"); 
        }
        sortAscending();
        Node tmp = head;
        for (int i = 0; i < index; i++) { 
            tmp = tmp.next; 
        }
        return tmp;
    }
    
    public Node getByCode(int code) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        Node current = head;
        while (current != null) {
            if (current.code == code) {
               break;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public void sortAscending() {
        Node tmp = head;
        while (tmp != null) {
            Node min = tmp;
            Node current = tmp.next;
            while (current != null) {
                if (min.title.charAt(0) > current.title.charAt(0)) {
                    min = current;
                }
                current = current.next;
            }
            int cd = tmp.code;
            String ttl = tmp.title;
            String dst = tmp.distributor;
            int stc = tmp.stock;
            int brk = tmp.broken;
            tmp.code = min.code;
            tmp.title = min.title;
            tmp.distributor = min.distributor;
            tmp.stock = min.stock;
            tmp.broken = min.broken;
            min.code = cd;
            min.title = ttl;
            min.distributor = dst;
            min.stock = stc;
            min.broken = brk;
            tmp = tmp.next;
        }
    }

}
