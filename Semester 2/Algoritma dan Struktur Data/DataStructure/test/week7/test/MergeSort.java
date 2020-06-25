package week7.test;

public class MergeSort {

    public static int brp = 1, brp1 = 1, brp2 = 1;

    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting with merge sort");
        System.out.println("Data array:");
        printArray(data);
        System.out.println("");
        mergeSort(data);
        System.out.println("After sorting...");
        printArray(data);
    }

    public static void mergeSort(int[] data) { // cuma manggil doang, biar ringkas
        sort(data, 0, data.length - 1);
    }

    public static void merge(int data[], int left, int middle, int right) { // buat ganti nilai data
        int[] temp = new int[data.length]; // temp buat nyimpen nilai data awal
        for (int i = left; i <= right; i++) { // dicopy
            temp[i] = data[i];
        }
        int a = left; // buat temp array yg kiri
        int b = middle + 1; // buat temp array yg kanan
        int c = left; // arraynya di posisi ke brp yg mau dipindah

        while (a <= middle && b <= right) { // buat bandingin apakah perbandingan sesuai kriteria, yaitu a itu sebelum/pas middle, b sebelum / pas right
            System.out.println("Masuk while : a = " + a + " b = " + b + " c = " + c);
            if (temp[a] <= temp[b]) { // kalau temp[a] lebi kecil dr temp[b]
                data[c] = temp[a]; // data diganti temp[a]
                a++; 
            } else {
                data[c] = temp[b]; // data diganti temp[b]
                b++;
            }
            System.out.println("data[c] = " + data[c]);
            c++; // c naik buat isi array
        }
        int s = middle - a; // s ini buat ngisi array klo misal yg menang tu yg kanan, s ini buat ngisi brp kali ngisinya?
        // misal 70 <= 20, yg menang 20. yaudah s = 4 - 4 = 0
        System.out.println("s = " + s);
        for (int i = 0; i <= s; i++) { // buat ngisi klo yg menang kanan
            System.out.println("Ngisi yg tersisa: \n[c + i] = " + (c + i) + " [a + i] = " + (a + i));
            data[c + i] = temp[a + i]; // karena c increase, maka c nya naik, otomatis ngisi sebelahnya. a ini krn ga naik, jd diisi pake a
            System.out.println("data[c + i] = " + data[c + i]);
        }
    }

    public static void sort(int data[], int left, int right) { // proses divide sa
        //System.out.println("Masuk sort awal ke " + brp);
        //brp++;
        if (left < right) {
            int middle = (left + right) / 2;
            //System.out.println("Mau sort lagi yg kiri : " + brp1);
            //brp1++;
            sort(data, left, middle);
            //System.out.println("Mau sort lagi yg kanan : " + brp2);
            //brp2++;
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
            System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5] + " " + data[6] + " " + data[7] + " ");
        }
    }

    public static void printArray(int arr[]) { // buat print
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
