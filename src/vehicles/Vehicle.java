package vehicles;

public abstract class Vehicle {
    private int noOfWheels;
    private String brandName;
    private int noOfSeats;
    private int noOfDoors;
    private static int count;
    private int id;

    public Vehicle(int noOfWheels, String brandName, int noOfSeats, int noOfDoors) {
        setBrandName(brandName);
        setNoOfWheels(noOfWheels);
        setNoOfSeats(noOfSeats);
        setNoOfDoors(noOfDoors);
        id = count;
        count++;
    }

    public String toString() {
        return "noOfWheels=" + noOfWheels +
                ", brandName='" + brandName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", noOfDoors=" + noOfDoors +
                ", ID=" + id + ", ";
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculateBill();
}
