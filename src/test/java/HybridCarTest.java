import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

        HybridCar hybridCar;
        Doors doors;
        Engine engine;
        Seats seats;
        Tyres tyres;
        Battery battery;


        @Before
        public void before(){
            doors = new Doors(4);
            engine = new Engine(2.0, 0.95, 80.00);
            seats = new Seats(5, "leather");
            tyres = new Tyres(4, 18.5);
            battery = new Battery(500, 300, 60);
            hybridCar = new HybridCar("Hyundai I30", "Hybrid", "Yellow", 10450, seats, tyres, doors, battery, engine);
        }


        @Test
        public void canGetMake(){
            assertEquals("Hyundai I30", hybridCar.getMake());
        }

        @Test
        public void canGetType(){
            assertEquals("Hybrid", hybridCar.getType());
        }

        @Test
        public void canGetColour(){
            assertEquals("Yellow", hybridCar.getColour());
        }

        @Test
        public void canPrice(){
            assertEquals(10450, hybridCar.getPrice(), 0.01);
        }

}

