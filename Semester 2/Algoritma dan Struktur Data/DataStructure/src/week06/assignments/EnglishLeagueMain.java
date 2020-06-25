package week6.assignments;

import java.util.Scanner;

public class EnglishLeagueMain {

    public static void main(String[] args) {
        EnglishLeagueStandings standings = new EnglishLeagueStandings(); // create object standings
        Scanner sc = new Scanner(System.in); // instantiate scanner sc
        String name[] = {"Liverpool", "Manchester City", "Leicester", "Chelsea",
            "Wolverhampton Wanderers", "Sheffield United", "Manchester United", "Tottenham Hotspur",
            "Arsenal", "Burnley", "Crystal Palace", "Everton", "Newcastle United", "Southampton",
            "Brighton & Hove Albion", "West Ham United", "Watford", "AFC Bournemouth",
            "Aston Villa", "Norwich City"}; // declare and initialize name[]
        int score[][] = {{29, 45, 82}, {27, 39, 57}, {28, 26, 50}, {29, 9, 48}, {29, 7, 43}, {28, 5, 43},
        {28, 12, 42}, {29, 7, 41}, {28, 4, 40}, {29, -6, 39}, {29, -6, 39}, {29, -7, 37}, {29, -16, 35},
        {29, -17, 34}, {29, -8, 29}, {29, -15, 27}, {29, -17, 27}, {29, -18, 27}, {27, -18, 25}, {29, -27, 21}};
        // declare and initialize score[][]

        for (int i = 0; i < name.length; i++) { // iteration to input array to object
            EnglishClub club = new EnglishClub(name[i], score[i][0], score[i][1], score[i][2]); // instantiate club
            standings.addClub(club); // call method standings.addClub with parameter club
        }

        System.out.println("ASCENDING SORTING:"); // print text "\nASCENDING SORTING:"
        standings.insertionSortAscending(); // call the method to do ascending sorting
        standings.printStandings(); // call the method to print the result
        System.out.println("\nDESCENDING SORTING:"); // print text "\nDESCENDING SORTING:"
        standings.insertionSortDescending(); // call the method to do descending sorting
        standings.printStandings(); // call the method to print the result
    }

}
