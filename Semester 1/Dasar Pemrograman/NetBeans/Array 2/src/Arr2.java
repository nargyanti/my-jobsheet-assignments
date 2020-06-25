public class Arr2 {
    public static void main(String[] args) {
        int [][] value = new int [2][3];
        value [0][0] = 12;
        value [0][1] = 14;
        value [0][2] = 34;
        value [1][0] = 30;
        value [1][1] = 21;
        value [1][2] = 67;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println("");
        }
    }    
}