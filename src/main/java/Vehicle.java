public abstract class Vehicle {

    private String make;
    private String type;
    private String colour;
    private double price;
    Seats seats;
    Tyres tyres;
    Doors doors;




    public Vehicle(String make, String type, String colour, double price, Seats seats, Tyres tyres, Doors doors){
        this.make = make;
        this.type = type;
        this.colour = colour;
        this.price = price;
        this.seats = seats;
        this.tyres = tyres;
        this.doors = doors;
    }

    public String getMake(){
        return this.make;
    }


    public String getType() {
        return this.type;
    }

    public String getColour() {
        return this.colour;
    }

    public double getPrice() {
        return this.price;
    }
}
