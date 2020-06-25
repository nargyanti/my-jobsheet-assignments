package week8;

public class Stack {

    int size, top;
    String data[];

    public Stack(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            String x = data[top];
            top--;
            System.out.println("Pop data: " + x);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        System.out.println("Top element: " + data[top]);
    }

    public void print() {
        System.out.println("Data stack is: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
                System.out.println("Top berkurang jadi " + top);
            }
            System.out.println("The stack has been emptied");
        } else {
            System.out.println("Failed! Stack is still empty");
        }
    }

}
