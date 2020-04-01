public class Engine {

    private double capacity;
    private double emissions;
    private double volume;

    public Engine(double capacity, double emissions, double volume){
        this.capacity = capacity;
        this.emissions = emissions;
        this.volume = volume;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getEmissions() {
        return this.emissions;
    }

    public double getVolume() {
        return this.volume;
    }
}
