import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int sce = 0;
        int minRange = 1;
        int maxRange = 100;
        int randomNo = rand.nextInt(maxRange);
        int maxNoOfAttempts = 10;

        System.out.println(" Hi!! Welcome to The Number Guessing Game");
        System.out.println("I'm thinking of a Number in Between " + minRange + " and " + maxRange);
        System.out.println("You will have " + maxNoOfAttempts  + " attempts, Good luck!!");

        for (int attempts = 1; attempts <= maxNoOfAttempts; attempts++) {
            System.out.print("Attempt" + attempts + ": Enter your guess: ");
            int userNo = sc.nextInt();

            if (randomNo == userNo) {
                System.out.println("Congrats!!, You have guessed the correct number " + randomNumber + " in " + attempts + " attempts");
                score = maxNoOfAttempts - attempts + 1;
                break;
            } else if ( randomNo > userNo ) {
                System.out.println("Your guessing number is low. Try again.");
            } else {
                System.out.println("Your guessing number is high. Try again.");
            }
        }
        if (score > 0) {
            System.out.println("Your score: " + score);
        } else {
            System.out.println("Sorry, you were not able to guess the number. The correct number is " + randomNo);
        }
    }
}
