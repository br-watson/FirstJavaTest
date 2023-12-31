package oopintro;


public class Person {
    private String name;
    private int age;
    private String hairColour;
    private double heightCM;
    public int weightKG;
    private static String latinName = "Homo Sapien";

    public Person() {
    }

    public Person(String name, int age, String hairColour, double heightCM) {
        setName(name);
        setAge(age);
        setHairColour(hairColour);
        setHeightCM(heightCM);
    }

    public String toString() {
        return "Hello, my name is " + name + " and I am " + age + " years old. My hair colour is " + hairColour + " and I am " + heightCM + "cm tall.";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("Invalid age given. Age must be between 0 and 120.");
        } else
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour.toLowerCase();
    }

    public double getHeightCM() {
        return heightCM;
    }

    public void setHeightCM(double heightCM) {
        this.heightCM = heightCM;
    }

    public static String getLatinName() {
        return latinName;
    }

    public static void setLatinName(String latinName) {
        Person.latinName = latinName;
    }
}

