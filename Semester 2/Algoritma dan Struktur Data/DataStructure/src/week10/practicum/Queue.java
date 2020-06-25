package week10;

public class Queue {

    public int max, size, front, rear;
    public int[] Q;

    public Queue(int n) {
        max = n;
        create();
    }

    public void create() {
        Q = new int[max];
        size = 0;
        front = rear = - 1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Front element: " + Q[front]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Size of queue = " + size);
        }
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            data = Q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Rear element: " + Q[rear]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void peekPosition(int data) {
        int i = front, queuePosition = 1;
        while (Q[i] != data) {
            i = (i + 1) % max;
            queuePosition++;
        }
        System.out.println("Data " + data + ": ");
        System.out.println("Index position: " + i);
        System.out.println("Queue position number: " + queuePosition);

    }

    public void peekAt(int position) {
        int i = front, queuePosition = 1;
        while (queuePosition != position) {
            i = (i + 1) % max;
            queuePosition++;
        }
        System.out.println("Queue position number " + position + ": ");
        System.out.println("Data: " + Q[i]);
    }

}
