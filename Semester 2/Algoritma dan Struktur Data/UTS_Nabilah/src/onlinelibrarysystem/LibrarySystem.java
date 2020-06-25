package onlinelibrarysystem;

public class LibrarySystem {

    public int totalData;
    Book[] book;

    public LibrarySystem(int totData) {
        totData = totalData;
    }

    public void inputBookData(Book m) {
        if (totalData == 1) {
            book = new Book[totalData];
            book[totalData - 1] = m;
        } else {
            Book backup[] = book;
            book = new Book[totalData];
            for (int i = 0; i < backup.length; i++) {
                book[i] = backup[i];
            }
            book[totalData - 1] = m;
        }
    }

    public void printBookData() {
        sortBookData(book);
        for (int i = 0; i < book.length; i++) {
            String status;
            if (book[i].stock > 0) {
                status = "Available";
            } else {
                status = "Not available";
            }
            System.out.println("Book index [" + i + "]");
            System.out.println("Name: " + book[i].bookName);
            System.out.println("ISBN: " + book[i].ISBN);
            System.out.println("Stock: " + book[i].stock);
            System.out.println("Status: " + status);
        }
    }

    public int searchingBookData(int search, int left, int right) {
        int mid;
        sortBookData(book);
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == book[mid].ISBN) {
                return mid;
            } else if (book[mid].ISBN > search) {
                return searchingBookData(search, left, mid - 1);
            } else {
                return searchingBookData(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void printPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Book " + x + " found at index " + pos);
            book[pos].print();
        } else {
            System.out.println("Book " + x + " not found");
        }
    }
    
    public void sortBookData(Book[] book) {
        sort(book, 0, book.length - 1);
    }

    public void merge(Book data[], int left, int middle, int right) {
        Book[] temp = new Book[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a].ISBN <= temp[b].ISBN) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(Book data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void borrowBooks(int index, int amount) {
        if (book[index].stock > 0 && book[index].stock - amount > 0) {
            book[index].stock -= amount;
        } else {
            System.out.println("You can't borrow the book because the book stock is less than the amount of book(s) you borrowed");
        }
    }

    public void returnBook(int index, int amount) {
        book[index].stock += amount;
    }

}
