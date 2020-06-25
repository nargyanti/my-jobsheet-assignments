public class CodeCity {
    public static void main(String[] args) {
        char CODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char CITY[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("-");
            }
            System.out.print("\t");
            for (int j = 0; j < (12 * 4) + 1; j++) {
                System.out.print("-");
            }
            System.out.print("\n| " + CODE[i] + " |");
            System.out.print("\t| ");
            for (int j = 0; j < 12; j++) {
                System.out.print(CITY[i][j] + " | ");
            }
            System.out.println();
        }
        for (int j = 0; j < 5; j++) {
            System.out.print("-");
        }
        System.out.print("\t");
        for (int j = 0; j < (12 * 4) + 1; j++) {
            System.out.print("-");
        }
        System.out.println(); 
    }
}
