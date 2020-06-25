package week02;

public class Item {

    String nameItem, typeItem;
    int stock, unitPrice;

    Item() {

    }

    Item(String nm, String tp_item, int st, int un_price) {
        nameItem = nm;
        typeItem = tp_item;
        stock = st;
        unitPrice = un_price;
    }

    void printItem() {
        System.out.println("Name = " + nameItem);
        System.out.println("Type = " + typeItem);
        System.out.println("Stock = " + stock);
        System.out.println("The unit price = " + unitPrice);
    }

    void addStock(int n) {
        stock = stock + n;
    }

    void reduceStock(int n) {
        if (stock > 0) {
            stock = stock - n;
        } else {
            System.out.println("The item you have entered is less than zero");
        }

    }

    int totalPrice(int total) {
        return total * unitPrice;
    }

}
