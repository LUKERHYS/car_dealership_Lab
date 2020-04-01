import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money){
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return this.money;
    }

    public void addMoney(double newAmount) {
        this.money += newAmount;
    }

    public int getOwnedVehicles() {
        return this.ownedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.ownedVehicles.add(vehicle);
    }


}
