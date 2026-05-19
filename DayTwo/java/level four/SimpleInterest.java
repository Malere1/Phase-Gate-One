public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, 
double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest is: " + impleInterest);
    }
}

