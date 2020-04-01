public class ElectricCar extends Vehicle {

    Battery battery;


    public ElectricCar(String make, String type, String colour, double price, Seats seats, Tyres tyres, Doors doors, Battery battery){
            super(make, type, colour, price, seats, tyres, doors);
            this.battery = battery;
    }


}