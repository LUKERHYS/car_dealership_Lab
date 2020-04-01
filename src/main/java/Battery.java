public class Battery {

    private double weight;
    private double range;
    private double kWh;

    public Battery(double weight, double range, double kWh){
        this.weight = weight;
        this.range = range;
        this.kWh = kWh;
    }


    public double getWeight() {
        return this.weight;
    }

    public double getRange() {
        return this.range;
    }
    
    public double getKWh(){
        return this.kWh;
    }
    
}
