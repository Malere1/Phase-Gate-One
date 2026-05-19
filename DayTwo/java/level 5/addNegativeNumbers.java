import java.util.ArrayList;
import java.util.List;

public class addNegativeNumbers {
    public static List<Double> addNegativeNumbers(List<Double> arr) {
        List<Double> result = new ArrayList<>();
        for (Double x : arr) {
            if (x < 0) {
                result.add(x);
            } else {
                result.add(0.0);
            }
        }
        return result;
    }
}

