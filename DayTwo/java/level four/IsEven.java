public class IsEven {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number= 4;
        if (isEven(number)) {
            System.out.println(number+ " is even");
        } else {
            System.out.println(number + " is not even");
        }
    }
}

