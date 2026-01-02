import java.util.Random;
import java.util.Scanner;

public class GussingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        int userGuess;
        boolean guessedCorrectly = false;

        System.out.println("I'm thinking of a number between 1 and 10. Try to guess it!");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Correct! You guessed the number!");
                guessedCorrectly = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}
