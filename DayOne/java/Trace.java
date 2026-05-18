import java.util.Random;
import java.util.Scanner;
public class Trace {
public static void main(String[] args) {
Random rand = new Random();
int randomNumber = rand.nextInt(100) + 1;
Scanner scanner = new Scanner(System.in);
int attempts = 0;
String rating = "Better luck" 
for (int count = 0; count < 5; count++) {
System.out.println("Guess a number between 1 and 100:");
if (!scanner.hasNextInt()) {
System.out.println("Invalid input. Please enter a number.");
scanner.next(); i--; 
} else {
   int guess = scanner.nextInt();
attempts++;
if (guess == randomNumber) {
  rating = "Legendary";
      break;
} else if (attempts < 2) {
rating = "Excellent";
} else if (attempts <= 4) {
 rating = "Good";
} else {
rating = "Close!";
}
}
}
System.out.println("Rating: " + rating);
if (i == 4) {
System.out.println("Sorry, you didn't guess correctly. The number was " + randomNumber + ".");
        }
    }
}
    
