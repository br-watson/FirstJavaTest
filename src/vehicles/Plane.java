package vehicles;

public class Plane extends Vehicle implements Flyable {
    public boolean hasPropellor;


    public Plane(int noOfWheels, String brandName, int noOfSeats, int noOfDoors) {
        super(noOfWheels, brandName, noOfSeats, noOfDoors);
    }

    public Plane(int noOfWheels, String brandName, int noOfSeats, int noOfDoors, boolean hasPropellor) {
        super(noOfWheels, brandName, noOfSeats, noOfDoors);
        this.hasPropellor = hasPropellor;
    }


    public String toString() {
        return "Plane {" +
                super.toString() +
                "hasPropellor=" + hasPropellor +
                '}';
    }

    public boolean getHasPropellor() {
        return hasPropellor;
    }

    public void setHasPropellor(boolean hasPropellor) {
        this.hasPropellor = hasPropellor;
    }

    public double calculateBill() {
        return 1000000d;
    }

    public void fly() {
        System.out.println("       __|__\n" +
                "--@--@--(_)--@--@--");
    }
}
