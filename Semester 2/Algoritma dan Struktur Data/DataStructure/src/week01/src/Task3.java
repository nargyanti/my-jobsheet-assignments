public class Task3 {
    public static void main(String[] args) { 
        char mississipi[] = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'}; 
        int M = 0, I = 0, S = 0, P = 0; 
        for (int i = 0; i < mississipi.length; i++) { //Iteration to check the contents of mississipi[]
            switch (mississipi[i]) { //selection syntax to check the contents of mississipi[i]
                case 'M': //If the contents of the mississipi[i] array is M, 
                    M++; //then the value of M increases
                    break; //pass the next case and immediately exit the selection syntax
                case 'I': //If the contents of the mississipi[i] array is I, 
                    I++; //then the value of I increases
                    break; //pass the next case and immediately exit the selection syntax
                case 'S': //If the contents of the mississipi[i] array is S, 
                    S++; //then the value of S increases
                    break; //pass the next case and immediately exit the selection syntax
                case 'P': //If the contents of the mississipi[i] array is P, 
                    P++; //then the value of S increases
                    break; //pass the next case and immediately exit the selection syntax
            } // closing selection syntax
        } // closing iteration syntax
        System.out.println("The total of each letter in the 'MISSISSIPI' word are:"); //print the sentence with enter
        System.out.println("M = " + M + "\nI = " + I + "\nS = " + S + "\nP = " + P); //print details about the number of letters
    }  
}
