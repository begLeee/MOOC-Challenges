
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int guess = 0;
        int numGuess = 0;

        while (guess != numberDrawn) {

            numGuess ++;

            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());

            if (guess > numberDrawn) {
                System.out.print("The number is lesser, ");

            } else if (guess < numberDrawn) {
                System.out.print("The number is greater, ");

            }
            System.out.println("guesses made: " + numGuess);
        }
        System.out.println("Congratulations, your guess is correct!");



        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {

        return new Random().nextInt(101);
    }
}
