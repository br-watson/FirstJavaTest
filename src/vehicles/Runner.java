package vehicles;


public class Runner {
    public static void main(String[] args) {
        Car c = new Car(4, "Ferrari", 2, 2, true);
        Motorbike m = new Motorbike(2, "Honda", 2, 0, false);
        Plane p = new Plane(6, "Boeing", 150, 4, false);

        System.out.println(c);
        System.out.println(m);
        System.out.println(p);

        c.setBrandName("BMW");
        m.setHasSidecar(true);
        p.setNoOfSeats(200);

        System.out.println("\n\n" + c);
        System.out.println(m);
        System.out.println(p);
    }
}
