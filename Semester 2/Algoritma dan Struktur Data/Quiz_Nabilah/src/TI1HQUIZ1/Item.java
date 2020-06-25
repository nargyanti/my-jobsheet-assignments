package TI1HQUIZ1;

public class Item {

    public String name;
    public int price, stock;

    public void printItemData() {
        System.out.println("Item name: " + name);
        System.out.println("Price: Rp " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Status: " + checkStock());
    }

    public String checkStock() {
        if (stock > 10) {
            return "OK stock";
        } else {
            return "Stock limited!";
        }
    }

    public int calculateTotalStock(int stock[], int l, int r) {
        if (l == r) {
            return stock[l];
        } else if (l < r) {
            int mid = (l + r) / 2 ;
            int left = calculateTotalStock(stock, l, mid - 1);
            int right = calculateTotalStock(stock, mid + 1, r);
            return left + right + stock[mid];
        }
        return 0;
    }

    public int calculateItemPrice(int stock, int price) {
        return stock * price;
    }

    public int calculateTotalPrice(int price[], int l, int r) {
        if (l == r) {
            return price[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            int left = calculateTotalPrice(price, l, mid - 1);
            int right = calculateTotalPrice(price, mid + 1, r);
            return left + right + price[mid];
        }
        return 0;
    }

    

}
