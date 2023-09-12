package vehicles;

import java.util.List;
import java.util.ArrayList;

public class Garage {
    private final List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public String toString() {
        StringBuilder temp = new StringBuilder("Names of vehicles in garage: ");
        for (Vehicle vehicle : vehicles) {
            temp.append(vehicle.getBrandName());
            temp.append(", ");
        }
        return vehicles.toString() + "\n" + temp.substring(0, temp.length() - 2);
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.stream().noneMatch(vehicle1 -> vehicle1.getId() == vehicle.getId()))
            vehicles.add(vehicle);
        else
            System.out.println("This vehicle is already in the garage silly");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void emptyGarage() {
        vehicles.clear();
    }

    public void removeVehicleByID(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);
    }

    public double calculateTotalBill() {
        double total = 0d;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car)
                total += 1000d;
            else if (vehicle instanceof Plane)
                total += 1000000d;
            else
                total += 10d;
        }
        return total;
    }

    public void removeVehiclesByType(String type) {
        switch (type.toLowerCase()) {
            case "car":
                vehicles.removeIf(vehicle -> vehicle instanceof Car);
                break;
            case "plane":
                vehicles.removeIf(vehicle -> vehicle instanceof Plane);
                break;
            case "motorbike":
                vehicles.removeIf(vehicle -> vehicle instanceof Motorbike);
                break;
            default:
                System.out.println("Invalid type entered!");
                break;
        }
    }
}
