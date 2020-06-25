package week02;

public class ItemMain {

    public static void main(String[] args) {
        Item b1 = new Item();
        b1.nameItem = "Laptop Asus";
        b1.typeItem = "Core i7";
        b1.unitPrice = 5000000;
        b1.stock = 10;
        b1.addStock(1);
        b1.reduceStock(3);
        b1.printItem();
        int price = b1.totalPrice(4);
        System.out.println("Price for 4 laptop = " + price);

        Item b2 = new Item("Laptop Toshiba", "Core i5", 25, 7000000);
        b2.printItem();
        
        Item b3 = new Item("Laptop Acer", "Core i7", 40, 13000000);
        b3.printItem();
        
    }

}
