import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            
            System.out.println("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == number) {
                guessedCorrectly = true;
                System.out.println("Correct! You guessed the number!");
            } else if (guess < number) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        }

        scanner.close();
    }
}