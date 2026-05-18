import java.util.Random;

public class RandomNumberGenerator {

public static void main(String[] args) {

Random rand = new Random();


int randomNumber = rand.nextInt(100) + 1;

System.out.println("Random Number: " + randomNumber);
 }
}

