package week3.assignments;

public class VotingBEM {

    public String candidate[] = {"No one", "Haris", "Dian", "Rani", "Bisma"}; // declare the candidate
    public int countedVote[] = {0, 0, 0, 0, 0}; // declare the countedVote to save the vote amount

    public String winner(int[] vote) { // method to search the winner of vote
        searchWinner(vote, 0, vote.length - 1); // call the method searchWinner
        int biggestVote = countedVote[0]; // declare biggestVote 
        int winner = 0, repeated = 0; // declare winner and repeated
        
        System.out.println("\n============== Voting Result =============="); // print text "Voting Result"
        for (int i = 1; i < countedVote.length; i++) { // iteration to print the vote result
            System.out.println(i + ". " + candidate[i] + ": " + countedVote[i]); // print the result
        }
        for (int i = 0; i < countedVote.length; i++) { // iteration to search the biggest vote
            if (countedVote[i] > biggestVote) { // if countedVote[i] > biggestVote, follow the commands below
                biggestVote = countedVote[i]; // fill biggestVote with countedVOte[i]
            }
        }
        for (int i = 0; i < countedVote.length; i++) { // iteration to search the index of winner
            if (countedVote[i] == biggestVote) { // if countedVote[i] == biggestVote, follow the commands
                winner = i; // fill the winner = i
                repeated++; // increase the value of repeated
            }
        }
        if (repeated > 1) { // selection to check whether the voting result is repeated above 1 or not
            return candidate[0]; // return the candidate[0] if there are a duplicate winner
        } else { // if there are only one who get the biggestValue, follow the commands below
            return candidate[winner]; // return candidate[winner]
        }
    }

    private int searchWinner(int[] vote, int l, int r) { // method to divide and conquer the array vote[]
        if (l == r) { // if l == r, follow the commands below
            countVote(vote, vote[l], l, r); // call the method countVote()
            return vote[l]; // return the value of vote[l]
        } else { // if l!= r, follow the commands below
            int mid = (r - l) / 2 + l; // calculate the mid to search middle of array
            int leftResult = searchWinner(vote, l, mid); // search the value of leftResult recursively
            int rightResult = searchWinner(vote, mid + 1, r); // search the value of rightResult recursively 
            return 0; // return 0
        }
    }

    private void countVote(int[] vote, int choice, int l, int r) { // method to save the vote result
        switch (choice) { // selection to add the countedVote with 1
            case 1: // if choice == 1, then
                countedVote[1]++; // countedVote[1]++
                break; // exit the selection
            case 2: // if choice == 1, then
                countedVote[2]++; // countedVote[1]++
                break; // exit the selection
            case 3: // if choice == 1, then
                countedVote[3]++; // countedVote[1]++
                break; // exit the selection
            case 4: // if choice == 1, then
                countedVote[4]++; // countedVote[1]++
                break; // exit the selection
        }
    }
}
