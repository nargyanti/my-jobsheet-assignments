package week11.assignments;

import java.util.Scanner;

public class StudentLinkedListMain {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        StudentLinkedList data = new StudentLinkedList(); // create object data
        boolean backToMenu = true; // declare and init backToMenu
        System.out.println("============ STUDENT LINKED LIST ============"); // print title
        while (backToMenu) { // iteration for back to menu
            try { // try
                System.out.println("Main Menu:"); // print text
                System.out.println("1. Add\n2. Delete\n3. Search\n4. Exit"); // print meny
                System.out.print("Type your answer: "); // print command
                int answer = sc.nextInt(); // input answer from keyboard
                switch (answer) { // selection to go to menu
                    case 1: // add data
                        System.out.println("\nAdd menu:"); // print text
                        System.out.println("1. Add first index"); // add first index
                        System.out.println("2. Add by index"); // add by index
                        System.out.println("3. Add last index"); // add last index
                        System.out.print("Type your answer: "); // print command
                        answer = sc.nextInt(); // input answer from keyboard
                        switch (answer) { // selection to go to menu
                            case 1: // add first index
                                System.out.print("NIM: "); // print command                           
                                String NIM = sc.next(); // input NIM from keyboard
                                System.out.print("Name: "); // print command
                                sc.nextLine(); // enter 1 line
                                String name = sc.nextLine(); // input name from keyboard
                                System.out.print("Address: "); // print command
                                String address = sc.nextLine(); // input address from keyboard
                                data.addFirst(NIM, name, address); // add first data
                                data.print(); // print data                    
                                break; // end switch 
                            case 2: // add by index
                                System.out.print("Enter the index: "); // print command
                                int index = sc.nextInt(); // input index from keyboard
                                System.out.print("NIM: "); // print command                     
                                NIM = sc.next(); // input NIM from keyboard 
                                System.out.print("Name: "); // print command
                                sc.nextLine(); // enter 1 line
                                name = sc.nextLine(); // input name from keyboard
                                System.out.print("Address: "); // print command                 
                                address = sc.nextLine(); // input address from keyboard                   
                                data.addByIndex(NIM, name, address, index); // add by index
                                data.print(); // print data                           
                                break; // end switch 
                            case 3: // add last index
                                System.out.print("NIM: "); // print command                         
                                NIM = sc.next(); // input NIM from keyboard
                                System.out.print("Name: "); // print command
                                sc.nextLine(); // enter 1 line
                                name = sc.nextLine(); // input name from keyboard
                                System.out.print("Address: "); // print command
                                address = sc.nextLine(); // input address from keyboard
                                data.addLast(NIM, name, address); // add last data
                                data.print(); // print data                             
                                break; // end switch 
                            default: // if answer is not 1 until 3
                                System.out.println("Your answer is incorrect\n"); // print text
                                break; // end switch 
                        }
                        break; // end switch 
                    case 2: // delete
                        System.out.println("\nDelete menu:"); // print text
                        System.out.println("1. Delete by index"); // delete by index
                        System.out.println("2. Delete by NIM"); // delete by NIM
                        System.out.println("3. Clear"); // clear linked list
                        System.out.print("Type your answer: "); // print command
                        answer = sc.nextInt(); // input answer from keyboard
                        switch (answer) { // selection to go to menu
                            case 1: // delete by index
                                System.out.print("Enter the index: "); // print command
                                int index = sc.nextInt(); // input index from keyboard
                                data.removeByIndex(index); // remove by index
                                data.print(); // print data
                                break; // end switch 
                            case 2: // delete by NIM
                                System.out.print("Enter NIM: "); // print command
                                String NIM = sc.next(); // input NIM from keyboard
                                data.removeByNIM(NIM); // remove by NIM
                                data.print(); // print data
                                break; // end switch 
                            case 3: // clear  
                                data.clear(); // clear linked list
                                data.print(); // print data
                                break; // end switch 
                            default: // if answer is not 1 until 3
                                System.out.println("Your answer is incorrect\n"); // print text
                                break; // end switch 
                        }
                        break; // end switch 
                    case 3: // search data
                        System.out.println("\nSearch menu:"); // print text
                        System.out.println("1. Search by index"); // search by index
                        System.out.println("2. Search by NIM"); // search by NIM
                        System.out.print("Type your answer: "); // print command
                        answer = sc.nextInt(); // input answer from keyboard
                        switch (answer) { // selection to go to menu
                            case 1: // search by index
                                System.out.print("Enter the index: "); // print command
                                int index = sc.nextInt(); // input index from keyboard
                                data.searchByIndex(index); // search by index
                                break; // end switch 
                            case 2: // search by NIM
                                System.out.print("Enter NIM: "); // print command
                                String NIM = sc.next(); // input NIM from keyboard
                                data.searchByNIM(NIM); // search by NIM
                                break; // end switch 
                            default: // if answer is not 1 or 2
                                System.out.println("Your answer is incorrect\n"); // print text
                                break; // end switch 
                        }
                        break; // end switch 
                    case 4: // exit 
                        System.out.println("Good bye!"); // print good bye
                        backToMenu = false; // backToMenu = false
                        break; // end switch 
                    default: // if answer is not 1 until 4
                        System.out.println("Your answer is incorrect\n"); // print text
                        break; // end switch 
                }
            } catch (Exception e) { // catch error
                System.out.println(e.getMessage()); // get error
            }
        }
    }

}
