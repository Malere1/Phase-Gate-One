import java.util.ArrayList;
public class Positive {
public static void main(String[] args) {
int[] array = {9, 5, 1, 9, 4, 5, 1, 7};
ArrayList<Integer> result = item(array);
System.out.println(result);
    }
public static ArrayList<Integer> item(int[] array) {
ArrayList<Integer> items = new ArrayList<>();
for (int index = 0; index < array.length; index++) {
for (int count = index + 1; count < array.length; count++) {
if (array[index] == array[count]) {
if (!items.contains(array[index])) {
   items.add(array[index]);
}
}
}
 }

 return items;
    }
}
