public class Task3 {
    static void fillArray (int arr1[]) {
        int fillNumber = 0;
        System.out.print(" ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("  " + i + "   ");
        }
        System.out.print("\n|  ");
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                fillNumber++;
                System.out.print(fillNumber + "  |");
            } else {
                System.out.print("     |  ");
            }
        }
    }
    public static void main(String[] args) {
        int array[] = new int[11];
        System.out.println("Empty array: ");
        System.out.print(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + i + "   ");
        }
        System.out.print("\n|   ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  |   ");
        }
        System.out.println("\n\nThe array elements after filled in: ");
        fillArray(array);
        System.out.println();   
    }
}