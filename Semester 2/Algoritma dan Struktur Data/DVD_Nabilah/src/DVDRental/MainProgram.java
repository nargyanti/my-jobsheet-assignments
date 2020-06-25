package DVDRental;

import java.util.Scanner;

public class MainProgram {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("-------------------");
        System.out.println("Main menu");
        System.out.println("1. DVD Entered");
        System.out.println("2. DVD Out");
        System.out.println("3. Broken DVD");
        System.out.println("4. Show All Data");
        System.out.println("5. DVD Search");
        System.out.println("6. Exit");
        System.out.println("-------------------");
        System.out.print(">> ");
        int answer = sc.nextInt();
        System.out.println("-------------------");
        return answer;
    }

    public static int searchMenu() {
        System.out.println("1. Search based on DVD code");
        System.out.println("2. Search based on DVD title and distributor");
        int answer = sc.nextInt();
        return answer;
    }

    public static int inputCode() {
        System.out.print("DVD Code: ");
        int code = sc.nextInt();
        return code;
    }

    public static String inputTitle() {
        System.out.print("DVD title: ");
        sc.nextLine();
        String title = sc.nextLine();
        return title;
    }

    public static String inputDistributor() {
        System.out.print("DVD Distributor: ");
        String distributor = sc.nextLine();
        return distributor;
    }

    public static int inputStock() {
        System.out.print("DVD stock: ");
        int stock = sc.nextInt();
        return stock;
    }

    public static int inputBroken() {
        System.out.print("DVD broken: ");
        int broken = sc.nextInt();
        return broken;
    }

    public static int inputIndex() {
        System.out.print("Index: ");
        int index = sc.nextInt();
        return index;
    }

    public static void invalidAnswer() {
        System.out.println("Your answer is invalid");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("===== NARGYANTI DVD RENTAL =====");

        boolean isBackToMenu = true;
        while (isBackToMenu) {
            try {
                int answer = menu();
                switch (answer) {
                    case 1:
                        int code = inputCode();
                        String title = inputTitle();
                        String distributor = inputDistributor();
                        int stock = inputStock();
                        dll.DVDEntered(code, title, distributor, stock);
                        break;
                    case 2:
                        dll.print();
                        int index = inputIndex();
                        stock = inputStock();
                        dll.DVDOut(index, stock);
                        break;
                    case 3:
                        code = inputCode();
                        int broken = inputBroken();
                        dll.addBroken(code, broken);
                        break;
                    case 4:
                        dll.print();
                        break;
                    case 5:
                        answer = searchMenu();
                        switch (answer) {
                            case 1:
                                code = inputCode();
                                Node DVD = dll.getByCode(code);
                                DVD.print();
                                break;
                            case 2:
                                title = inputTitle();
                                distributor = inputDistributor();
                                DVD = dll.getByTitleAndDistributor(title, distributor);
                                DVD.print();
                                break;
                            default:
                                invalidAnswer();
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Good bye!");
                        isBackToMenu = false;
                        break;
                    case 7:
                        invalidAnswer();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
