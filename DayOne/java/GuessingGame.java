import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
public static void main(String[] args) {
Random rand = new Random();
int randomNumber = rand.nextInt(100) + 1;
Scanner scanner = new Scanner(System.in);
for (int count = 0; count < 5; count++) {
System.out.println("Guess a number between 1 and 100:");
int guess = scanner.nextInt();
if (guess == randomNumber) {
System.out.println(" Congratulations! You guessed correctly.");
                break;
} else if (guess > randomNumber) {
 System.out.println("Your guess is too high. Try again");
     } else {
System.out.println("Your guess is too low. Try again");
}
}
if (count == 4) {
System.out.println("Sorry, you didn't guess correctly. The 
number was " + randomNumber + ".");
        }
    }
}


