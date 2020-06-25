package week8.assignments;

public class ReverseSentence {

    int size, top; // declare integer size, top
    String words[]; // declare string words[]

    public ReverseSentence(int size) { // constructor with parameter size
        this.size = size; // initialize this.size
        words = new String[size]; // instantiate words[]
        top = -1; // initialize top 
    }

    public boolean isFull() { // method to check whether stack is full or not
        return top == size - 1; // if top == size - 1, return true. if no, false
    }

    public void push(String[] split) { // method to push the split
        while (!isFull()) { // iteration to push the split
            top++; // top increases
            words[top] = split[top]; // initialize words[top] with split[top]
        }
    }

    public void print() { // method to print stack words[]
        System.out.print("Reverse sentence: "); // print "Reserve sentence: "
        for (int i = top; i >= 0; i--) { // iteration to print the words
            System.out.print(words[i] + " "); // print the words[i]
        }
        System.out.println(""); // print enter
    }

}
