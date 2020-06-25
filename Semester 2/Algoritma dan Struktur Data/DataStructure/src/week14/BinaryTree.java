package week14;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data, Node current) {
        if (isEmpty()) { // tree is empty
            root = new Node(data);
        } else {
            if (data < current.data) {
                if (current.left != null) {
                    add(data, current.left);
                } else {
                    current.left = new Node(data);
                }
            } else if (data > current.data) {
                if (current.right != null) {
                    add(data, current.right);
                } else {
                    current.right = new Node(data);
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
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

    Node getSuccessor(Node del) {
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
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
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
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    int smallestValue(Node current) {
        if (current.left != null) {
            return smallestValue(current.left);
        } else {
            return current.data;
        }
    }

    int largestValue(Node current) {
        if (current.right != null) {
            return largestValue(current.right);
        } else {
            return current.data;
        }
    }

    void getLeaf(Node current) {
        if (current != null) {
            if (current.left != null || current.right != null) {
                getLeaf(current.left);
                getLeaf(current.right);
            } else {
                System.out.print(current.data + " ");
            }
        }
    }

    int countLeaf(Node current) {
        if (current == null) {
            return 0;
        }
        if (current.left != null || current.right != null) {
            return countLeaf(current.left) + countLeaf(current.right);
        } else {
            return 1;
        }
    }

}
