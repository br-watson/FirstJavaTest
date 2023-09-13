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
        System.out.println(garage.calculateTotalBill());
//        System.out.println(garage.toString());
//        garage.emptyGarage();
//        System.out.println(garage.toString());
//        garage.removeVehicle(m);
//        System.out.println(garage.toString());
//        garage.removeVehicleByID(2);
//        System.out.println(garage.toString());
//        System.out.println(garage.calculateTotalWorth());
        System.out.println(garage.toString());
        garage.removeVehiclesByType("Plane");
        System.out.println(garage.toString());

        p.fly();

        BirdFlyable b = new BirdFlyable();
        b.fly();

    }
}
