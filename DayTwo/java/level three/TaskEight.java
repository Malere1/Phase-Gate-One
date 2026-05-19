import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter numbers (enter 0 to stop): ");
        while(true) {
            int num = scanner.nextInt();
            if(num == 0) break;
            sum += num;
        }
        System.out.println("The total is: " + sum);
    }
}

