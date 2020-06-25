package week3.test;

public class NyimpenVotingBEM {

    public String m;
    public String candidate[] = {"Haris", "Dian", "Rani", "Bisma"};
    public int countVote[] = {0, 0, 0, 0};

    public String determineWinnerBF(int fillVote[]) {
        for (int i = 0; i < fillVote.length; i++) {
            switch (fillVote[i]) {
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
        }
        int winner = countVote[0];
        for (int i = 0; i < countVote.length; i++) {
            if (countVote[i] > winner) {
                winner = countVote[i];
            }
        }
        for (int i = 0; i < countVote.length; i++) {
            if (countVote[i] == winner) {
                m = candidate[i];
            }
        }
        return m;
    }

    public int countWinner(int fillVote[], int num, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (fillVote[i - 1] == num) {
                count++;
            }
        }
        return count;
    }

    public int determineWinnerDC(int fillVote[], int left, int right) {
        if (left == right) {
            return fillVote[left];
        }
        
        int mid = (right - left)/2 + left;
        int leftResult = determineWinnerDC(fillVote, left, mid - 1);
        int rightResult = determineWinnerDC(fillVote, mid + 1, right);
        
        if (leftResult == rightResult) {
            return leftResult;
        }
        
        int leftVoteCount = countWinner(fillVote, leftResult, left, right);
        int rightVoteCount = countWinner(fillVote, rightResult, left, right);

        return leftVoteCount > rightVoteCount ? left : right;
    }
    
    public String winner(int fillVote[], int left, int right) {
        int i = determineWinnerDC(fillVote, left, right);
        return candidate[i];
    }

    public void printCandidate() {
        System.out.println("Candidate: ");
        for (int i = 0; i < candidate.length; i++) {
            System.out.println((i + 1) + ". " + candidate[i]);
        }
    }

}
