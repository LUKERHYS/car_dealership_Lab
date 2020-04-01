import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Seats seats;
    Tyres tyres;
    Doors doors;
    Battery battery;


    @Before
    public void before() {
        seats = new Seats(5, "leather");
        tyres = new Tyres(4, 18.5);
        doors = new Doors(4);
        battery = new Battery(540, 300, 60);
        electricCar = new ElectricCar("Tesla Model S", "Electric", "White", 50000, seats, tyres, doors, battery);
    }


    @Test
    public void canGetMake() {
        assertEquals("Tesla Model S", electricCar.getMake());
    }

    @Test
    public void canGetType() {
        assertEquals("Electric", electricCar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("White", electricCar.getColour());
    }

    @Test
    public void canPrice() {
        assertEquals(50000, electricCar.getPrice(), 0.01);
    }

}