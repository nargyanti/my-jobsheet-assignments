package week3.assignments;

import java.util.Scanner;

public class VotingBEMMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // instantiate Scanner sc 
        while (true) { // iteration to check whether the voteAmount is above 0 or not
            System.out.print("Input the amount of people who will vote: "); // print the text
            int voteAmount = sc.nextInt(); // fill the voteAmount
            if (voteAmount > 0) { // if voteAmount is above 0, follow the commands
                VotingBEM vote = new VotingBEM(); // instantiate vote from VotingBEM
                int fillVote[] = new int[voteAmount]; // instantiate array fillVote
                System.out.println("Candidate: "); // print text "Candidate: 
                for (int i = 1; i < vote.candidate.length; i++) { // iteration to print the candidate
                    System.out.println((i) + ". " + vote.candidate[i]); // print the candidate
                } 
                System.out.println("Choose your candidate by typing the number of candidate: "); // print the text
                for (int i = 0; i < voteAmount; i++) { // iteration to fill the vote
                    while (true) { // iteration to check whether fillVote[i] is 1 to 4 or not
                        System.out.print("Participant " + (i + 1) + ": "); // print text participant
                        fillVote[i] = sc.nextInt(); // fill the fillVote[i]
                        if (fillVote[i] >= 1 && fillVote[i] <= 4) { // if fillVote is 1 to 4, follow commands
                            break; // exit the iteration
                        } else { // if fillVote is not 1 to 4, follow the commands
                            System.out.println("The input is wrong, please try again\n"); // print text wrong
                        }
                    }
                }
                System.out.println(vote.winner(fillVote) + " won the vote"); // print the winner
                break; // exit the iteration
            } else { // if voteAmount is 0 or below 0, follow the commands below
                System.out.println("The input is wrong, please try again\n"); // print text wrong
            }
        }
    }
    
}
