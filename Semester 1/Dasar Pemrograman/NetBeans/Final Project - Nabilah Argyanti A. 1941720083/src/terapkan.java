
import java.util.Arrays;
import java.util.Scanner;

public class terapkan {

    static Scanner number = new Scanner(System.in);

    public static void main(String[] args) {
        int add = 0;
        createFirstRow(add);
        String finalResult[][] = inputAgainConfirmation(createFirstRow(add), add);
        System.out.println(Arrays.deepToString(finalResult));
    }

    static String[] information() {
        String info[] = {"Code", "Name", "Purchase Price", "Selling Price", "Incoming Goods", "Outgoing Goods", "Damaged Goods", "Total Goods"};
        return info;
    }
    
    static String[][] createFirstRow(int add) {
        String info[] = information();
        String create[][] = new String[1][8];
        create[add][0] = info[0];
        for (String[] create1 : create) {
            for (int j = 1; j < create[0].length-1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = number.nextLine();
                create1[j] = input;
            }
        }
        calculate(create, add);
        return create;
    }

    static String[][] InputNewDataAgain(String[][] result, int add) {
        number.nextLine();
        String info[] = information();
        //System.out.println(add);
        String backup[][] = result;
        result = new String[result.length + 1][result[0].length]; 
        System.arraycopy(backup, 0, result, 0, backup.length);
        result[add][0] = info[0];
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 1; j < result[i].length-1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = number.nextLine();
                result[i][j] = input;
            }
        }
        calculate(result, add);
        return result;
    }

    static String[][] inputAgainConfirmation(String[][] result, int add) {
        System.out.print("Y/N: ");
        int in = number.nextInt();
        if (in == 1) {
            String createAgain[][] = InputNewDataAgain(result, ++add);
            return inputAgainConfirmation(createAgain, add);
        } else {
            return result;
        }

    }

    static String[][] calculate(String[][] result, int add) {
        String goodsString[] = {result[add][4],result[add][5], result[add][6]};
        int goodsAmount[] = new int [goodsString.length];
        for (int i = 0; i < goodsAmount.length; i++) {
            goodsAmount[i] = Integer.parseInt(goodsString[i]);
        }
        int total = goodsAmount[0] - goodsAmount[1] - goodsAmount[2];
        result[add][7]= Integer.toString(total);
        return result;
    }
}
