package week14;

import java.util.Scanner;

public class BinaryTreeMain {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("-----------------------------");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse Pre-Order");
        System.out.println("5. Traverse In-Order");
        System.out.println("6. Traverse Post-Order");
        System.out.println("7. Exit");
        System.out.println("-----------------------------");
        System.out.print(">> ");        
        int answer = sc.nextInt();
        System.out.println("-----------------------------");
        return answer;
    }

    public static int inputValue() {
        System.out.print("Value: ");
        int value = sc.nextInt();
        return value;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        boolean backToMenu = true;
        System.out.println("============ SEARCH BINARY TREE ============");
        while (backToMenu) {
            int menu = menu();
            switch (menu) {
                case 1:
                    System.out.println("Add");
                    int value = inputValue();
                    bt.add(value, bt.root);
                    break;
                case 2:
                    System.out.println("Delete");
                    value = inputValue();
                    bt.delete(value);
                    break;
                case 3:
                    System.out.println("Find");
                    value = inputValue();
                    System.out.println("Find " + bt.find(value));
                    break;
                case 4:
                    System.out.print("Traverse pre-order:");
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Traverse in-order:");
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Traverse post-order:");
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Good bye!");
                    backToMenu = false;
                    break;
                default:
                    System.out.println("Your input is invalid");
            }
        }
    }

}
