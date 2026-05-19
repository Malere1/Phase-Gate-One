public class LargestOfThree {
    public static int largest(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 5;
        int largestNumber = largest(number1, number2, number3);
        System.out.println("The largest number is: " + largestNumber);
    }
}

