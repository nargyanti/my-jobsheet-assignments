package week13.assignments;

public class DoubleLinkedList {

    Student head;
    int size; 

    public DoubleLinkedList() {
        head = null; 
        size = 0; 
    }

    public boolean isEmpty() { 
        return head == null; 
    }

    public void addFirst(String name, int score) {
        if (isEmpty()) { 
            head = new Student(null, name, score, null);
        } else { 
            Student newStudent = new Student(null, name, score, head); 
            head.prev = newStudent;
            head = newStudent; 
        }
        size++; 
    }

    public void addLast(String name, int score) {
        if (isEmpty()) {
            addFirst(name, score); 
        } else {
            Student current = head; 
            while (current.next != null) { 
                current = current.next; 
            }
            Student newStudent = new Student(current, name, score, null); 
            current.next = newStudent; 
            size++; 
        }
    }

    public void add(String name, int score, int index) throws Exception { 
        if (isEmpty()) {
            addFirst(name, score); 
        } else if (index < 0 || index > size) { 
            throw new Exception("Index value out of bounds"); 
        } else { 
            Student current = head; 
            int i = 0; 
            while (i < index) { 
                current = current.next; 
                i++; 
            }
            if (current.prev == null) { 
                Student newStudent = new Student(null, name, score, current); 
                current.prev = newStudent;  
                head = newStudent;   
            } else { // data in middle
                Student newStudent = new Student(current.prev, name, score, current);  
                newStudent.prev = current.prev;
                newStudent.next = current; 
                current.prev.next = newStudent;
                current.prev = newStudent;  
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
        System.out.println("Data sorted descending"); 
        if (!isEmpty()) { 
            sortDescending(); 
            Student tmp = head; 
            while (tmp != null) { 
                tmp.print(); 
                tmp = tmp.next; 
                System.out.println(""); 
            }
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

    public void removeLast() throws Exception { // method to remove last
        if (isEmpty()) { // if linked list is empty
            throw new Exception("The liinked list is still empty, can't be deleted"); // print error
        } else if (head.next == null) { // if linked list only 1 data
            head = null; // head = null
            size--; // size decreases
            return; // end method
        }
        Student current = head; // declare and initialize current
        while (current.next.next != null) { // iteration to shift current
            current = current.next; // shift current
        }
        current.next = null; // current.next = null;
        size--; // size decreases
    }

    public void remove(int index) throws Exception { // method to remove by index
        if (isEmpty() || index >= size) { // if linked list is empty or index >= size
            throw new Exception("Index value out of bounds"); // print error
        } else if (index == 0) { // if index = 0
            removeFirst(); // remove first
        } else {
            Student current = head; // declare and initialize current
            int i = 0; // declare and initialize i
            while (i < index) { // iteration to shift current
                current = current.next; // shift current
                i++; // i increases
            }
            if (current.next == null) { // removeLast
                current.prev.next = null; // current.prev.next = null
            } else if (current.prev == null) { // removeFirst
                current = current.next; // shift current
                current.prev = null; // current.prev = null
                head = current; // head = current
            } else { // else
                current.prev.next = current.next; // current.prev.next = current.next
                current.next.prev = current.prev; // current.next.prev = current.prev
            }
            size--; // size decreases
        }
    }

    public void getFirst() throws Exception { // method to get first data
        if (isEmpty()) { // if linked list is empty
            throw new Exception("Linked list is empty"); // print error
        }
        System.out.println("First data:\n"); // print first data
        head.print(); // print data
    }

    public void getLast() throws Exception { // method to get last data
        if (isEmpty()) { // if linke list is empty
            throw new Exception("Linked list is empty"); // print error
        }
        Student tmp = head; // declare and initialize tmp
        while (tmp.next != null) { // iteration to shift current
            tmp = tmp.next; // shift tmp
        }
        System.out.println("Last data: \n"); // print text
        tmp.print(); // print data
    }

    public void get(int index) throws Exception { // method to get by index
        if (isEmpty() || index >= size) { // if linked list is empty or index >= size
            throw new Exception("Index value out of bounds"); // print error
        }
        Student tmp = head; // declare and initialize tmp
        for (int i = 0; i < index; i++) { // iteration to shift tmp
            tmp = tmp.next; // shift tmp
        }
        System.out.println("Data index " + index); // print text
        tmp.print(); // print data
    }

    public void sortDescending() { // method to sort descending
        Student tmp = head; // declare and initialize temp
        while (tmp != null) { // iteration to sorting
            Student max = tmp; // declare and initialize max
            Student current = tmp.next; // declare and initialize current
            while (current != null) { // while current not null
                if (max.score < current.score) { // if max > current
                    max = current; // max = current
                }
                current = current.next; // shift current
            }
            int x = tmp.score; // declare and initialize x
            String y = tmp.name; // declare and initialize y
            tmp.score = max.score; // initialize tmp.data with max.data
            tmp.name = max.name; // tmp.name = max.name
            max.score = x; // initialize max.data with x
            max.name = y; // max.name = y
            tmp = tmp.next; // initialize tmp with tmp.next
        }
    }

}
