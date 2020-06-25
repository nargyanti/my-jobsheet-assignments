
import java.util.Arrays;
import java.util.Scanner;

public class simpanDataYOKBISAYOK {

    static Scanner sc = new Scanner(System.in);

    //static String buat[][] = new String[1][8];
    public static void main(String[] args) {
        int add = 0;
        String finalResult[][] = new String[10][10];  // declare finalResult variable
        System.out.println("1. Create a new goods data\n2. Print the data");
        System.out.print("Type the option by typing sc: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                finalResult = inputAgainConfirmation(createFirstRow(add), add);
                String[][] y = finalResult;// Assign value
                break;
            case 2: 
                System.out.println(Arrays.deepToString(y));
                break;
        }
    }
    static String[] information() {
        String info[] = {"Code", "Name", "Purchase Price", "Selling Price", "Incoming Goods", "Outgoing Goods", "Damaged Goods", "Total Goods"};
        return info;
    }

    static String[][] createFirstRow(int add) {
        String info[] = information();
        String create[][] = new String[1][8];
        sc.nextLine();
        for (String[] create1 : create) {
            for (int j = 0; j < create[0].length; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                create1[j] = input;
            }
        }
        return create;
    }

    static String[][] InputNewDataAgain(String[][] result, int add) {
        sc.nextLine();
        String info[] = information();
        String backup[][] = result;
        result = new String[result.length + 1][result[0].length];
        System.arraycopy(backup, 0, result, 0, backup.length);
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                result[i][j] = input;
            }
        }
        return result;
    }

    static String[][] inputAgainConfirmation(String[][] result, int add) {
        System.out.print("Create again? 1 = yes, 0 = no: ");
        int in = sc.nextInt();
        if (in == 1) {
            String createAgain[][] = InputNewDataAgain(result, ++add);
            return inputAgainConfirmation(createAgain, add);
        } else {
            return result;
        }

    }
}


