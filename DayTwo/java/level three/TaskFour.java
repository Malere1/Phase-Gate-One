import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        for (int count = 1; count <= 10; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }
    }
}

