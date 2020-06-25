package week6;

public class ListAchievementStudents {

    Student listSdt[] = new Student[5];
    int idx;

    void add(Student m) {
        if (idx < listSdt.length) {
            listSdt[idx] = m;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        for (Student m : listSdt) {
            m.print();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listSdt.length - 1; i++) {
            for (int j = 1; j < listSdt.length - i; j++) {
                if (listSdt[j].gpa > listSdt[j - 1].gpa) {
                    Student tmp = listSdt[j];
                    listSdt[j] = listSdt[j - 1];
                    listSdt[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listSdt.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listSdt.length; j++) {
                if (listSdt[j].gpa < listSdt[idxMin].gpa) {
                    idxMin = j;
                }
            }
            Student tmp = listSdt[idxMin];
            listSdt[idxMin] = listSdt[i];
            listSdt[i] = tmp;
        }
    }

    void insertionSort(boolean ascending) {
        int i, j;
        for (i = 1; i < listSdt.length; i++) {
            Student temp = listSdt[i];
            j = i;
            if (ascending) {
                while ((j > 0) && (listSdt[j - 1].gpa > temp.gpa)) {
                    listSdt[j] = listSdt[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (listSdt[j - 1].gpa < temp.gpa)) {
                    listSdt[j] = listSdt[j - 1];
                    j--;
                }
            }
            listSdt[j] = temp;
        }
    }
}
