package rockPaperScissors;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        /*
         * The code here does two things:
         * It first creates a new RockPaperScissors -object with the
         * code `new RockPaperScissors()`. Then it calls the `run()`
         * method on the newly created object.
         */
        new RockPaperScissors().run();
    }


    Scanner sc = new Scanner(System.in);
    int roundCounter = 1;
    int humanScore = 0;
    int computerScore = 0;
    List<String> rpsChoices = Arrays.asList("rock", "paper", "scissors");

    public void run() {
        while (true) {
            System.out.println("Let's play round " + roundCounter);

            Random random = new Random();
            int randomChoice = random.nextInt(rpsChoices.size());
            String computerChoice = rpsChoices.get(randomChoice);
            String humanChoice;
            humanChoice = readInput("Your choice (Rock/Paper/Scissors)?");
            while (true) {
                if (rpsChoices.contains(humanChoice)) {
                    break;
                }
                humanChoice = readInput("I do not understand " + humanChoice + ". Could you try again?");
            }


            if (humanChoice.equals(computerChoice)) {
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ".  It's a tie!");
            } else if (humanChoice.equals("rock") && computerChoice.equals("paper")) {
                computerScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Computer wins!");
            } else if (humanChoice.equals("rock") && computerChoice.equals("scissors")) {
                humanScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Human wins!");
            } else if (humanChoice.equals("paper") && computerChoice.equals("rock")) {
                humanScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Human wins!");
            } else if (humanChoice.equals("paper") && computerChoice.equals("scissors")) {
                computerScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Computer wins!");
            } else if (humanChoice.equals("scissors") && computerChoice.equals("paper")) {
                humanScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Human wins!");
            } else if (humanChoice.equals("scissors") && computerChoice.equals("rock")) {
                computerScore++;
                System.out.println("Human chose " + humanChoice + ", computer chose " + computerChoice + ". Computer wins!");
            }

            System.out.println("Score: human " + humanScore + ", computer " + computerScore);
            String play = readInput("Do you wish to continue playing? (y/n)?");

            if (play.equals("n")) {
                System.out.println("Bye bye :)");
                break;
            }
            roundCounter++;

        }
    }



    /**
     * Reads input from console with given prompt
     * @param prompt
     * @return string input answer from user
     */
    public String readInput(String prompt) {
        System.out.println(prompt);
        String userInput = sc.next();
        return userInput;
    }

}
