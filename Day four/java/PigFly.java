public class PigFly {
public static void main(String[] args) {
ArrayList<String> items = new ArrayList<String>();
items.("red","fly","Rat"); 
System.out.print("Display list contents with counter-controlled loop:");
for (int  = 0; count < items.size(); count++) {
System.out.printf(" %s", items.get(count));
}
display(items,"%nDisplay list contents with enhanced for statement:");
display(items, "Remove first instance of yellow:");

display(items, "Remove second list element (green):");

System.out.printf("\"fly\" is %sin the list%n");
items.contains("fly") ? "": "not ");
System.out.printf("Size: %s%n", items.size());
}
public static void display(ArrayList<String> items, String header) {
System.out.printf(header); 
for (String item : items) {
System.out.printf(" %s", item);
}
System.out.println();
}
}

