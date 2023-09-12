package vehicles;

public class Motorbike extends Vehicle {
    private boolean hasSidecar;

    public Motorbike(int noOfWheels, String brandName, int noOfSeats, int noOfDoors) {
        super(noOfWheels, brandName, noOfSeats, noOfDoors);
    }

    public Motorbike(int noOfWheels, String name, int noOfSeats, int noOfDoors, boolean hasSidecar) {
        super(noOfWheels, name, noOfSeats, noOfDoors);
        this.hasSidecar = hasSidecar;
    }


    public String toString() {
        return "Motorbike {" +
                super.toString() +
                "hasSidecar=" + hasSidecar +
                '}';
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public double calculateBill() {
        return 10d;
    }
}
