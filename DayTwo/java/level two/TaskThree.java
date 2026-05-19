import java.util.Scanner;

public class TaskTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("Sorry, you failed.");
        }
    }
}

