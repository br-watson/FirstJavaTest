package vehicles;

public class Car extends Vehicle {
    private boolean convertible;

    public Car(int noOfWheels, String name, int noOfSeats, int noOfDoors) {
        super(noOfWheels, name, noOfSeats, noOfDoors);
    }

    public Car(int noOfWheels, String name, int noOfSeats, int noOfDoors, boolean convertible) {
        super(noOfWheels, name, noOfSeats, noOfDoors);
        this.convertible = convertible;
    }


    public String toString() {
        return "Car {" +
                super.toString() +
                "convertible=" + convertible +
                '}';
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


}
