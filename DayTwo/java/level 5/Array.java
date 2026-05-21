import java.util.List;

public class getPrimeNumbers(int[] array) {

        for (int number : array) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        return sorted(primeNumbers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int count = 2; count * count <= number;counti++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
 {
        java.util.Collections.sort(list);
        return list;
    }
}

