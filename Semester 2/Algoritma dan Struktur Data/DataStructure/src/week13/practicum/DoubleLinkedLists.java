package doublelinkedlist;

public class DoubleLinkedLists {

    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Index value out of bounds");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) { //addFirst
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev; //dipasang ke newNode
                newNode.next = current;
                current.prev.next = newNode; //(current.prev).next
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nSuccessfully filled");
        } else {
            System.out.println("Linked Lists is empty");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("The liinked list is still empty, can't be deleted");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("The liinked list is still empty, can't be deleted");
        } else if (head.next == null) { //linked listnya cuma isi 1
            head = null;
            size--;
            return; // mirip break
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) { // removeLast
                current.prev.next = null;
            } else if (current.prev == null) { // removeFirst
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByValue(int item) throws Exception { // method to search by value
        if (isEmpty()) { // if linked list is empty
            throw new Exception("Linked list is empty"); // print text 
        }
        Node tmp = head; // declare and init tmp
        int index = 0; // declare and init index
        while (tmp.next != null) { // iteration to search item
            if (tmp.data == item) { // if data found
                break; // break the iterationn
            } else { // if tmp.data != item
                tmp = tmp.next; // shift tmp
                index++; // index increases
            }
        }
        if (tmp.data != item) { // if data not found
            return -1; // return -1
        }
        return index; // return index
    }

    public void sortAscending() { // method to sort ascending
        Node tmp = head; // declare and init temp
        while (tmp != null) { // iteration to sorting
            Node min = tmp; // declare and init min
            Node current = tmp.next; // declare and init current
            while (current != null) { // while current not null
                if (min.data > current.data) { // if min > current
                    min = current; // min = current
                } 
                current = current.next; // shift current
            }
            int x = tmp.data; // declare and init x
            tmp.data = min.data; // init tmp.data with min.data
            min.data = x; // init min.data with x
            tmp = tmp.next; // init tmp with tmp.next
        } 
        print(); // print data
    }

    public void sortDescending() { // method to sort descending
       Node tmp = head; // declare and init temp
        while (tmp != null) { // iteration to sorting
            Node max = tmp; // declare and init max
            Node current = tmp.next; // declare and init current
            while (current != null) { // while current not null
                if (max.data < current.data) { // if max < current
                    max = current; // max = current
                } 
                current = current.next; // shift current
            }
            int x = tmp.data; // declare and init x
            tmp.data = max.data; // init tmp.data with max.data
            max.data = x; // init max.data with x
            tmp = tmp.next; // init tmp with tmp.next
        } 
        print(); // print data
    }

}
