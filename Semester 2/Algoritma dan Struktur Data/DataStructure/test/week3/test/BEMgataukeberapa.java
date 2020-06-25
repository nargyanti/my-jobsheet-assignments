/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.test;

/**
 *
 * @author ASUS
 */
public class BEMgataukeberapa {
    public String candidate[] = {"Haris", "Dian", "Rani", "Bisma"};

    public int countVote[] = {0, 0, 0, 0};

    public int leftCount, rightCount;

    public void printCandidate() {
        System.out.println("Candidate: ");
        for (int i = 0; i < candidate.length; i++) {
            System.out.println((i + 1) + ". " + candidate[i]);
        }
    }

    public int countVote(int vote[], int choice, int left, int right) {
        System.out.println("Mau nambah vote yang nomor " + choice);
        switch (choice) {
            case 1:
                countVote[0]++;
                break;
            case 2:
                countVote[1]++;
                break;
            case 3:
                countVote[2]++;
                break;
            case 4:
                countVote[3]++;
                break;

        }
        System.out.println("Vote 1 " + countVote[0]);
        System.out.println("Vote 2 " + countVote[1]);
        System.out.println("Vote 3 " + countVote[2]);
        System.out.println("Vote 4 " + countVote[3]);
        return countVote[choice - 1];
    }

    public int searchWinner(int vote[], int left, int right) {
        if (left == right) {
            System.out.println("Return left == right: " + vote[left]);
            return vote[left];
        }
        System.out.println("\nMau nyari mid : " + left + " " + right);
        int mid = (right - left) / 2 + left;
        System.out.println("mid: (" + right + " - " + left + ") / 2 + " + left + " = " + mid);
        int leftResult = searchWinner(vote, left, mid);
        System.out.println("LeftResult: " + leftResult);
        int rightResult = searchWinner(vote, mid + 1, right);
        System.out.println("RightResult: " + rightResult);
        if (leftResult == rightResult) {
            System.out.println("Return leftResult: " + leftResult + "\n");
            return leftResult;
        }
        if ((right - left) == 1) {
            leftCount = countVote(vote, leftResult, left, right);
            System.out.println("leftCount : " + leftCount);
            rightCount = countVote(vote, rightResult, left, right);
            System.out.println("rightCount: " + rightCount);
        }

        System.out.println("Mau ngereturn nilai leftCount RightCount");
        return leftCount > rightCount ? leftResult : rightResult;
    }

    public String winner(int vote[], int left, int right) {
        int i = searchWinner(vote, left, right);
        return candidate[i - 1];
    }


}
