public class Car extends Vehicle{

    Engine engine;

    public Car(String make, String type, String colour, double price, Seats seats, Tyres tyres, Doors doors, Engine engine){
        super(make, type, colour, price, seats, tyres, doors);
        this.engine = engine;
    }
}
