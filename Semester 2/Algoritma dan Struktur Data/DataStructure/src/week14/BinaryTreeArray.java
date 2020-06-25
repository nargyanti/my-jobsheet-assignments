package week14;

public class BinaryTreeArray {

    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int value, int i) { // method to add value
        if (data[0] == 0) { // tree is empty
            data[0] = value; // add root
        } else { // tree is not empty
            if (i < data.length) { // stop recursive
                if (value < data[i]) { // value is smaller than data[i]
                    if (data[2 * i + 1] != 0) { // left child is not empty
                        add(value, (2 * i + 1)); // move to left child
                    } else { // left child is empty
                        data[2 * i + 1] = value; // add value
                        idxLast = 2 * i + 1; // initialize idxLast
                    }
                } else if (value > data[i]) { // value is larger than data[i]
                    if (data[2 * i + 2] != 0) { // right child is not empty
                        add(value, (2 * i + 2)); // move to right child
                    } else { // right child is empty
                        data[2 * i + 2] = value; // add value
                        idxLast = 2 * i + 2; // initialize idxLast
                    }
                }
            }
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) { // traverse pre-order method
        if (idxStart <= idxLast) { // idxStart <= idxLast
            System.out.print(data[idxStart] + " "); // print value
            traversePreOrder(2 * idxStart + 1); // move to left child
            traversePreOrder(2 * idxStart + 2); // move to right child
        }
    }

    void traversePostOrder(int idxStart) { // traverse post-order method
        if (idxStart <= idxLast) { // idxStart <= idxLast
            traversePostOrder(2 * idxStart + 1); // move to left child
            traversePostOrder(2 * idxStart + 2); // move to right child 
            System.out.print(data[idxStart] + " "); // print value
        }
    }

}
