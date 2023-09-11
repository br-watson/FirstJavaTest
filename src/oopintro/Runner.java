package oopintro;

public class Runner {
    public static void main(String[] args) {
        Person brad = new Person();

        System.out.println(brad.introduce());
        brad.setAge(23);
        brad.setHairColour("brown");
        brad.setName("Brad");
        brad.setHeightCM(182.5);
        System.out.println(brad.introduce());
    }
}
