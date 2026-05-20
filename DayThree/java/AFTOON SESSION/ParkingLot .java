public class ParkingLot {
private int[] slots = new int[20]; 
for (int count = 0; count < 20; count++) {
slots[count] = 0;
}
availableSpaces = 20;
}
public void parkCar(int slotNumber) {
if (slotNumber >= 1 && slotNumber <= 20) {
if (slots[slotNumber - 1] == 0) { 
slots[slotNumber - 1] = 1; 
availableSpaces--;
System.out.println(slotNumber);
 } else {
System.out.println(slotNumber);
} else {
 System.out.println();
}
}
public void leaveCar(int slotNumber) {
if (slotNumber >= 1 && slotNumber <= 20) {
if (slots[slotNumber - 1] == 1) { 
slots[slotNumber - 1] = 0; 
availableSpaces++;
System.out.println("Car left from slot " + slotNumber);
}
}


