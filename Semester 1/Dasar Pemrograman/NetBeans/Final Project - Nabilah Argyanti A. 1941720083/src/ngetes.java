
import java.util.ArrayList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class ngetes {

    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner(System.in);
    static int indicator = 0;
    static int posedit = 0;

    public static void main(String[] args) {
        String cari;
        int jumlahmapel, jumlahsiswa;
        System.out.println("================================================");
        System.out.println("      Wellcome to the Assesment Applicaation");
        System.out.println("================================================");
        System.out.print("Please input the total of students \t: ");
        jumlahsiswa = input.nextInt();
        System.out.print("Please input the total of lesson \t: ");
        jumlahmapel = input.nextInt();
        String nama[] = isinama(jumlahsiswa, 1);
        String mapel[] = isinama(jumlahmapel, 2);
        System.out.println("================================================");
        int nilai[][][] = isinilai(jumlahsiswa, jumlahmapel, nama, mapel);
        double rata[][] = isirata(jumlahsiswa, jumlahmapel, nilai);
        tampil(nama, mapel, nilai, rata);
        do {
            indicator = 0;
            System.out.println("                      MENU");
            System.out.print("1. Find Report\n2. Edit Report\n3. Add Student\n4. Add Lesson\n5. Fiter Report\nInput menu : ");
            String menu = input2.nextLine();
            if (menu.equalsIgnoreCase("find report") || menu.equalsIgnoreCase("find") || menu.equalsIgnoreCase("1")) {
                pencarian(nama, mapel, nilai, rata);
            } else if (menu.equalsIgnoreCase("edit report") || menu.equalsIgnoreCase("edit") || menu.equalsIgnoreCase("2")) {
                System.out.print("1. Absence\n2. Name\nEdit report based on : ");
                String based = input2.nextLine();
                int poscari = 0;
                if (based.equalsIgnoreCase("absence") || based.equalsIgnoreCase("1")) {

                    do {
                        if (indicator > 0) {
                            System.out.println("Your inputation invalid");
                        }
                        System.out.print("Input absence number you want to edit : ");
                        poscari = input.nextInt();
                        if (poscari < 0 || poscari > nilai.length) {
                            indicator++;
                        } else {
                            indicator = 0;
                        }
                    } while (indicator > 0);
                    poscari -= 1;
                } else if (based.equalsIgnoreCase("name") || based.equalsIgnoreCase("2")) {
                    poscari = edita(nama);
                }
                System.out.println("================================================");
                System.out.println("               Edit " + nama[poscari] + "'s report");
                System.out.println("================================================");
                nilai = editnilai(poscari, mapel, nilai);
                rata = editrata(poscari, nilai, rata);
                tampilsatu(poscari, nama, mapel, nilai, rata);
            } else if (menu.equalsIgnoreCase("add student") || menu.equalsIgnoreCase("3")) {
                System.out.println("================================================");
                System.out.print("How many student you want to add? : ");
                int tambah = input.nextInt();
                int bnilai[][][] = nilai;
                String bnama[] = nama;
                double brata[][] = rata;
                nilai = new int[bnilai.length + tambah][bnilai[0].length][4];
                //nama = new String[bnama.length + tambah];
                //rata = new double[brata.length + tambah][brata[0].length];
                nama = bcnama(bnama, tambah, 1);
                nilai = bcnilai(nilai, bnilai, tambah, nama, mapel, 1);
                rata = isirata(nilai.length, nilai[0].length, nilai);
            } else if (menu.equalsIgnoreCase("add lesson") || menu.equalsIgnoreCase("4")) {
                System.out.println("================================================");
                System.out.print("How many lesson you want to add? : ");
                int tambah = input.nextInt();
                int bnilai[][][] = nilai;
                double brata[][] = rata;
                String bmapel[] = mapel;
                mapel = new String[bmapel.length + tambah];
                nilai = new int[bnilai.length][bnilai[0].length + tambah][4];
                rata = new double[brata.length][brata[0].length + tambah];
                mapel = bcnama(bmapel, tambah, 2);
                nilai = bcnilai(nilai, bnilai, tambah, nama, mapel, 2);
                rata = isirata(nilai.length, nilai[0].length, nilai);
            } else if (menu.equalsIgnoreCase("filter") || menu.equalsIgnoreCase("5") || menu.equalsIgnoreCase("filter report")) {
                filter(nama, mapel, nilai, rata);
            }
            System.out.print("Do you want to input menu again? : ");
            String menulagi = input2.nextLine();
            if (menulagi.equalsIgnoreCase("y") || menulagi.equalsIgnoreCase("yes") || menulagi.equalsIgnoreCase("ya")) {
                indicator++;
            } else {
                indicator = 0;
            }
        } while (indicator > 0);
    }

    public static void filter(String nama[], String mapel[], int nilai[][][], double rata[][]) {
        System.out.println("================================================");
        for (int i = 0; i < mapel.length; i++) {
            System.out.println("-> " + mapel[i]);
        }
        int posi = -1;
        do {
            System.out.print("Choose the lesson you want to filter : ");
            String pilih = input2.nextLine();

            for (int i = 0; i < mapel.length; i++) {
                if (pilih.equalsIgnoreCase(mapel[i])) {
                    posi = i;
                }
            }
        } while (posi < 0);
        System.out.print("Please input the limit of average : ");
        int limit = input.nextInt();
        int big = 0, small = 0;
        for (int i = 0; i < rata.length; i++) {
            if (rata[i][posi] >= limit) {
                big++;
            } else {
                small++;
            }
        }
        System.out.println("small " + small + " big " + big + " posi " + posi);
        int posbigger[] = new int[big];
        int possmaller[] = new int[small];
        big = 0;
        small = 0;
        for (int i = 0; i < rata.length; i++) {
            if (rata[i][posi] >= limit) {
                posbigger[big] = i;
                big++;
            } else {
                possmaller[small] = i;
                small++;
            }
        }
        System.out.println("================================================");
        System.out.println("The student with value " + mapel[posi] + " more than equal " + limit);
        for (int i = 0; i < posbigger.length; i++) {
            System.out.println(nama[posbigger[i]] + " : " + rata[posbigger[i]][posi]);
        }
        System.out.println("================================================");
        System.out.println("The student with value " + mapel[posi] + " less than " + limit);
        for (int i = 0; i < possmaller.length; i++) {
            System.out.println(nama[possmaller[i]] + " : " + rata[possmaller[i]][posi]);
        }
    }

    public static String[] bcnama(String namalama[], int tambah, int tanda) {
        String namabaru[] = new String[namalama.length + tambah];
        for (int i = 0; i < namalama.length; i++) {
            namabaru[i] = namalama[i];
        }
        for (int i = 0; i < tambah; i++) {
            if (tanda == 1) {
                System.out.print("Please input the name of student absence " + (namalama.length + i + 1) + " : ");
            } else if (tanda == 2) {
                System.out.print("Please input the name of lesson " + (namalama.length + i + 1) + " : ");
            }
            namabaru[namalama.length + i] = input2.nextLine();
        }
        return namabaru;
    }

    public static int[][][] bcnilai(int nilaikosong[][][], int nilai[][][], int tambah, String nama[], String mapel[], int tanda) {
        int nilaibaru[][][] = nilaikosong;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                for (int k = 0; k < nilai[0][0].length; k++) {
                    nilaibaru[i][j][k] = nilai[i][j][k];
                }
            }
        }
        if (tanda == 1) {
            for (int i = 0; i < tambah; i++) {
                System.out.println("================================================");
                System.out.println("             Input the " + nama[nilai.length + i] + " score");
                System.out.println("================================================");
                for (int j = 0; j < nilai[0].length; j++) {
                    System.out.println("          Input the score for lesson " + mapel[j]);
                    System.out.println("================================================");
                    for (int k = 0; k < nilai[0][0].length; k++) {
                        do {
                            if (k == 0) {
                                System.out.print("Please input the task score \t\t: ");
                            } else if (k == 1) {
                                System.out.print("Please input the test score \t\t: ");
                            } else if (k == 2) {
                                System.out.print("Please input the mid term score \t: ");
                            } else if (k == 3) {
                                System.out.print("Please input the final test score \t: ");
                            }
                            if (indicator > 0) {
                                System.out.println("Your inputation invalid,try again");
                            }
                            nilaibaru[nilai.length + i][j][k] = input.nextInt();
                            if (nilaibaru[nilai.length + i][j][k] < 0) {
                                indicator++;
                            } else {
                                indicator = 0;
                            }
                        } while (indicator > 0);
                    }
                }
                System.out.println("================================================");
            }
        } else if (tanda == 2) {
            for (int i = 0; i < nilai.length; i++) {
                System.out.println("================================================");
                System.out.println("             Input the " + nama[i] + " score");
                System.out.println("================================================");
                for (int j = 0; j < tambah; j++) {
                    System.out.println("          Input the score for lesson " + mapel[nilai[0].length + j]);
                    System.out.println("================================================");
                    for (int k = 0; k < nilai[0][0].length; k++) {
                        do {
                            if (k == 0) {
                                System.out.print("Please input the task score \t\t: ");
                            } else if (k == 1) {
                                System.out.print("Please input the test score \t\t: ");
                            } else if (k == 2) {
                                System.out.print("Please input the mid term score \t: ");
                            } else if (k == 3) {
                                System.out.print("Please input the final test score \t: ");
                            }
                            if (indicator > 0) {
                                System.out.println("Your inputation invalid,try again");
                            }
                            nilaibaru[i][nilai[0].length + j][k] = input.nextInt();
                            if (nilaibaru[i][nilai[0].length + j][k] < 0) {
                                indicator++;
                            } else {
                                indicator = 0;
                            }
                        } while (indicator > 0);
                    }
                }
            }
        }
        return nilaibaru;
    }

    public static void tampilsatu(int pos, String nama[], String mapel[], int nilai[][][], double rata[][]) {
        System.out.println("================================================");
        System.out.println("              " + nama[pos] + "'s final report");
        System.out.println("================================================");
        for (int j = 0; j < nilai[0].length; j++) {
            System.out.println("Score on lesson " + mapel[j]);
            System.out.println("================================================");
            for (int k = 0; k < nilai[0][0].length; k++) {
                if (k == 0) {
                    System.out.print("Task score \t\t: ");
                } else if (k == 1) {
                    System.out.print("Test score \t\t: ");
                } else if (k == 2) {
                    System.out.print("Mid term score \t\t: ");
                } else if (k == 3) {
                    System.out.print("Final test score \t: ");
                }
                System.out.println(nilai[pos][j][k]);
            }
            System.out.println("Average score \t\t: " + rata[pos][j]);
            System.out.println("================================================");
        }
        System.out.println();
    }

    public static double[][] editrata(int pos, int nilai[][][], double rata[][]) {
        double array[][] = rata;
        int jumlah = 0;
        for (int j = 0; j < nilai[0].length; j++) {
            jumlah = 0;
            for (int k = 0; k < nilai[0][0].length; k++) {
                jumlah += nilai[pos][j][k];
            }
            array[pos][j] = jumlah / 4;
        }
        return array;
    }

    public static int[][][] editnilai(int pos, String mapel[], int nilai[][][]) {
        for (int i = 0; i < mapel.length; i++) {
            System.out.println("Edit value of lesson " + mapel[i]);
            System.out.println("================================================");
            for (int k = 0; k < nilai[0][0].length; k++) {
                do {
                    if (k == 0) {
                        System.out.print("Please input the task score \t\t: ");
                    } else if (k == 1) {
                        System.out.print("Please input the test score \t\t: ");
                    } else if (k == 2) {
                        System.out.print("Please input the mid term score \t: ");
                    } else if (k == 3) {
                        System.out.print("Please input the final test score \t: ");
                    }
                    if (indicator > 0) {
                        System.out.println("Your inputation invalid,try again");
                    }
                    nilai[pos][i][k] = input.nextInt();
                    if (nilai[pos][i][k] < 0) {
                        indicator++;
                    } else {
                        indicator = 0;
                    }
                } while (indicator > 0);
            }
            System.out.println("================================================");
        }
        int array[][][] = nilai;
        return array;
    }

    public static int edita(String nama[]) {
        int posisi = -1;
        do {
            System.out.print("Input the name you want to edit : ");
            String carinama = input2.nextLine();
            if (indicator > -1) {
                System.out.println("Sorry, we can't find the student with name " + carinama);
            }
            for (int i = 0; i < nama.length; i++) {
                if (nama[i].equalsIgnoreCase(carinama)) {
                    posisi = i;
                    posedit = i;
                    indicator = 0;
                }
            }
            if (posisi == -1) {
                indicator++;
            }
        } while (posisi == -1);
        return posedit;
    }

    public static String[] isinama(int a, int b) {
        System.out.println("================================================");
        String array[] = new String[a];
        for (int i = 0; i < a; i++) {
            if (b == 1) {
                System.out.print("Please input the name of student absence " + (i + 1) + " : ");
            } else if (b == 2) {
                System.out.print("Please input the name of lesson number " + (i + 1) + " : ");
            }
            array[i] = input2.nextLine();
        }
        System.out.println();
        System.out.println();
        return array;
    }

    public static int[][][] isinilai(int siswa, int pelajaran, String nama[], String mapel[]) {
        int array[][][] = new int[siswa][pelajaran][4];
        for (int i = 0; i < array.length; i++) {
            System.out.println("================================================");
            System.out.println("             Input the " + nama[i] + " score");
            System.out.println("================================================");
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("          Input the score for lesson " + mapel[j]);
                System.out.println("================================================");
                for (int k = 0; k < array[0][0].length; k++) {
                    if (k == 0) {
                        System.out.print("Please input the task score \t\t: ");
                    } else if (k == 1) {
                        System.out.print("Please input the test score \t\t: ");
                    } else if (k == 2) {
                        System.out.print("Please input the mid term score \t: ");
                    } else if (k == 3) {
                        System.out.print("Please input the final test score \t: ");
                    }
                    do {
                        if (indicator > 0) {
                            System.out.println("Your inputation invalid,try again");
                        }
                        array[i][j][k] = input.nextInt();
                        if (array[i][j][k] < 0) {
                            indicator++;
                        } else {
                            indicator = 0;
                        }
                    } while (indicator > 0);
                }
                System.out.println("================================================");
            }
        }
        System.out.println();
        System.out.println();
        return array;
    }

    public static double[][] isirata(int siswa, int mapel, int nilai[][][]) {
        double array[][] = new double[siswa][mapel];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int jumlah = 0;
                for (int k = 0; k < 4; k++) {
                    jumlah += nilai[i][j][k];
                }
                array[i][j] = jumlah / 4;
            }
        }
        return array;
    }

    public static void tampil(String nama[], String mapel[], int nilai[][][], double rata[][]) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("================================================");
            System.out.println("              " + nama[i] + "'s final report");
            System.out.println("================================================");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.println("Score on lesson " + mapel[j]);
                System.out.println("================================================");
                for (int k = 0; k < nilai[0][0].length; k++) {
                    if (k == 0) {
                        System.out.print("Task score \t\t: ");
                    } else if (k == 1) {
                        System.out.print("Test score \t\t: ");
                    } else if (k == 2) {
                        System.out.print("Mid term score \t\t: ");
                    } else if (k == 3) {
                        System.out.print("Final test score \t: ");
                    }
                    System.out.println(nilai[i][j][k]);
                }
                System.out.println("Average score \t\t: " + rata[i][j]);
                System.out.println("================================================");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pencarian(String nama[], String mapel[], int nilai[][][], double rata[][]) {
        String carinama;
        int posisi = -1;
        System.out.print("Input the name of student you want to search : ");
        carinama = input2.nextLine();
        do {
            if (indicator > 0) {
                System.out.println("Sorry, we can't find the student with name " + carinama);
            }
            for (int i = 0; i < nama.length; i++) {
                if (nama[i].equalsIgnoreCase(carinama)) {
                    posisi = i;
                    indicator = 0;
                }
            }
            if (posisi == -1) {
                indicator++;
            }
        } while (posisi == -1);
        System.out.println("================================================");
        System.out.println("              " + nama[posisi] + "'s final report");
        System.out.println("================================================");
        for (int j = 0; j < nilai[0].length; j++) {
            System.out.println("Score on lesson " + mapel[j]);
            System.out.println("================================================");
            for (int k = 0; k < nilai[0][0].length; k++) {
                if (k == 0) {
                    System.out.print("Task score \t\t: ");
                } else if (k == 1) {
                    System.out.print("Test score \t\t: ");
                } else if (k == 2) {
                    System.out.print("Mid term score \t\t: ");
                } else if (k == 3) {
                    System.out.print("Final test score \t: ");
                }
                System.out.println(nilai[posisi][j][k]);
            }
            System.out.println("Average score \t\t: " + rata[posisi][j]);
            System.out.println("================================================");
        }
        System.out.println();
    }
}
