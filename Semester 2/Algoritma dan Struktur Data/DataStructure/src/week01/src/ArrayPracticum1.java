import java.util.Scanner;
public class ArrayPracticum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input the value of index " + i + ": ");
            array[i] = sc.nextInt();
        }
        int oddAmount = 0, evenAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddAmount++;
            } else {
                evenAmount++;
            }
        }
        int oddArray[] = new int[oddAmount];
        int evenArray[] = new int[evenAmount];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddArray[oddIndex] = array[i];
                oddIndex++;
            } else {
                evenArray[evenIndex] = array[i];
                evenIndex++;
            }
        }
        System.out.print("\nThe members of odd number: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.print("\nThe members of even number: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}

