import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        double tax = price * 0.10;
        double total = price + tax;

        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}

