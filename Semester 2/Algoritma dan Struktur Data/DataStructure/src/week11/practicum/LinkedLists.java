package week11;

public class LinkedLists {

    Node head;
    int size;

    public LinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object item) {
        head = new Node(item, head);
        size++;
    }

    public void add(Object item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Index value out of bounds");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public void addByValue(Object item, Object value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot add data because LinkedLists is empty");
        } else {
            Node tmp = head;
            while (tmp.data != value) {
                if (tmp == null) {
                    throw new Exception("Cannot add data because no value found");
                } else {
                    tmp = tmp.next;
                }
            }
            Node next = tmp.next;
            tmp.next = new Node(item, next);
        }
    }

    public void addLast(Object item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public Object getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists is empty");
        }
        return head.data;
    }

    public Object getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists is empty");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Object get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of bounds");
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeByValue(Object value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove data because LinkedLists is empty");
        }
        if (head.data.equals(value)) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            while (!cur.data.equals(value)) {
                if (cur == null) {
                    throw new Exception("Cannot remove data because no value found");
                } else {
                    prev = cur;
                    cur = prev.next;
                }
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void searchByIndex(int index) throws Exception {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            if (tmp == null) {
                throw new Exception("Index sought is not found");
            }
        }
        System.out.println("\nData is found at index: " + index);
        System.out.println("Data: " + tmp.data + "");
        System.out.println("--------------------");
    }

    public void searchByValue(Object item) throws Exception {
        Node tmp = head;
        int index = 0;
        while (!tmp.data.equals(item)) {
            if (tmp == null) {
                throw new Exception("Data sought is not found");
            } else {
                tmp = tmp.next;
                index++;
            }
        }
        System.out.println("\nData is found at index: " + index);
        System.out.println("Data: " + tmp.data + "");
        System.out.println("--------------------");
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists is empty");
        }
    }

}
