package vehicles;

public class Vehicle {
    private int noOfWheels;
    private String brandName;
    private int noOfSeats;
    private int noOfDoors;

    public Vehicle(int noOfWheels, String brandName, int noOfSeats, int noOfDoors) {
        setBrandName(brandName);
        setNoOfWheels(noOfWheels);
        setNoOfSeats(noOfSeats);
        setNoOfDoors(noOfDoors);
    }

    public String toString() {
        return "noOfWheels=" + noOfWheels +
                ", name='" + brandName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", noOfDoors=" + noOfDoors + ", ";
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
