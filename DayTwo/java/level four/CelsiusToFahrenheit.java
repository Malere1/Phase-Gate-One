public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + 
fahrenheit + " degrees Fahrenheit");
    }
}

