package DoubleLinkedLIst;

public class NitipPraktikumLama {

    public static void main(String[] args) {
        try {
            DoubleLinkedLists dll = new DoubleLinkedLists();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.addFirst(3);
            dll.addFirst(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.clear();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.addLast(50);
            dll.addLast(40);
            dll.addLast(10);
            dll.addLast(20);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.removeLast();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.remove(1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.clear();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("============================");
            System.out.println("The initial data on the linked lists is: " + dll.getFirst());
            System.out.println("The final data on the linked lists is: " + dll.getLast());
            System.out.println("The 1st index on the linked lists is: " + dll.get(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
