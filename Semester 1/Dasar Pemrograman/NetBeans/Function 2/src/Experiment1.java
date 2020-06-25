
public class Experiment1 {
    static int recursiveFactorial(int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * recursiveFactorial(n - 1));
        }
    }
    static int iterativeFactorial(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));
        
    }
    
}


