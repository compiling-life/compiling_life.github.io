import java.util.Random;
import java.util.Scanner;

public class GameApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome! Which game would you like to play?");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Heads or Tails Game");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1)
        {
            numberGuessingGame(scanner, random);
        }
        else if (choice == 2)
        {
            headsOrTailsGame(scanner, random);
        }
        else
        {
            System.out.println("Invalid choice. Please restart the program and select a valid game.");
        }
        
        scanner.close();
    }
    
    public static void numberGuessingGame(Scanner scanner, Random random)
    {
        System.out.println("\n--- Number Guessing Game ---");
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
        
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        
        while (true)
        {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber)
            {
                System.out.println("Too low! Try again.");
            }
            else if (guess > targetNumber)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            }
        }
    }
    
    public static void headsOrTailsGame(Scanner scanner, Random random)
    {
        System.out.println("\n--- Heads or Tails Game ---");
        System.out.print("Choose 'Heads' or 'Tails': ");
        String userChoice = scanner.next().toLowerCase();
        
        if (!userChoice.equals("heads") && !userChoice.equals("tails"))
        {
            System.out.println("Invalid choice. Please choose 'Heads' or 'Tails'.");
            return;
        }
        
        String coinFlip = random.nextBoolean() ? "heads" : "tails";
        
        System.out.println("The coin landed on: " + coinFlip);
        
        if (userChoice.equals(coinFlip))
        {
            System.out.println("Congratulations! You win.");
        }
        else
        {
            System.out.println("Sorry, you lose. Better luck next time!");
        }
    }
}
