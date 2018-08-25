import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nTop 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nstatistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nstatistics for Philadelphia Flyers (abbreviation: PHI)");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nplayers in Anaheim Ducks (abbreviation: ANA)");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");


    }
}
