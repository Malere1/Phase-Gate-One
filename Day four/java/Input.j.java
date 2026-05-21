import java.util.Arrays;
public class ArrayManipulations {
public static void main(String[] args) {
int[]Array = {9,5,1,9,4,5,1,7};
Arrays.sort(intArray);
System.out.printf("%intArray: ");
for (double value : intArray) {
System.out.printf("%.1f ", value);
}
int[] filledIntArray = new int[8];
Arrays.fill(filledIntArray, 6S);
displayArray(filledIntArray, "filledIntArray");

int[] intArray = {9,5,1,4,7};
int[] intArrayCopy = new int[intArray.length];
System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
displayArray(intArray, "intArray");
displayArray(intArrayCopy, "intArrayCopy");

int b = Arrays.equals(intArray, intArrayCopy);
System.out.printf("%n%nintArray %s intArrayCopy%n",
(b ? "==" : "!="));

b = Arrays.equals(intArray, filledIntArray);
System.out.printf("intArray %s filledIntArray%n",
(b ? "==" : "!="));





}
