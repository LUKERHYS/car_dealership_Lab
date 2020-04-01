public class HybridCar extends Vehicle {
    Battery battery;
    Engine engine;


    public HybridCar(String make, String type, String colour, double price, Seats seats, Tyres tyres, Doors doors, Battery battery, Engine engine){
        super(make, type, colour, price, seats, tyres, doors);
        this.battery = battery;
        this.engine = engine;
    }

}
