package doublelinkedlist;

import java.util.Scanner;

public class DoubleLinkedListsMain {

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
        System.out.println("8. Search data"); // print "8. Search data"
        System.out.println("9. Sorting data"); // print "0. Sorting data"
        System.out.println("10. Exit"); // print "9. Exit"
        System.out.println("=============================="); // print border
        System.out.print(">> "); // print ">> "
        int answer = sc.nextInt(); // input answer from keyboard
        System.out.println("=============================="); // print border
        return answer; // return answer
    }

    public static int inputData() { // method to input the data
        System.out.print("Input data: "); // print "Input data: "
        int data = sc.nextInt(); // input data from keyboard
        return data; // return data
    }

    public static int inputIndex() { // method to input the index
        System.out.print("Input index: "); // print "Input index: "
        int index = sc.nextInt(); // input index from keyboard
        return index; // return index
    }

    public static int getMenu() { // method to show menu of get 
        System.out.println("1. Get first data"); // print "1. Get first data"
        System.out.println("2. Get last data"); // print "2. Get last data"
        System.out.println("3. Search by index"); // print "3. Search by index"
        System.out.println("4. Search by value"); // print "4. Search by value"
        System.out.println("=============================="); // print border
        System.out.print(">> "); // print ">> "
        int answer = sc.nextInt(); // input answer from keyboard
        System.out.println("=============================="); // print border
        return answer; // return answer
    }

    public static void main(String[] args) {
        try { // to catch error
            DoubleLinkedLists dll = new DoubleLinkedLists(); // instantiate dll
            System.out.println("DOUBLE LINKED LIST WITH MENU"); // print text
            boolean backToMenu = true; // declare and init backToMenu
            while (backToMenu) { // iteration to back to menu
                int answer = menu(); // declare and init answer
                switch (answer) { // selection to decide menu 
                    case 1: // add first data
                        int data = inputData(); // declare and init data
                        dll.addFirst(data); // add first data
                        break; // exit selection
                    case 2: // add last data
                        data = inputData(); // init data
                        dll.addLast(data); // add last data
                        break; // exit selection
                    case 3: // add by index
                        data = inputData(); // init data
                        int index = inputIndex(); // declare and init index
                        dll.add(data, index); // add by index
                        break; // exit selection
                    case 4: // remove first
                        dll.removeFirst(); // remove first data
                        break; // exit selection
                    case 5: // remove last
                        dll.removeLast(); // remove last data
                        break; // exit selection
                    case 6: // remove by index
                        index = inputIndex(); // init index
                        dll.remove(index); // remove by index
                        break; // exit selection
                    case 7: // print data
                        dll.print(); // print data
                        break; // exit selection
                    case 8:
                        answer = getMenu(); // init answer
                        switch (answer) { // selection to decide menu get
                            case 1: // get first 
                                System.out.println("First node: " + dll.getFirst()); // print data
                                break; // exit selection
                            case 2: // get last
                                System.out.println("Last node: " + dll.getLast()); // print data
                                break; // exit selection
                            case 3: // search by index
                                index = inputIndex(); // init index
                                System.out.println("Data index " + index + ": " + dll.get(index)); // print index and data
                                break; // exit selection
                            case 4: // search by value
                                data = inputData(); // init data
                                if (dll.getByValue(data) > -1) { // data found
                                    System.out.println("\nData: " + data); // print data
                                    System.out.println("Data is found at index: " + dll.getByValue(data)); // print index
                                } else { // data not found
                                    System.out.println("Data " + data + " not found"); // print data not found
                                }
                                break; // exit selection
                            default: // if input is wrong
                                System.out.println("Your answer is wrong"); // print answer is wrong
                                break; // exit selection
                        }
                        break; // exit selection
                    case 9: // sorting data
                        System.out.println("Ascending: "); // print "Ascending: "
                        dll.sortAscending(); // print ascending
                        System.out.println("Descending: "); // print "Descending: "
                        dll.sortDescending(); // print descending
                        break;
                    case 10: // exit
                        System.out.println("Good bye!"); // print "Good bye!"
                        backToMenu = false; // init backToMenu 
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
