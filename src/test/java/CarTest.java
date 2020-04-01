import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Doors doors;
    Engine engine;
    Seats seats;
    Tyres tyres;


    @Before
    public void before() {
        doors = new Doors(4);
        engine = new Engine(2.0, 0.95, 80.00);
        seats = new Seats(5, "leather");
        tyres = new Tyres(4, 18.5);
        car = new Car("Renault Clio", "Petrol", "Grey", 6250, seats, tyres, doors, engine);
    }


    @Test
    public void canGetMake() {
        assertEquals("Renault Clio", car.getMake());
    }

    @Test
    public void canGetType() {
        assertEquals("Petrol", car.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Grey", car.getColour());
    }

    @Test
    public void canPrice() {
        assertEquals(6250, car.getPrice(), 0.01);
    }

}
