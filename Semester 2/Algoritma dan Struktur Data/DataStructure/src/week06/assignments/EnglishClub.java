package week6.assignments;

public class EnglishClub {

    String nameClub; // declare String nameClub
    int play, goalDifferent, points; // declare integer play, goalDifferent, points

    public EnglishClub(String name, int p, int gd, int pts) { // method to initialize the value
        nameClub = name; // initialize the value of nameClub
        play = p; // initialize the value of play
        goalDifferent = gd; // initialize the value of goalDifferent
        points = pts; // initialize the value of points
    }

    public void print() { // method to print the value of each attribute
        if (nameClub.toCharArray().length < 9) { // if the letter of nameClub is below 9, follow the commands
            System.out.print(nameClub + "\t\t\t\t" + play + "  "); // print the value of nameClub and play
        } else if (nameClub.toCharArray().length < 16) { // if the letter of nameClub is below 16, follow the commands
            System.out.print(nameClub + "\t\t\t" + play + "  "); // print the value of nameClub and play
        } else { // if the letter of nameClub is above 16, follow the command
            System.out.print(nameClub + "\t\t" + play + "  "); // print the value of nameClub and play
        }
        if (goalDifferent < -9) { // if the value of goalDifferent is below -9, follow the commands
            System.out.println(goalDifferent + "  " + points); // print the value of goalDifferent and points
        } else if ((goalDifferent > -10 && goalDifferent <= -1) || (goalDifferent > 9)) { // if value is -9 to -1 or above 9
            System.out.println(goalDifferent + "   " + points); // print the value of goalDifferent and points
        } else { // if the value is out of selection, follow the commands
            System.out.println(goalDifferent + "    " + points); // print the value of goalDifferent and points
        }
    }

}
