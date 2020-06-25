package week11.assignments;

public class Theater {

    int size, queueNo; // declare size, queueNo
    Ticket head; // declare head

    public Theater() { // constructor        
        head = null; // head = null 
        size = 0; // size = 0
    }

    public boolean isEmpty() { // method to check queue is empty or not
        return head == null; // return head == null is true or false
    }

    public void enqueue(String name, String movieCode) { // method to add queue                
        queueNo++; // queueNo increases
        if (isEmpty()) { // if queue is empty
            head = new Ticket(queueNo, name, movieCode, head); // add head
        } else { // if queue is not empty
            Ticket tmp = head; // declare and init tmp
            while (tmp.next != null) { // iteration to shift tmp
                tmp = tmp.next; // shift tmp
            }
            tmp.next = new Ticket(queueNo, name, movieCode, null); // add tmp.next
        }
        size++; // size increases
    }

    public Ticket dequeue() throws Exception { // meethod to pick the queue
        Ticket data = null; // declare data
        if (isEmpty()) { // if queue is empty
            throw new Exception("Cannot remove data because queue is empty\n"); // print text
        } else { // if queue is not empty
            data = head; // data = head
            head = head.next; // head == head.next
            size--; // size decreases
        }
        return data; // return data
    }

    public void print() { // method to print data
        if (isEmpty()) { // if queue is empty
            System.out.println("Queue is empty"); // print text
        } else { // if queue is not empty
            Ticket tmp = head; // declare and init tmp
            System.out.println("------------------------------"); // print border
            while (tmp != null) { // iteration to print list
                tmp.print(); // print list
                System.out.println(""); // enter 
                tmp = tmp.next; // shift tmp
            }
            System.out.println("------------------------------"); // print border
            System.out.println("Size of queue : " + size); // print queue size
        }
    }

    public void peekFront() throws Exception { // method to peek front
        if (!isEmpty()) { // if queue is not empty
            System.out.println("Front customer: "); // print text
            head.print(); // print head
        } else { // if queue is empty
            throw new Exception("Queue is empty"); // print text
        }
    }

    public void peekRear() throws Exception { // method to peek rear
        if (!isEmpty()) { // if queue is not empty
            if (size == 1) { // if size == 1
                System.out.println("Rear customer: "); // print text
                head.print(); // print head
            } else { // if queue is empty
                Ticket tmp = head; // declare and init tmp
                while (tmp != null) { // iteration to shift tmp
                    tmp = tmp.next; // shift tmp
                    if (tmp.next == null) { // iff tmp.next is null
                        System.out.println("Rear customer: "); // print text
                        tmp.print(); // print tmp
                        break; // end while
                    }
                }
            }
        } else { // if queue is empty
            throw new Exception("Queue is empty"); // print text
        }
    }

    public void peekPosition(int queue) { // method to peek queue position
        Ticket tmp = head; // declare and init tmp
        int queuePosition = 1; // declare & init queuePosition
        while (tmp.queueNum != queue) { // iteration to search data
            tmp = tmp.next; // shift tmp
            queuePosition++; // queuePosition increases            
        }
        System.out.println("Customer " + tmp.name + ": "); // print cust        
        System.out.println("Queue number: " + tmp.queueNum); // print tmp.queueNum
        System.out.println("Queue position: " + queuePosition); // print queuePosition
    }

    public void peekCustomer(int position) { // method to peek customer 
        int queuePosition = 1; // declare & init queuePosition
        Ticket tmp = head; // declare and init tmp
        while (queuePosition != position) { // iteration to search position            
            tmp = tmp.next; // shift tmp
            queuePosition++; // queuePosition increases            
        }
        System.out.println("Queue position " + position + ": "); // print queue position
        tmp.print(); // print customer who have position sought
    }

}
