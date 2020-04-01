public class Tyres {

    private int numberOfTyres;
    private double diameter;

    public Tyres(int numberOfTyres, double diameter){
        this.numberOfTyres = numberOfTyres;
        this.diameter = diameter;
    }

    public int getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public double getDiameterOfTyres() {
        return this.diameter;
    }
}
