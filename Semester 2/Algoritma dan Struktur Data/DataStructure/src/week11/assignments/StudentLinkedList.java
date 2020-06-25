package week11.assignments;

public class StudentLinkedList {

    Student head; // declare head
    int size; // declare size

    public StudentLinkedList() { // constructor
        head = null; // initialize head
        size = 0; // initialize size
    }

    public boolean isEmpty() { // method to check list is empty or not
        return head == null; // if head == null, return true. If not, false
    }

    public void addFirst(String NIM, String name, String address) { // method to add first
        head = new Student(NIM, name, address, head); // add data to head
        size++;
    }

    public void addByIndex(String NIM, String name, String address, int index) throws Exception { // method to add by index
        if (index < 0 || index > size) { // if index < 0 or index > size
            throw new Exception("Index value out of bounds\n"); // print text
        }
        if (isEmpty() || index == 0) { // if list is empty or index = 0
            addFirst(NIM, name, address); // do add first
        } else { // list is not empty and index != 0
            Student tmp = head;  // declare and initiallize tmp
            for (int i = 1; i < index; i++) { // iteration to shift tmp
                tmp = tmp.next; // shifft tmp
            }
            Student next = (tmp == null) ? null : tmp.next; // declaare and init next 
            tmp.next = new Student(NIM, name, address, next); // add tmp.net
        }
        size++; // size increases
    }

    public void addLast(String NIM, String name, String address) { // add data to last list
        if (isEmpty()) { // if list is empty
            addFirst(NIM, name, address); // add first
        } else { // if list is not empty
            Student tmp = head; // declare and init tmp
            while (tmp.next != null) { // iteration to shift tmp
                tmp = tmp.next; // shift tmp
            }
            tmp.next = new Student(NIM, name, address, null); // add data
        }
        size++; // size increases
    }

    public void removeByIndex(int index) throws Exception { // method to remove data by index
        if (isEmpty() || index >= size) { // if list is empty or index >= size
            throw new Exception("Index value out of bounds\n"); // print text
        }
        if (index == 0) { // if index == 0
            removeFirst(); // remove first list
        } else { // else
            Student prev = head; // declare and init prev
            Student cur = head.next; // declare and init cur
            for (int i = 1; i < index; i++) { // iteration to shift prev & cur
                prev = cur; // prev = cur
                cur = prev.next; // shift cur
            }
            prev.next = cur.next; // shift prev.next = cur.next
            size--; // size decreases
        }
    }

    public void removeByNIM(String NIM) throws Exception { // method to remove data by NIM
        if (isEmpty()) { // if list is empty
            throw new Exception("Cannot remove data because LinkedLists is empty\n"); // print text
        } 
        if (head.NIM.equals(NIM)) { // if NIM found at head
            removeFirst(); // remove first list
        } else { // else
            Student prev = head; // declare and init prev
            Student cur = head.next; // declare and init cur
            while (!cur.NIM.equals(NIM)) { // iteration to shift prev and cur
                if (cur == null) { // id cur == null
                    throw new Exception("Cannot remove data because no value found\n"); // print text
                } else { // if cur is not null
                    prev = cur; // shift prev
                    cur = prev.next; // shift cur
                }
            }
            prev.next = cur.next; // shift prev.next = cur.next
            size--; // size decreases
        }
    }

    public void removeFirst() throws Exception { // remove first list
        head = head.next; // shift head to head.list
        size--; // size decreases
    }

    public void clear() { // method to clear linked list
        head = null; // head = null
        size = 0; // size = 0
    }

    public void searchByIndex(int index) throws Exception { // method to search by index
        Student tmp = head; // declare and init tmp
        for (int i = 0; i < index; i++) { // iteration to shift tmp
            tmp = tmp.next; // shift tmp
            if (tmp == null) { // if tmp == null
                throw new Exception("Index sought is not found\n"); // print text
            }
        }
        System.out.println("\nData is found at index: " + index); // print index
        tmp.print(); // print data 
        System.out.println("------------------------------\n"); // print border
    }

    public void searchByNIM(String NIM) throws Exception { // method to search by NIM
        Student tmp = head; // declare and init tmp 
        int index = 0; // declare and init index
        while (!tmp.NIM.equals(NIM)) { // iteration to shift tmp
            if (tmp == null) { // if tmp == null
                throw new Exception("Data sought is not found\n"); // print text
            } else { // if tmp != null
                tmp = tmp.next; // shift tmp
                index++; // index increases
            }
        }
        System.out.println("\nData is found at index: " + index); // print index
        tmp.print(); // print data 
        System.out.println("------------------------------\n"); // print border
    }

    public void print() { // method to print data
        if (!isEmpty()) { // if list is not empty
            Student tmp = head; // declare and init tmp
            int index = 0; // declare and init index
            System.out.println("\nCurrent data: "); // print text
            System.out.println("------------------------------"); // print border
            while (tmp != null) { // iteration to print data
                System.out.println("Student index [" + index + "]: "); // print index
                tmp.print(); // print data
                System.out.println(""); // print enter
                tmp = tmp.next; // shift tmp
                index++; // index increases
            }
            System.out.println("------------------------------\n"); // print border
        } else { // if list is empty
            System.out.println("LinkedLists is empty\n");
        }
    }

}
