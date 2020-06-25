package BinaryTree;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // tree is empty
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) { // data lebih kecil dr data node
                    if (current.left != null) {                         
                        current = current.left; // pindah ke child yang kiri                        
                    } else {
                        current.left = new Node(data); 
                        break; // udahan whilenya
                    }
                } else if (data > current.data) { // data lebih besar dari data node
                    if (current.right != null) { // pindah ke child yang kanan
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false; // awalnya gaada
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left; // ke child yang kiri
            } else {
                current = current.right; // ke child yang kanan
            }
        }
        return result;
    }

    void traversePreOrder(Node node) { // 
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {            
            traverseInOrder(node.left);            
            System.out.print(" " + node.data);            
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) { // node yg ada di bawahnya node tertentu
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) { // datanya sama
                break;
            } else if (data < current.data) { // geser ke kanan
                parent = current;
                current = current.left;
                isLeftChild = true; // anaknya di kiri
            } else if (data > current.data) { // geser ke kanan
                parent = current;
                current = current.right;
                isLeftChild = false; // anaknya di kanan
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there are 2 children
                Node successor = getSuccessor(current); 
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor; // parent.right connect in ke successor
                    }
                }
                successor.left = current.left; // connect successor.left ke current.left alias parent sebelumnya
            }
        }
    }

}
