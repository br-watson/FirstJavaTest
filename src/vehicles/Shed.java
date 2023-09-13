package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Shed<T extends Vehicle> {
    private final List<T> storage;

    public Shed() {
        storage = new ArrayList<>();
    }

    public void addVehicle(T vehicle) {
        storage.add(vehicle);
    }

    public List<T> getVehicles() {
        return storage;
    }

}
