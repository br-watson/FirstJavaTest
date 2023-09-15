package vehicles;


public class Runner {
    public static void main(String[] args) {
        Car c = new Car(4, "Ferrari", 2, 2, true);
        Motorbike m = new Motorbike(2, "Honda", 2, 0, false);
        Plane p = new Plane(6, "Boeing", 150, 4, false);
        Plane p2 = new Plane(6, "Airbus", 121, 5, false);

//        System.out.println(c);
//        System.out.println(m);
//        System.out.println(p);
//
//        c.setBrandName("BMW");
//        m.setHasSidecar(true);
//        p.setNoOfSeats(200);
//
//        System.out.println("\n\n" + c);
//        System.out.println(m);
//        System.out.println(p);

        Garage garage = new Garage();
        garage.addVehicle(c);
        garage.addVehicle(m);
        garage.addVehicle(p);
        garage.addVehicle(p2);

        garage.garageTextInterface();


        //
//        garage.removeVehicleByID(5);
//        System.out.println(garage.getVehicleByID(2).toString());


//        System.out.println(garage.calculateTotalBill());
//        System.out.println(garage.toString());
//        garage.emptyGarage();
//        System.out.println(garage.toString());
//        garage.removeVehicle(m);
//        System.out.println(garage.toString());
//        garage.removeVehicleByID(2);
//        System.out.println(garage.toString());
//        System.out.println(garage.calculateTotalWorth());
//        System.out.println(garage.toString());
//        garage.removeVehiclesByType("Plane");
//        System.out.println(garage.toString());
//        Plane p = new Plane(6, "Airbus", 121, 5, false);
//        BirdFlyable b = new BirdFlyable();
//        Flyable[] flyables = {p, b};
//        for (Flyable f : flyables)
//            f.fly();
//
//        Shed<Car> shed = new Shed<>();
//        shed.addVehicle(new Car(4, "Ferrari", 2, 2, true));
//        System.out.println(shed.getVehicles().get(0).toString());
//        shed.addVehicle(new Car(4, "Ferrari", 2, 2, false));
//        System.out.println(shed.getVehicles());
//
//        Shed<Vehicle> shed2 = new Shed<>();
//        shed2.addVehicle(new Car(4, "Ferrari", 2, 2, true));
//        shed2.addVehicle(new Plane(4, "Boeing", 150, 4, false));
//        System.out.println(shed2.getVehicles());

    }
}
