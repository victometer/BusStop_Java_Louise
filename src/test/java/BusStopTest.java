import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop1;
    private Person person1;

    @Before
    public void before(){
        busStop1 = new BusStop("Edinburgh");
        person1 = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Edinburgh", busStop1.getName());
    }
    @Test
    public void qStartsEmpty(){
        assertEquals(0, busStop1.getQCount());
    }
    @Test
    public void canAddToQ(){
        busStop1.addPerson(person1);
        assertEquals(1, busStop1.getQCount());
    }
    @Test
    public void canRemoveFromQ(){
        busStop1.addPerson(person1);
        Person person1 = busStop1.removePerson();
        assertEquals(0, busStop1.getQCount());
        assertEquals(Person.class, person1.getClass());
    }
}
