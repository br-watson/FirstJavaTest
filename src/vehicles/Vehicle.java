package vehicles;

public class Vehicle {
    private int noOfWheels;
    private String name;
    private int noOfSeats;
    private int noOfDoors;

    public Vehicle(int noOfWheels, String name, int noOfSeats, int noOfDoors) {
        setName(name);
        setNoOfWheels(noOfWheels);
        setNoOfSeats(noOfSeats);
        setNoOfDoors(noOfDoors);
    }

    public String toString() {
        return "noOfWheels=" + noOfWheels +
                ", name='" + name + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", noOfDoors=" + noOfDoors + ", ";
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
