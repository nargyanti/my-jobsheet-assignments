package week7;

public class Searching {

    public int[] data;
    public int totData;

    public Searching(int[] Data, int totalData) {
        totData = totalData;
        data = new int[totData];
        for (int i = 0; i < totData; i++) {
            data[i] = Data[i];
        }
    }

    public int FindSeqSearch(int search) {
        int position = -1;
        for (int j = 0; j < totData; j++) {
            if (data[j] == search) {
                position = j;
                break;
            }
        }
        return position;
    }

    public void printData() {
        for (int i = 0; i < totData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void printPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " found at index " + pos);
        } else {
            System.out.println("data " + x + " not found");
        }
    }
    
    public int FindBinarySearch(int search, int left, int right) {
        int mid;
        mergeSort(data);
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == data[mid]) {
                return mid;
            } else if (data[mid] > search) {
                return FindBinarySearch(search, left, mid - 1);
            } else {
                return FindBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
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

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }
     
}
