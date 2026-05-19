public class IsPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int count = 2; count * count <= number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 7;
    System.out.println(number+ " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

