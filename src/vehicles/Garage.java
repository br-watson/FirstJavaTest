package vehicles;

import java.util.List;
import java.util.ArrayList;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public String toString() {
        return vehicles.toString();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
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
}
