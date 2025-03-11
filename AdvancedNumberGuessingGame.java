
import java.util.Random;
import java.util.Scanner;

public class AdvancedNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;  

        System.out.println();
        System.out.println("Welcome to the NUMBER GUESSING GAME!");
        
        boolean playAgain = true;
        
        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; 
            int maxAttempts = 5; 
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nNew Round! Guess a number between 1 to 100.\n");
            System.out.println("You have " + maxAttempts + " attempts.\n");

            while (attempts < maxAttempts) {
                System.out.println();
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println(" CORRECT! You guessed the number in " + attempts + " attempts.");
                    totalScore++;  
                    guessedCorrectly = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println(" Too low! TRY AGAIN.");
                } else {
                    System.out.println(" Too high! TRY AGAIN.");
                }
                
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }


            if (!guessedCorrectly) {
                System.out.println("OUT IF ATTEMPTS! The correct number was: " + randomNumber);
            }

            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

       
        System.out.println("\n GAME OVER! Your total score: " + totalScore);
        System.out.println();
        System.out.println("THANKS FOR PLAYING! ");

        scanner.close();
    }
}

