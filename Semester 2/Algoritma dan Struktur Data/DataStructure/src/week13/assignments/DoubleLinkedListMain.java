package week13.assignments;

import java.util.Scanner;

public class DoubleLinkedListMain {

    static Scanner sc = new Scanner(System.in); // instantiate scanner sc

    public static int menu() { // method to print menu
        System.out.println("=============================="); // border
        System.out.println("Main menu:"); // print "Main menu:"
        System.out.println("1. Add first"); // print "1. Add first"
        System.out.println("2. Add last"); // print "2. Add last"
        System.out.println("3. Add by index"); // print "3. Add by index"
        System.out.println("4. Remove first"); // print "4. Remove first"
        System.out.println("5. Remove last"); // print "5. Remove last"
        System.out.println("6. Remove by index"); // print "6. Remove by index"
        System.out.println("7. Print data"); // print "7. Print data"
        System.out.println("8. Get data"); // print "8. Get data"
        System.out.println("9. Clear"); // print "9. Clear"
        System.out.println("10. Exit"); // print "10. Exit"
        System.out.println("=============================="); // print border
        System.out.print(">> "); // print ">> "
        int answer = sc.nextInt(); // input answer from keyboard
        System.out.println("=============================="); // print border
        return answer; // return answer
    }

    public static String inputName() { // method to input the name
        System.out.print("Input name: "); // print "Input name: "
        sc.nextLine(); // enter 1 line
        String name = sc.nextLine(); // input name from keyboard
        return name; // return name
    }
    
    public static int inputScore() { // method to input the score
        System.out.print("Input score: "); // print "Input score: "
        int score = sc.nextInt(); // input score from keyboard
        return score; // return score
    }

    public static int inputIndex() { // method to input the index
        System.out.print("Input index: "); // print "Input index: "
        int index = sc.nextInt(); // input index from keyboard
        return index; // return index
    }

    public static int getMenu() { // method to show menu of get 
        System.out.println("1. Get first data"); // print "1. Get first data"
        System.out.println("2. Get last data"); // print "2. Get last data"
        System.out.println("3. Get data by index"); // print "3. Get data by index"
        System.out.println("=============================="); // print border
        System.out.print(">> "); // print ">> "
        int answer = sc.nextInt(); // input answer from keyboard
        System.out.println("=============================="); // print border
        return answer; // return answer
    }

    public static void main(String[] args) {
        try { // to catch error
            DoubleLinkedList dll = new DoubleLinkedList(); // instantiate dll
            System.out.println("DOUBLE LINKED LIST WITH MENU"); // print text
            boolean backToMenu = true; // declare and initialize backToMenu
            while (backToMenu) { // iteration to back to menu
                int answer = menu(); // declare and initialize answer
                switch (answer) { // selection to decide menu 
                    case 1: // add first data
                        String name = inputName(); // declare and initialize name
                        int score = inputScore(); // declare and initialize score
                        dll.addFirst(name, score); // add first data
                        break; // exit selection
                    case 2: // add last data
                        name = inputName(); // initialize name
                        score = inputScore(); // initialize score
                        dll.addLast(name, score); // add last data
                        break; // exit selection
                    case 3: // add by index
                        name = inputName(); // initialize name
                        score = inputScore(); // initialize score
                        int index = inputIndex(); // declare and initialize index
                        dll.add(name, score, index); // add by index
                        break; // exit selection
                    case 4: // remove first
                        dll.removeFirst(); // remove first data
                        break; // exit selection
                    case 5: // remove last
                        dll.removeLast(); // remove last data
                        break; // exit selection
                    case 6: // remove by index
                        index = inputIndex(); // initialize index
                        dll.remove(index); // remove by index
                        break; // exit selection
                    case 7: // print data
                        dll.print(); // print data
                        break; // exit selection
                    case 8:
                        answer = getMenu(); // initialize answer
                        switch (answer) { // selection to decide menu get
                            case 1: // get first 
                                dll.getFirst(); // get first
                                break; // exit selection
                            case 2: // get last
                                dll.getLast(); // get last
                                break; // exit selection
                            case 3: // get by index
                                index = inputIndex(); // initialize index
                                dll.get(index); // get by index
                                break; // exit selection
                            default: // if input is wrong
                                System.out.println("Your answer is wrong"); // print answer is wrong
                                break; // exit selection
                        }
                        break; // exit selection
                    case 9: // clear data
                        dll.clear(); // clear double linked list
                        break; // exit selection
                    case 10: // exit
                        System.out.println("Good bye!"); // print "Good bye!"
                        backToMenu = false; // initialize backToMenu 
                        break; // exit selection
                    default: // answer is wrong
                        System.out.println("Your answer is wrong"); // print answer is wrong
                        break; // exit selection
                }
            }
        } catch (Exception e) { // catch error
            System.out.println(e.getMessage());
        }
    }

}
