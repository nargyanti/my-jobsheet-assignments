package week7.assignments;

public class Assignment3 {

    public int array[]; // declare array[]
    public int totalData, maxAmount = 0; // declare totalData and maxAmount

    public Assignment3(int arr[], int totData) { // constructor
        totalData = totData; // initialize totalData
        array = new int[totalData]; // instantiate array
        for (int i = 0; i < totalData; i++) { // iteration to copy array
            array[i] = arr[i]; // copy array
        }
    }

    void printArray() { // method to print array 
        for (int i = 0; i < totalData; i++) { // iteration to change index
            System.out.print(array[i] + " "); // print array value
        }
        System.out.println(""); // print enter
    }

    void mergeSort() { // method to call sort
        sort(array, 0, array.length - 1); // call sort
    }

    void merge(int data[], int left, int middle, int right) { // method to merge array 
        int[] temp = new int[data.length]; // instantiate temp[]
        for (int i = left; i <= right; i++) { // iteration to copy data[] to temp[]
            temp[i] = data[i]; // copy array to temp[]
        }
        int a = left; // declare a for index in left
        int b = middle + 1; // declare b for index in right
        int c = left; // declare c for index data

        while (a <= middle && b <= right) { // iteration to check a <= middle and b <= right
            if (temp[a] <= temp[b]) { // if value of temp[a] <= temp[b]
                data[c] = temp[a]; // replace data[c] with temp[a]
                a++; // a increases
            } else { // if temp[b] is smaller than temp[a]
                data[c] = temp[b]; // replace data[c] with temp[b]
                b++; // b increases
            }
            c++; // c increases
        }
        int s = middle - a; // declare and initialize s
        for (int i = 0; i <= s; i++) { // iteration to fill leftover array
            data[c + i] = temp[a + i]; // fill data[c + i] with temp[a + i]
        }
    }

    void sort(int data[], int left, int right) { // method to sort the value
        if (left < right) { // if left < right
            int middle = (left + right) / 2; // declare and initialize middle
            sort(data, left, middle); // call method sort for divide in left side
            sort(data, middle + 1, right); // call method sort for divide in right side
            merge(data, left, middle, right); // merge the data
        }
    }

    void printPosition(int max, int left, int right) { // print position of data with binary search
        int mid; // declare mid
        while (right >= left) { // do iteration while right >= left
            mid = (left + right) / 2; // initialize mid
            if (array[mid] == max) { // if array[mid] is same with max value
                maxAmount++; // max amount increases
                System.out.print("[" + mid + "] "); // print position
                if (right - left == 0) { // if the next data is empty
                    break; // end iteration
                } else { // if not, do the command
                    System.out.print("and "); // print and
                } 
                left = mid + 1; // intialize left = mid + 1 because we will search in right side
            } else if (array[mid] > max) { // if array[mid] > max
                right = mid - 1; // right = mid - 1
            } else { // if array[mid] < max
                left = mid + 1; // left = mid + 1
            }
        }
    }

    int findMaxValue() {  // method to find max value
        int max = 0; // declare and initialize max = 0
        for (int i = 0; i < totalData; i++) { // iteration to search max value
            if (array[i] > max) { // if array[i] > max
                max = array[i]; // replace max with array[i]
            }
        }
        return max; // return max
    }

}
