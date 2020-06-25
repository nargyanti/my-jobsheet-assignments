/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class konsepInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = new int[1][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = 12;
            }
        }
        //--------------------------------------------------
        int backup[][] = a;
        a = new int[a.length + 1][a[0].length];
        System.arraycopy(backup, 0, a, 0, backup.length);
        for (int i = backup.length; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 1;
            }
        }
        backup = a;
        a = new int[a.length + 1][a[0].length];
        System.arraycopy(backup, 0, a, 0, backup.length);
        for (int i = backup.length; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 2;
            }
        }
        //--------------------------------------------------
        /*int d[][] = a;
        int backup1[][] = d;
        d = new int[d.length + 1][d[0].length];
        System.arraycopy(backup1, 0, d, 0, backup1.length);
        for (int i = backup1.length; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = 2;
            }
        }
        //--------------------------------------------------
        int e[][] = d;
        int backup2[][] = e;
        e = new int[e.length + 1][e[0].length];
        System.arraycopy(backup2, 0, e, 0, backup2.length);
        for (int i = backup2.length; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                e[i][j] = 3;
            }
        }
        //--------------------------------------------------
        int f[][] = e;
        int backup3[][] = f;
        f = new int[f.length + 1][f[0].length];
        System.arraycopy(backup3, 0, f, 0, backup3.length);
        for (int i = backup3.length; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                f[i][j] = 4;
            }
        }*/
        //--------------------------------------------------
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
