public class Seats {

    private int numberOfSeats;
    private String material;

    public Seats(int numberOfSeats, String material){
        this.numberOfSeats = numberOfSeats;
        this.material = material;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String newMaterial) {
        this.material = newMaterial;
    }
}
