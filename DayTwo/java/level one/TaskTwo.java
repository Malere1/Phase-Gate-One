import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int currentAge = scanner.nextInt();

        int futureAge = currentAge + 5;
        System.out.println("You will be " + futureAge + " years old in 5 years.");
    }
}

