package week3.test;

public class NyimpenVotingBEMSingCopas {

    public String candidate[] = {"Haris", "Dian", "Rani", "Bisma"};

    public void printCandidate() {
        System.out.println("Candidate: ");
        for (int i = 0; i < candidate.length; i++) {
            System.out.println((i + 1) + ". " + candidate[i]);
        }
    }

    int countVote(int vote[], int choice, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (vote[i] == choice) {
                count++;
            }
        }
        return count;
    }

    int searchWinner(int vote[], int left, int right) {
        if (left == right) {
            System.out.println("Return left == right: " + vote[left]);
            return vote[left];
        }
        System.out.println("\nMau nyari mid : " +  left + " "+ right);
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

        int leftCount = countVote(vote, leftResult, left, right);
        System.out.println("leftcount: " + leftCount);
        int rightCount = countVote(vote, rightResult, left, right);
        System.out.println("rightcount: " + rightCount);

        return leftCount > rightCount ? leftResult : rightResult;
    }

    public String winner(int vote[], int left, int right) {
        int i = searchWinner(vote, left, right);
        return candidate[i - 1];
    }

}
