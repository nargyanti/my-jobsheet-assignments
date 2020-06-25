package week3.assignments;

public class ScoreAlgSdt {

    public String nameSdt; // declarer String nameSdt
    public int scoreAssgment, scoreQuiz, scoreMid, scoreFinal; // declare integer attribute

    public double calculateTotalScore() { // method to calculate the student's total score
        double totalScore = (0.3 * scoreAssgment) + (0.2 * scoreQuiz) + (0.2 * scoreMid) + (0.3 * scoreFinal); // calculate the totalScore
        return totalScore; // return the value of totalScore
    }

    public double calculateAverage(double totalScore[], int left, int right) { // method to calculate average of student score
        if (left == right) { // if index left is same with right, follow the commands below
            return totalScore[left]; // return totalScore[left]
        } else if (left < right) { // if left < right, follow the commands below
            int middle = (left + right) / 2; // calculate middle to determine the middle array
            double leftScore = calculateAverage(totalScore, left, middle - 1); // calculate the leftScore from left array 
            double rightScore = calculateAverage(totalScore, middle + 1, right); // calculate the rightScore from right array
            return (leftScore + rightScore + totalScore[middle]) / totalScore.length; // return the value of average
        }
        return 0; // return 0 if the 2 condition is false
    }

}
