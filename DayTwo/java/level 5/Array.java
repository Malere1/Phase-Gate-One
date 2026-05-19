import java.util.ArrayList;
import java.util.List;

public class Array{public static List<Integer> getPrimeNumbers(int[] array) {List<Integer> primeNumbers = new ArrayList<>();

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

    private static List<Integer> sorted(List<Integer> list) {
        java.util.Collections.sort(list);
        return list;
    }
}

