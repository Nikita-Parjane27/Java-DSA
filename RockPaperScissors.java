import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("We will play 5 rounds. Let's begin!");

        int round = 1;
        while (round <= 5) {
            System.out.println("\nRound " + round + ":");
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String userMove = sc.nextLine().toLowerCase();

            // Validate input
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move! Please enter only rock, paper, or scissors.");
                continue; // retry the same round
            }

            // Computer's move
            String computerMove = options[random.nextInt(3)];
            System.out.println("Computer played: " + computerMove);

            // Determine outcome
            if (userMove.equals(computerMove)) {
                System.out.println("It's a draw!");
                draws++;
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            round++;
        }

        // Final Result
        System.out.println("\n----- Game Over -----");
        System.out.println("Your Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        if (userWins > computerWins) {
            System.out.println("Congratulations! You are the overall winner!");
        } else if (computerWins > userWins) {
            System.out.println("Computer wins the game! Better luck next time.");
        } else {
            System.out.println("The game is a tie!");
        }

        sc.close();
    }
}
