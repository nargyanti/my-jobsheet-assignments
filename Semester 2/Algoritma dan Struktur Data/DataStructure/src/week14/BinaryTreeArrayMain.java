package week14;

public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0}; // declare and initialize data
        int idxLast = 6; // declare and initialize idxLast
        bta.populateData(data, idxLast); // populateData
        bta.add(2, 0); // add value
        bta.traverseInOrder(0); // print traverse in-order
        System.out.println(""); // enter
        bta.traversePreOrder(0); // print traverse pre-order
        System.out.println(""); // enter
        bta.traversePostOrder(0); // print traverse post-order
        System.out.println(""); // enter
        System.out.println("Last index: " + bta.idxLast); // print last index
    }

}
