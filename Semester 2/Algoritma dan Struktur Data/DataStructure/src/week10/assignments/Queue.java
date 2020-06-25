package week10.assignments;

public class Queue {

    int max, front, rear, size; // declare max, front, rear, size
    Customer q[]; // declare q[]

    public Queue(int max) { // constructor
        this.max = max; // initialize max
        create(); // call method create
    }

    public void create() { // method to create queue
        q = new Customer[max]; // instantiate q
        size = 0; // initialize size
        front = rear = - 1; // initialize front and rear
    }

    public boolean isEmpty() { // method to check queue is empty or not
        return size == 0; // return size == 0 is true or false
    }

    public boolean isFull() { // method to chech queue is full or not
        return size == max; // return size == max is true or false
    }

    public void enqueue(Customer data) { // method to add queue
        if (isFull()) { // if queue is full
            System.out.println("Queue is full"); // print text
        } else {// if queue is not full
            if (isEmpty()) { // if queue is empty
                front = rear = 0;
            } else { // if queue is not empty
                if (rear == max - 1) { // if rear is in last index
                    rear = 0; // rear = 0
                } else { // if reat not in last index
                    rear++; // rear increases
                }
            }
            q[rear] = data; // add data to queue
            size++; // size increases
        }
    }

    public Customer dequeue() { // meethod to pick th queue
        Customer data = null; // declare data
        if (isEmpty()) { // if queue is empty
            System.out.println("Queue is empty"); // print text
        } else { // if queue is not empty
            data = q[front]; // initialize data to store q[front]
            size--; // size decreases
            if (isEmpty()) { // if queue is empty
                front = rear = -1; // queue is empty
            } else { // if queue is not empty
                if (front == max - 1) { // if front is in last index
                    front = 0; // front back to index 0
                } else { // if front not in last index
                    front++; // front increases
                }
            }
        }
        return data; // return data
    }

    public void print() { // method to print data
        if (isEmpty()) { // if queue is empty
            System.out.println("Queue is empty"); // print text
        } else { // if queue is not empty
            int i = front; // declare and initialize i
            while (i != rear) { // iteration to print data
                System.out.println("Customer index " + i); // print queue num
                q[i].print(); // print data
                i = (i + 1) % max; // shift value i
                System.out.println(""); // print enter
            }
            System.out.println("Customer index " + i); // print queue num
            q[i].print(); // print data
            System.out.println("---------------------------"); // print border
            System.out.println("Size of queue = " + size); // print queue size
        }
    }

    public void peek() { //
        if (!isEmpty()) { // if queue is empty
            System.out.println("Front customer: ");
            q[front].print();
        } else { // if queue is not empty
            System.out.println("Queue is empty");
        }
    }

    public void peekRear() {
        if (!isEmpty()) { // if queue is empty
            System.out.println("Rear customer: ");
            q[rear].print();
        } else { // if queue is not empty
            System.out.println("Queue is empty");
        }
    }

    public void peekPosition(String accNo) { // method to peek queue position
        int i = front, queuePosition = 1; // declare & init i, queuePosition
        while (!q[i].accountNum.equals(accNo)) { // iteration to search data
            i = (i + 1) % max; // shift i 
            queuePosition++; // queuePosition increases
        }
        System.out.println("Customer " + q[i].name + ": "); // print cust
        System.out.println("Queue position: " + queuePosition); // print postion 
    }

    public void peekCustomer(int position) { // method to peek customer 
        int i = front, queuePosition = 1; // declare & init i, queuePosition
        while (queuePosition != position) { // iteration to search position
            i = (i + 1) % max; // shift i
            queuePosition++; // queuePosition increases
        }
        System.out.println("Queue position " + position + ": "); // print queue position
        q[i].print(); // print customer who have position sought
    }

}
