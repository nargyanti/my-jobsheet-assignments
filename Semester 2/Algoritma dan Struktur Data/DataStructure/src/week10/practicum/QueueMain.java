package week10;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Option menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek front");
        System.out.println("5. Peek rear");
        System.out.println("6. Peek position");
        System.out.println("7. Peek at");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int select;
        do {
            menu();
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter new data: ");
                    int dataEnter = sc.nextInt();
                    Q.enqueue(dataEnter);
                    break;
                case 2:
                    int dataRetrieve = Q.dequeue();
                    if (dataRetrieve != 0) {
                        System.out.println("Data retrieved: " + dataRetrieve);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peekFront();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    Q.peekPosition(data);
                    break;
                case 7:
                    System.out.print("Enter queue position: ");
                    int position = sc.nextInt();
                    Q.peekAt(position);
                    break;
            }
        } while (select >= 1 && select <= 7);
    }

}
