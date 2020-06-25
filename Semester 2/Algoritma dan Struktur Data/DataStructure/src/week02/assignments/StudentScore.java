package week2.assignments;

public class StudentScore {

    public int score1, score2; // declare integer attribute (score1, score2)
    
    public int calculateBestScore() { // method to determine the best score
        if (score1 > score2) { // if score1 larger than score2, follow the commands
            return score1; // return score1
        } else { // if score2 larger than score1, follow the commands
            return score2; // return score2
        }
    }
    
}
