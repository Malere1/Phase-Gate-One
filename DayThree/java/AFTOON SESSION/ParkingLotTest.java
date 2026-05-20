import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions*;
public class ParkingLotTest {
    @Test
public void testParkingLot() {
assertEquals(20, parkingLot.availableSpaces);
for (int count = 0; count < 20; count++) {
assertEquals(0, parkingLot.slots[count]);
}
}
    @Test
public void testParkCar() {
parkingLot.parkCar(1);
assertEquals(19, parkingLot.availableSpaces);
assertEquals(1, parkingLot.slots[0]);
for (int count = 1; count < 20; count++) {
assertEquals(0, parkingLot.slots[count]);
}
}
    @Test
public void testParkCarAgain() {
parkingLot.parkCar(2);
assertEquals(18, parkingLot.availableSpaces);
assertEquals(1, parkingLot.slots[0]);
assertEquals(1, parkingLot.slots[1]);
for (int count = 2; count < 20; count++) {
assertEquals(0, parkingLot.slots[count]);
}
}
    @Test
public void testLeaveCar () {
parkingLot.parkCar(1);
parkingLot.leaveCar(1);
assertEquals(20, parkingLot.availableSpaces);
for (int count = 0; count < 20; count++) {
assertEquals(0, parkingLot.slots[count]);
}
}
}
