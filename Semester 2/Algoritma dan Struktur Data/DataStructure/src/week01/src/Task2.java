public class Task2 {
    public static void main(String[] args) {
        int balance = 1000000, period = 0; //declare the intial balance and initial period
        while (balance <= 1500000) { // a looping is performed when the value of balance is below 1.5 million
            period++; //the value of period increases
            balance = (int) (balance + (balance * 0.02)); //calculate the new balance value 
        } // closing looping syntax
        System.out.println("A customer's balance will reach 1.5 million in " + period + " months"); // print the result
    }
}
