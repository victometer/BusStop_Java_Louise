import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus testBus;
    private Person person1;
    private BusStop busStop1;

    @Before
    public void before(){
        testBus = new Bus("Linlithgow", 3);
        person1 = new Person();
        busStop1 = new BusStop("Edinburgh");
    }

    @Test
    public void hasDestination(){
        assertEquals("Linlithgow", testBus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, testBus.getCapacity());
    }

    @Test
    public void hasToStartEmpty(){
        assertEquals(0, testBus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        testBus.addPassenger(person1);
        assertEquals(1, testBus.getPassengerCount());
    }

    @Test
    public void canNotExceedCapacity(){
        testBus.addPassenger(person1);
        testBus.addPassenger(person1);
        testBus.addPassenger(person1);
        testBus.addPassenger(person1);
        assertEquals(3, testBus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        testBus.addPassenger(person1);
        testBus.removePassenger(person1);
        assertEquals(0, testBus.getPassengerCount());
    }

    @Test
    public void canPickUpPassengers(){
        busStop1.addPerson(person1);
        testBus.pickUpPassenger(busStop1);
        assertEquals(1, testBus.getPassengerCount());
        assertEquals(0, busStop1.getQCount());
    }


}
