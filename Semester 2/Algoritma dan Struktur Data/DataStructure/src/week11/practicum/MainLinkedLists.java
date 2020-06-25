package week11;

import java.util.Scanner;

public class MainLinkedLists {

    public static void mainMenu() {
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedLists data = new LinkedLists();
        boolean backToMenu = true;
        System.out.println("============ LINKED LIST ============");
        while (backToMenu) {
            try {
                System.out.println("Main Menu:");
                System.out.println("1. Add\n2. Delete\n3. Search\n4. Exit");
                System.out.print("Type your answer: ");
                int answer = sc.nextInt();
                switch (answer) {
                    case 1:
                        System.out.println("\nAdd menu:");
                        System.out.println("1. Add first index");
                        System.out.println("2. Add by index");
                        System.out.println("3. Add last index");
                        System.out.print("Type your answer: ");
                        answer = sc.nextInt();
                        switch (answer) {
                            case 1:
                                System.out.print("Enter the value: ");
                                Object item = sc.next();
                                data.addFirst(item);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.print("Enter the value: ");
                                item = sc.next();
                                System.out.print("Enter the index: ");
                                int index = sc.nextInt();
                                data.add(item, index);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 3:
                                System.out.print("Enter the value: ");
                                item = sc.next();
                                data.addLast(item);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 4:
                                System.out.println("Enter value yg ada: ");
                                Object value = sc.next();
                                System.out.print("Enter the value: ");
                                item = sc.next();
                                data.addByValue(item, value);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("Your answer is incorrect");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nDelete menu:");
                        System.out.println("1. Delete by index");
                        System.out.println("2. Delete by keyword");
                        System.out.println("3. Clear");
                        System.out.print("Type your answer: ");
                        answer = sc.nextInt();
                        switch (answer) {
                            case 1:
                                System.out.print("Enter the index: ");
                                int index = sc.nextInt();
                                data.remove(index);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 2:
                                System.out.print("Enter the value: ");
                                Object item = sc.next();
                                data.removeByValue(item);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 3:
                                data.clear();
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            case 4:
                                System.out.println("Enter value yg ada: ");
                                Object value = sc.next();
                                System.out.print("Enter the value: ");
                                item = sc.next();
                                data.removeByValue(value);
                                System.out.println("\nCurrent data: ");
                                data.print();
                                System.out.println("--------------------");
                                break;
                            default:
                                System.out.println("Your answer is incorrect");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\nSearch menu:");
                        System.out.println("1. Search by index");
                        System.out.println("2. Search by keyword");
                        System.out.print("Type your answer: ");
                        answer = sc.nextInt();
                        switch (answer) {
                            case 1:
                                System.out.print("Enter the index: ");
                                int index = sc.nextInt();
                                data.searchByIndex(index);
                                break;
                            case 2:
                                System.out.print("Enter the value: ");
                                Object item = sc.next();
                                data.searchByValue(item);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Your answer is incorrect");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Good bye!");
                        backToMenu = false;
                        break;
                    default:
                        System.out.println("Your answer is incorrect");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
