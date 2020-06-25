package week11;

public class Node<T> {

    T data;
    Node<T> next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

}
