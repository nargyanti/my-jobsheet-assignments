package week8;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack tumpukan = new Stack(4);
        boolean backToMenu = true;
        System.out.println("=============== STACK PROGRAM ===============");
        while (backToMenu) {
            System.out.println("\nMain menu");
            System.out.println("1. Push data into stack");
            System.out.println("2. Print stack");
            System.out.println("3. Pop data in the stack ");
            System.out.println("4. Peek the top of stack");
            System.out.println("5. Check whether the stack is empty or not");
            System.out.println("6. Check whether the stack is full or not");
            System.out.println("7. Clear stack");
            System.out.print("Type the answer: ");
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("\nPush data");
                    System.out.print("Enter the text: ");
                    sc.nextLine();
                    String text = sc.nextLine();
                    tumpukan.push(text);
                    break;
                case 2:
                    System.out.println();
                    tumpukan.print();
                    break;
                case 3:
                    System.out.println("\nPop data");
                    tumpukan.pop();
                    break;
                case 4:
                    System.out.println("Peek the top of stack");
                    tumpukan.peek();
                    break;
                case 5:
                    System.out.println("Stack is empty or not");
                    if (tumpukan.IsEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 6:
                    System.out.println("Stack is full or not");
                    if (tumpukan.IsFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 7:
                    System.out.println("Clear stack");
                    tumpukan.clear();
                    break;
                default:
                    System.out.println("Your answer is wrong");
                    break;
            }
            System.out.println("\nDo you want to back to main menu (0 = no, 1 = yes)?");
            System.out.print("Type the answer: ");
            answer = sc.nextInt();
            if (answer == 1) {
                backToMenu = true;
            } else if (answer == 0) {
                backToMenu = false;
            } else {
                System.out.println("Your answer is wrong, auto back to main menu");
                backToMenu = true;
            }
        }
    }

}
