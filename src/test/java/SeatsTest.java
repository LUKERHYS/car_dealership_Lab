import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatsTest {

    Seats seats;

    @Before
    public void before(){
        seats = new Seats(5, "leather");
    }

    @Test
    public void canGetNumberOfSeats(){
        assertEquals(5, seats.getNumberOfSeats());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("leather", seats.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        seats.setMaterial("nylon");
        assertEquals("nylon", seats.getMaterial());
    }
}
