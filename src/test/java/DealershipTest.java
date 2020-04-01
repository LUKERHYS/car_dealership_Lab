import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Seats seats;
    Tyres tyres;
    Doors doors;
    Battery battery;
    Engine engine;
    ElectricCar electricCar;
    Car car;

    @Before
    public void before(){
        seats = new Seats(5, "leather");
        tyres = new Tyres(4, 18.5);
        doors = new Doors(4);
        battery = new Battery(540, 300, 60);
        engine = new Engine(2.0, 0.95, 80.00);
        electricCar = new ElectricCar("Tesla Model S", "Electric", "White", 50000, seats, tyres, doors, battery);
        car = new Car("Renault Clio", "Petrol", "Grey", 6250, seats, tyres, doors, engine);
        dealership = new Dealership(450000);
        dealership.addCarToStock(electricCar);
        dealership.addCarToStock(car);
    }

    @Test
    public void canGetNumberOfCars(){
        assertEquals(2, dealership.getCarStock());
    }

    @Test
    public void canAddCarToStock(){
        dealership.addCarToStock(car);
        assertEquals(3, dealership.getCarStock());
    }
}
