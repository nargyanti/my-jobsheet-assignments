package week6.assignments;

public class EnglishLeagueStandings {

    EnglishClub[] club = new EnglishClub[20]; // create array of object club
    int index; // declare index

    void addClub(EnglishClub data) { // method to add the value of club[index]
        club[index] = data; // initialize the value of club[index]
        index++; // increase index 
    }

    void printStandings() { // method to print the standings
        System.out.println("----------------- PREMIER LEAGUE -----------------"); // print title
        System.out.println("NAME\t\t\t\tP   GD   PTS"); // print the information
        for (EnglishClub data : club) { // iteration to call the value of club
            data.print(); // print the informatioon
        }
        System.out.println("--------------------------------------------------"); // print borser
    }

    void insertionSortAscending() { // method to sort the points with ascending order
        int i, j; // declare i and j
        for (i = 1; i < club.length; i++) { // iteration to check the array of object
            EnglishClub temp = club[i]; // declare and initialize the value of temp
            j = i; // initialize the value of j 
            while ((j > 0) && (club[j - 1].points > temp.points)) { // iteration to move the position
                club[j] = club[j - 1]; // move the position of element
                j--; // the value of j is decrease
            }
            club[j] = temp; // move the temp to club[j]
        }
    }

    void insertionSortDescending() { // method to sort the points with descending order
        int i, j; // declare i and j
        for (i = 1; i < club.length; i++) { // iteration to check the array of object
            EnglishClub temp = club[i]; // declare and initialize the value of temp
            j = i; // initialize the value of j 
            while ((j > 0) && (club[j - 1].points < temp.points)) { // iteration to move the position
                club[j] = club[j - 1]; // move the position of element
                j--; // the value of j is decrease
            }
            club[j] = temp; // move the temp to club[j]
        }
    }
}
