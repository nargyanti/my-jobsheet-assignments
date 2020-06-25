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
public class VotingBEM_SANGATBERHASIL {
  

    public String candidate[] = {"no one", "Haris", "Dian", "Rani", "Bisma"};
    public int countVote[] = {0, 0, 0, 0, 0};

    private void countVote(int[] vote, int choice, int l, int r) {
        switch (choice) {
            case 1:
                countVote[1]++;
                break;
            case 2:
                countVote[2]++;
                break;
            case 3:
                countVote[3]++;
                break;
            case 4:
                countVote[4]++;
                break;
        }
        System.out.println("Ngitung countnya choice: " + choice + " = " + countVote[choice]);
    }

    public void printCandidate() {
        System.out.println("Candidate: ");
        for (int i = 1; i < candidate.length; i++) {
            System.out.println((i) + ". " + candidate[i]);
        }
    }

    private int searchWinner(int[] vote, int l, int r) {
        if (l == r) {
            System.out.println("Nilai vote[l] : " + vote[l]);
            countVote(vote, vote[l], l, r);
            return vote[l];
        } else {
            int mid = (r - l) / 2 + l;
            System.out.println("mid: (" + r + " - " + l + ") / 2 + " + l + " = " + mid);
            int leftResult = searchWinner(vote, l, mid);
            System.out.println("leftResult: " + leftResult);
            int rightResult = searchWinner(vote, mid + 1, r);
            System.out.println("rightResult: " + rightResult);
            return 0;
        }

        // if the two halves agree on the majority element, return it.
//        if (leftResult == righttResult) {
//            return leftResult;
//        }
        // otherwise, count each element and return the "winner".
//        int leftCount = countVote(vote, leftResult, l, r);
//        int rightCount = countVote(vote, rightResult, l, r);
//        if (leftResult == rightResult) {
//            System.out.println("Ternyata leftResult = rightResult: " + leftResult + " " + rightResult);
//            return leftResult;
//        }
//        System.out.println("Mau ngereturn semuanya");
//        System.out.println(countVote[leftResult] + " " + countVote[rightResult]);
//        if (countVote[leftResult] > countVote[rightResult]) {
//            System.out.println("\nReturn leftResult");
//            return countVote[leftResult];
//        } else if (countVote[leftResult] < countVote[rightResult]) {
//            System.out.println("\nReturn rightResult");
//            return countVote[rightResult];
//        } else if (countVote[leftResult] == 0){
//            System.out.println("\nTernyata yang besar cuma kanan: " + countVote[leftResult] + " " + countVote[rightResult]);
//            return countVote[rightResult];
//        } else if (countVote[rightResult] == 0) {
//            System.out.println("\nTernyata yang besar cuma kiri: " + countVote[leftResult] + " " + countVote[rightResult]);
//            return countVote[rightResult];
//        } else {
//            System.out.println("Yang kereturn 0");
        //}
    }

    public String winner(int[] vote) {
        searchWinner(vote, 0, vote.length - 1);
        //System.out.println("Nilai i : " + );
        System.out.println("Hasil vote 1 : " + countVote[1]);
        System.out.println("Hasil vote 2 : " + countVote[2]);
        System.out.println("Hasil vote 3 : " + countVote[3]);
        System.out.println("Hasil vote 4 : " + countVote[4]);
        int winner = countVote[0];
        for (int i = 0; i < countVote.length; i++) {
            if (countVote[i] > winner) {
                winner = countVote[i];
            }
        }
        int m = 0;
        int kedobel = 0;
        for (int i = 0; i < countVote.length; i++) {
            if (countVote[i] == winner) {
                m = i;
                kedobel++;
            }
        }
        if (kedobel > 1) {
            System.out.println("Kedobel: " + kedobel);
            return candidate[0];
        } else {
            return candidate[m];
        }

    }

}


