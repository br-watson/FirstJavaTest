package Exceptions;

import vehicles.*;
import vehicles.Garage;

public class Runner {

    public static void main(String[] args) {
        Car c = new Car(4, "Ferrari", 2, 2, true);
        Motorbike m = new Motorbike(2, "Honda", 2, 0, false);
        Plane p = new Plane(6, "Boeing", 150, 4, false);
        Plane p2 = new Plane(6, "Airbus", 121, 5, false);
        Garage g = new Garage();

        g.addVehicle(c);
        g.addVehicle(m);
        g.addVehicle(p);
        g.addVehicle(p2);

        g.removeVehicleByID(5);
        System.out.println(g.getVehicleByID(2).toString());

    }
}
