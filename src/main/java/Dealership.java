import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> carStock;

    public Dealership(double till){
        this.till = till;
        this.carStock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return this.till;
    }

    public void addToTill(double amount) {
        this.till += amount;
    }

    public int getCarStock() {
        return this.carStock.size();
    }

    public void addCarToStock(Vehicle vehicle) {
        this.carStock.add(vehicle);
    }
}
