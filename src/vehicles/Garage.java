package vehicles;

import java.util.List;
import java.util.ArrayList;
import java.util.PrimitiveIterator;
import java.util.Scanner;

import Exceptions.VehicleNotFoundException;

public class Garage {
    private final List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    private static int getInt(Scanner scanner, String message) {
        System.out.print(message);
        int result;
        try {
            result = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.out.println("Invalid input");
            return getInt(scanner, message);
        }
        return result;
    }

    public void garageTextInterface() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        int option;
        while (running) {
            System.out.println("(1) Show all vehicles. \n(2) Add Vehicle. \n(3) Remove vehicle. \n(4) Calculate total bill. \n(5) Empty garage. \n(6) Exit.");
            option = getInt(scanner, "Enter your option: ");
            switch (option) {
                case 1:
                    System.out.println(toString());
                    break;
                case 2:
                    System.out.println("Choose the type of vehicle you want to add: ");
                    System.out.println("(1) Car. \n(2) Motorbike. \n(3) Plane. \n(4) Exit.");
                    int type = getInt(scanner, "Enter your option: ");
                    if (type == 4)
                        break;
                    System.out.print("Enter brand name: ");
                    String brandName = scanner.next();
                    int noOfWheels = getInt(scanner, "Enter number of wheels: ");
                    int noOfSeats = getInt(scanner, "Enter number of seats: ");
                    int noOfDoors = getInt(scanner, "Enter number of doors: ");
                    switch (type) {
                        case 1:
                            boolean conv;
                            System.out.print("Convertible? (y/n): ");
                            String convertible = scanner.next();
                            if (convertible.equals("y"))
                                conv = true;
                            else
                                conv = false;
                            addVehicle(new Car(noOfWheels, brandName, noOfSeats, noOfDoors, conv));
                            break;
                        case 2:
                            Vehicle motorbike = new Motorbike(noOfWheels, brandName, noOfSeats, noOfDoors);
                            addVehicle(motorbike);
                            break;
                        case 3:
                            Vehicle plane = new Plane(noOfWheels, brandName, noOfSeats, noOfDoors);
                            addVehicle(plane);
                            break;
                    }
                    break;
                case 3:
                    int id = getInt(scanner, "Enter ID of vehicle to remove: ");
                    try {
                        removeVehicleByID(id);
                    } catch (VehicleNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Total bill: " + calculateTotalBill());
                    break;
                case 5:
                    emptyGarage();
                    System.out.println("Garage emptied!");
                    break;
                case 6:
                    running = false;
                    break;
            }
            System.out.println("Press enter to continue...");
            try {
                System.in.read();
            } catch (Exception ignored) {
            }
        }
        scanner.close();
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

    public void removeVehicleByID(int id) throws VehicleNotFoundException {
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                vehicles.remove(vehicle);
                found = true;
            }
        }
        if (!found)
            throw new VehicleNotFoundException("Vehicle not found");
    }

//    public double calculateTotalBill() {
//        double total = 0d;
//        for (Vehicle vehicle : vehicles) {
//            if (vehicle instanceof Car)
//                total += 1000d;
//            else if (vehicle instanceof Plane)
//                total += 1000000d;
//            else
//                total += 10d;
//        }
//        return total;
//    }

    public double calculateTotalBill() {
        double total = 0d;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calculateBill();
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

    public Vehicle getVehicleByID(int id) throws VehicleNotFoundException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id)
                return vehicle;
        }
        throw new VehicleNotFoundException("Vehicle not found");
    }
}
