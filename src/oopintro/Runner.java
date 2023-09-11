package oopintro;

public class Runner {
    public static void main(String[] args) {
        Person brad = new Person();

        System.out.println(brad.introduce());
        brad.setAge(23);
        brad.setHairColour("brown");
        brad.setName("Brad");
        brad.setHeightCM(51012);
        System.out.println(brad.introduce());

        Person brad2 = new Person("Brad", 23, "brown", 503210);
        System.out.println(brad2.introduce());
        System.out.println(Person.getLatinName());
        Person.setLatinName("HomoSapien");
        System.out.println(Person.getLatinName());
        System.out.println(brad2.weightKG);
    }
}
