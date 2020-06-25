
import java.util.*;

public class satuPersatu {

    static Scanner sc = new Scanner(System.in);
    static String wrongInput = "Sorry, the input you entered is invalid, please try again", typeOption = "Type the option: ";
    static String array[][] = new String[2][8];

    public static void main(String[] args) {
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Masukkan nilai: ");
                String input = sc.nextLine();
                array[i][j] = input;
            }
        } // wis
        String backup[][] = array;
        array = new String[array.length + 1][array[0].length];
        System.arraycopy(backup, 0, array, 0, backup.length);
        sc.nextLine(); //wis
        for (int i = backup.length; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Input the: ");
                String input = sc.nextLine();
                array[i][j] = input;
            }
        }
        System.out.print("Input the: ");
        int add = sc.nextInt();
        for (int i = add; i < add + 1; i++) {
            for (int j = 4; j < array[i].length - 1; j++) {
                array[i][j] = "4";
            }
        }*/
        //System.out.println(Arrays.deepToString(array));
        //--------------------
        int add = 0;
        String finalResult[][] = inputAgainConfirmation(createFirstRow(add), add);
        System.out.println(Arrays.deepToString(finalResult));
        //-------------------------------------------------
        System.out.print("Input the angka: ");
        int ganti = sc.nextInt();
        sc.nextLine();
        System.out.println(Arrays.deepToString(modify(finalResult, ganti)));
        
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

    static String[][] createFirstRow(int add) {
        String item = detectTheBrandCode();
        String info[] = tableTitleInformation();
        String create[][] = new String[1][8];
        create[add][0] = item;
        sc.nextLine();
        for (String[] create1 : create) {
            for (int j = 1; j < create[0].length - 1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                create1[j] = input;
            }
        }
        calculateTheAmountofGoods(create, add);
        return create;
    }

    static String[][] InputNewDataAgain(String[][] result, int add) {
        String item = detectTheBrandCode();
        String info[] = tableTitleInformation();
        //System.out.println(add);
        String backup[][] = result;
        result = new String[result.length + 1][result[0].length];
        System.arraycopy(backup, 0, result, 0, backup.length);
        result[add][0] = item;
        sc.nextLine();
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 1; j < result[i].length - 1; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                result[i][j] = input;
            }
        }
        calculateTheAmountofGoods(result, add);
        
        return result;
    }

    static String[][] inputAgainConfirmation(String[][] result, int add) {
        System.out.println("\nYou have successfully entered new goods data!");
        System.out.print("\nDo you want to add new data again? (Y/N): ");
        String input = sc.next();
        if (input.equalsIgnoreCase("Y")) {
            String createAgain[][] = InputNewDataAgain(result, ++add);
            return inputAgainConfirmation(createAgain, add);
        } else if (input.equalsIgnoreCase("N")) {
            return result;
        } else {
            System.out.println(wrongInput);
            return inputAgainConfirmation(result, add);
        }
    }

    static String[][] calculateTheAmountofGoods(String[][] result, int add) {
        String goodsString[] = {result[add][4], result[add][5], result[add][6]};
        int goodsAmount[] = new int[goodsString.length];
        for (int i = 0; i < goodsAmount.length; i++) {
            goodsAmount[i] = Integer.parseInt(goodsString[i]);
        }
        int total = goodsAmount[0] - goodsAmount[1] - goodsAmount[2];
        result[add][7] = Integer.toString(total);
        return result;
    }
    
    static String[] itemTypeInformation() {
        String item[] = {"Smartphone", "Earphone", "Casing", "Charger", "Micro SD Card", "Power bank"};
        return item;
    }
    
    static String[][] modify(String[][] finalres, int ganti) {
        for (int i = ganti; i < ganti + 1; i++) {
            for (int j = 4; j < finalres[i].length - 1; j++) {
                System.out.println("Input the nilai: ");
                String input = sc.nextLine();
                 finalres[i][j] = input;
                System.out.println(Arrays.toString(finalres[i]));
            }
        }
        //System.out.println(Arrays.deepToString(finalres));
        calculateTheAmountofGoods(finalres, ganti);
        return finalres;
    }
}
