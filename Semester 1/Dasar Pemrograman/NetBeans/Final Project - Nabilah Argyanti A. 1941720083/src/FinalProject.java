
import java.util.Scanner;

public class FinalProject {

    static Scanner sc = new Scanner(System.in);
    static String wrongInput = "Sorry, the input you entered is invalid, please try again", typeOption = "Type the option: ";

    public static void main(String[] args) {
        String finalResult[][] = createFirstRow();
        System.out.println("============================================================================================");
        System.out.println("                                       MAIN MENU                                            ");
        System.out.println("============================================================================================");
        while (true) {
            System.out.println("1. Create a new goods data\n2. Input the stock of goods\n3. Search goods data\n4. Print stock report\n5. Exit from the program");
            System.out.print(typeOption);
            int menu = sc.nextInt();
            if (menu >= 1 && menu <= 5) {
                while (true) {
                    switch (menu) {
                        case 1:
                            System.out.println("============================================================================================");
                            System.out.println("                                 CREATE A NEW GOODS DATA                                    ");
                            System.out.println("============================================================================================");
                            String backup[][] = finalResult;
                            finalResult = new String[(finalResult.length) + 1][finalResult[0].length];
                            finalResult = InputNewDataAgain(finalResult, backup);
                            break;
                        case 2:
                            if (finalResult.length == 1) {
                                System.out.println("Sorry, you can't input the stock because you haven't entered any item data");
                                break;
                            } else {
                                System.out.println("============================================================================================");
                                System.out.println("                                INPUT THE STOCK OF GOODS                                    ");
                                System.out.println("============================================================================================");
                                for (int i = 1; i < finalResult.length; i++) {
                                    System.out.println(i + ". " + finalResult[i][1]);
                                }
                                System.out.println("============================================================================================\n");
                                System.out.print(typeOption);
                                int edit = sc.nextInt();
                                if (edit > finalResult.length) {
                                    System.out.println("Sorry, you can't input the stock because the goods data doesn't exist ");
                                    break;
                                } else {
                                finalResult = modify(finalResult, edit);
                                break;
                                }
                            }
                        case 3:
                            if (finalResult.length == 1) {
                                System.out.println("Sorry, you can't print the stock report because you haven't entered any item data");
                                break;
                            } else {
                                System.out.println("============================================================================================");
                                System.out.println("                                     SEARCH GOODS DATA                                      ");
                                System.out.println("============================================================================================");
                                sc.nextLine();
                                System.out.print("Enter the brand of the item: ");
                                String brand = sc.nextLine();
                                searchData(finalResult, brand);
                                break;
                            }
                        case 4:
                            if (finalResult.length == 1) {
                                System.out.println("Sorry, you can't print the stock report because you haven't entered any item data");
                                break;
                            } else {
                                System.out.println("============================================================================================");
                                System.out.println("                                    STOCK ITEMS REPORT                                      ");
                                System.out.println("============================================================================================");
                                System.out.println("No\tItem Type\t\tName\t\t\tPurchase Price (Rp)\tSelling Price (Rp)\tIncoming Goods\t\tOutgoing Goods\t\tDamaged Goods\t\tTotal Goods");
                                for (int j = 1; j < finalResult.length; j++) {
                                    System.out.print(j + "\t" + finalResult[j][0] + "\t\t" + finalResult[j][1] + "\t\t" + finalResult[j][2] + "\t\t" + finalResult[j][3] + "\t\t");
                                    System.out.println(finalResult[j][4] + "\t\t\t" + finalResult[j][5] + "\t\t\t" + finalResult[j][6] + "\t\t\t" + finalResult[j][7]);
                                }
                                System.out.println("============================================================================================");
                                break;
                            }
                        case 5:
                            System.out.print("\nAre you sure to exit the program (Y/N)? ");
                            String quit = sc.next();
                            if (quit.equalsIgnoreCase("Y")) {
                                System.out.println("Good Bye!");
                                System.exit(0);
                            } else {
                                break;
                            }
                        default:
                            System.out.println(wrongInput);
                    }
                    System.out.print("Do you want to do it again (Y/N)? ");
                    String input = sc.next();
                    if (input.equalsIgnoreCase("Y")) {
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println(wrongInput);
            }
            System.out.print("1. Go to main menu\n2. Exit the program\n");
            System.out.print(typeOption);
            int input = sc.nextInt();
            if (input == 2) {
                System.out.print("\nAre you sure to exit the program (Y/N)? ");
                String quit = sc.next();
                if (quit.equalsIgnoreCase("Y")) {
                    System.out.println("Good Bye!");
                    System.exit(0);
                } else {
                    break;
                }
            } else {
                System.out.println("Back to main menu\n");
            }
        }
    }

    static String[] tableTitleInformation() {
        String info[] = {"Item Type", "Name", "Purchase Price (Rp)", "Selling Price (Rp)", "Incoming Goods", "Outgoing Goods", "Damaged Goods", "Total Goods"};
        return info;
    }

    static String[] itemTypeInformation() {
        String item[] = {"Smartphone", "Earphone", "Casing", "Charger", "Micro SD Card", "Power bank"};
        return item;
    }

    static String[][] createFirstRow() {
        String info[] = tableTitleInformation();
        String create[][] = new String[1][8];
        for (String[] create1 : create) {
            System.arraycopy(info, 0, create1, 0, create[0].length);
        }
        return create;
    }

    static String detectTheItemType() {
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
            return detectTheItemType();
        }
    }

    static String[][] InputNewDataAgain(String[][] result, String backup[][]) {
        String item = detectTheItemType();
        String info[] = tableTitleInformation();
        System.arraycopy(backup, 0, result, 0, backup.length);
        result[result.length - 1][0] = item;
        sc.nextLine();
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print("Input the " + info[j] + ": ");
                String input = sc.nextLine();
                result[i][j] = input;
            }
        }
        for (int i = backup.length; i < result.length; i++) {
            for (int j = 4; j < result[i].length - 1; j++) {
                result[i][j] = "0";
            }
        }
        return result;
    }

    static String[][] calculateTheAmountofGoods(String[][] result) {
        int position = result.length - 1;
        String goodsString[] = {result[position][4], result[position][5], result[position][6]};
        int goodsAmount[] = new int[goodsString.length];
        for (int i = 0; i < goodsAmount.length; i++) {
            goodsAmount[i] = Integer.parseInt(goodsString[i]);
        }
        int total = goodsAmount[0] - goodsAmount[1];
        result[position][7] = Integer.toString(total);
        return result;
    }

    static String[][] modify(String[][] result, int edit) { // modif 1/2/3
        sc.nextLine();
        int position = edit;
        String goodsString[] = {result[position][4], result[position][5], result[position][6]};
        int goodsAmount[] = new int[goodsString.length];
        for (int i = 0; i < goodsAmount.length; i++) {
            goodsAmount[i] = Integer.parseInt(goodsString[i]);
        }
        int total = goodsAmount[0] - goodsAmount[1];
        System.out.println("1. Add the goods stock\n2. Take out the goods stock\n3. Add the damaged goods");
        System.out.print(typeOption);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.print("Input the amount of goods: ");
                int amount = sc.nextInt();
                goodsAmount[0] = amount + goodsAmount[0];
                break;
            case 2:
                System.out.print("Input the amount of goods: ");
                amount = sc.nextInt();
                int check = total - goodsAmount[2];
                if (amount > check) {
                    System.out.println("You can't take the goods because you have " + total + " good items and " + goodsAmount[2] + " damaged item");
                } else {
                    goodsAmount[1] = amount + goodsAmount[1];
                }
                break;
            default:
                System.out.print("Input the amount of goods: ");
                amount = sc.nextInt();
                if (amount > total) {
                    System.out.println("The damaged goods is larger than the total of goods");
                } else {
                    goodsAmount[2] = amount + goodsAmount[2];
                }
                break;
        }
        total = goodsAmount[0] - goodsAmount[1];
        for (int i = 0; i < goodsAmount.length; i++) {
            result[position][i + 4] = Integer.toString(goodsAmount[i]);
        }
        result[position][7] = Integer.toString(total);
        return result;
    }

    static void searchData(String[][] result, String brand) {
        for (int i = 1; i < result.length; i++) {
            String search = result[i][1];
            if (brand.equalsIgnoreCase(search)) {
                int position = i;
                String print[] = new String[8];
                System.arraycopy(result[position], 0, print, 0, result[0].length);
                System.out.println("============================================================================================");
                System.out.println("                                       SEARCH RESULT                                        ");
                System.out.println("============================================================================================");
                System.out.println("Item Type\t\t: " + print[0]);
                System.out.println("Name\t\t\t: " + print[1]);
                System.out.println("Purchase Price (Rp)\t: " + print[2]);
                System.out.println("Selling Price (Rp)\t: " + print[3]);
                System.out.println("Incoming Goods\t\t: " + print[4]);
                System.out.println("Outgoing Goods\t\t: " + print[5]);
                System.out.println("Damaged Goods\t\t: " + print[6]);
                System.out.println("Total Goods\t\t: " + print[0]);
            } else {
                System.out.println("The item you are looking for does not exist");
            }
        }
    }

}
