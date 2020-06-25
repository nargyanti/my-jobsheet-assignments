
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class salah {

    static ArrayList data = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static String wrongInput = "Sorry, the input you entered is invalid, please try again", typeOption = "Type the option: ";
    
    public static void main(String[] args) {
        mainMenu();
    }

    static void mainMenu() {
        System.out.println("\nMain menu");
        System.out.println("1. Create a new goods data\n2. Fill in the goods data\n3. Search goods data\n4. Print stock report\n5. Quit from the program");
        System.out.print(typeOption);
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                //int add = 0;
                String finalResult[][] = inputAgainConfirmation(createFirstRow());
                System.out.println();
                createNewDataAgainOrMainMenu();
                break;
            case 2:
                //System.out.println("YESSSSS BERHASIL: " + brand[0] + " " + brand[1] + " " + brand[2]);
                fillDataAgainOrMainMenu();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                quitProgram();
                break;
            default:
                System.out.println(wrongInput + "\n");
                mainMenu();
                break;
        }
    }  

    static void createNewDataAgainOrMainMenu() {
        System.out.println("\nSelect the option: ");
        System.out.println("1. Back to main menu\n2. Quit from the program");
        System.out.print(typeOption);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                mainMenu();
                break;
            case 2:
                quitProgram();
                break;
            default:
                System.out.println(wrongInput);
                createNewDataAgainOrMainMenu();
                break;
        }
    }

    static void fillDataAgainOrMainMenu() {
        System.out.println("\nSelect the option: ");
        System.out.println("1. Fill goods data again\n2. Back to main menu\n3. Quit from the program");
        System.out.print(typeOption);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                break;
            case 2:
                mainMenu();
                break;
            case 3:
                quitProgram();
                break;
        }
    }

    static void quitProgram() {
        System.out.print("\nAre you sure to quit the program (Y/N)? ");
        String quit = sc.next();
        if (quit.equalsIgnoreCase("Y")) {
            System.out.println("Good Bye!");
        } else if (quit.equalsIgnoreCase("N")) {
            System.out.println("Go to main menu automatically");
            mainMenu();
        } else {
            System.out.println(wrongInput);
            quitProgram();
        }
    }
    
    static String detectTheBrandCode() { //mendeteksi jenis barang dan kode brandnya 
        String item[] = itemTypeInformation();
        System.out.println("\nSelect the item");
        for (int i = 0; i < item.length; i++) {
            System.out.println((i + 1) + ". " + item[i]);
        }
        System.out.print(typeOption);
        int type = sc.nextInt();
        if (type >= 1 && type <= 6) {
            return (item[type - 1]);
        } else {
            System.out.println(wrongInput);
            return detectTheBrandCode();
        }
    }

    static String[] tableTitleInformation() {
        String info[] = {"Code", "Name", "Purchase Price", "Selling Price", "Incoming Goods", "Outgoing Goods", "Damaged Goods", "Total Goods"};
        return info;
    }

    static String[][] createFirstRow() {
        String item = detectTheBrandCode();
        String info[] = tableTitleInformation();
        String create[][] = new String[1][8];
        create[create.length-1][0] = item;
        sc.nextLine();
        for (String[] create1 : create) {
            for (int j = 1; j < create[0].length - 1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                create1[j] = input;
            }
        }
        calculateTheAmountofGoods(create);
        return create;
    }

    static String[][] InputNewDataAgain(String[][] result) {
        String item = detectTheBrandCode();
        String info[] = tableTitleInformation();
        //System.out.println(add);
        String backup[][] = result;
        result = new String[result.length + 1][result[0].length];
        System.arraycopy(backup, 0, result, 0, backup.length);
        result[result.length-1][0] = item;
        sc.nextLine();
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 1; j < result[i].length - 1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                result[i][j] = input;
            }
        }
        calculateTheAmountofGoods(result);
        
        return result;
    }

    static String[][] inputAgainConfirmation(String[][] result) {
        System.out.println("\nYou have successfully entered new goods data!");
        System.out.print("\nDo you want to add new data again? (Y/N): ");
        String input = sc.next();
        if (input.equalsIgnoreCase("Y")) {
            String createAgain[][] = InputNewDataAgain(result);
            return inputAgainConfirmation(createAgain);
        } else if (input.equalsIgnoreCase("N")) {
            System.out.println(Arrays.deepToString(result));
            return result;
        } else {
            System.out.println(wrongInput);
            return inputAgainConfirmation(result);
        }
    }

    static String[][] calculateTheAmountofGoods(String[][] result) {
        int position = result.length-1;
        String goodsString[] = {result[position][4], result[position][5], result[position][6]};
        int goodsAmount[] = new int[goodsString.length];
        for (int i = 0; i < goodsAmount.length; i++) {
            goodsAmount[i] = Integer.parseInt(goodsString[i]);
        }
        int total = goodsAmount[0] - goodsAmount[1] - goodsAmount[2];
        result[position][7] = Integer.toString(total);
        return result;
    }
    
    static String[] itemTypeInformation() {
        String item[] = {"Smartphone", "Earphone", "Casing", "Charger", "Micro SD Card", "Power bank"};
        return item;
    }
    
    static String[][]saveTheData(String[][] result) {
        String saveData[][] = result;
        return saveData;
    }
    
}
