import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Seats seats;
    Tyres tyres;
    Doors doors;
    Battery battery;
    Engine engine;
    ElectricCar electricCar;
    Car car;

    @Before
    public void setUp(){
        customer = new Customer(50000);
        seats = new Seats(5, "leather");
        tyres = new Tyres(4, 18.5);
        doors = new Doors(4);
        battery = new Battery(540, 300, 60);
        engine = new Engine(2.0, 0.95, 80.00);
        electricCar = new ElectricCar("Tesla Model S", "Electric", "White", 50000, seats, tyres, doors, battery);
        car = new Car("Renault Clio", "Petrol", "Grey", 6250, seats, tyres, doors, engine);
    }

    @Test
    public void ownedVehiclesStartAt0(){
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void canGetMoney(){
        assertEquals(50000, customer.getMoney(), 0.01);
    }

    @Test
    public void canSetMoney(){
        customer.addMoney(1);
        assertEquals(50001, customer.getMoney(), 0.01);
    }

    @Test
    public void canBuyCar(){
        customer.addVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
    }

}
