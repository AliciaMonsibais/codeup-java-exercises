import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        int guessMe = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 100.");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == guessMe) {
                win = true;
            } else if (guess < guessMe) {
                System.out.println("HIGHER");
            } else if (guess > guessMe) {
                System.out.println("LOWER");
            }
        }
        System.out.println("GOOD GUESS!");
        System.out.println("The number was " + guessMe + ".");
        System.out.println("It took you " + numberOfTries + " tries.");
    }
}
