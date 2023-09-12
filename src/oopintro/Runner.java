package oopintro;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        Person brad = new Person();
//        System.out.println(brad.toString());
//        brad.setAge(23);
//        brad.setHairColour("brown");
//        brad.setName("Brad");
//        brad.setHeightCM(51012);
//        System.out.println(brad.toString());
//
//        Person brad2 = new Person("Brad", 23, "brown", 503210);
//        System.out.println(brad2.toString());
//        System.out.println(Person.getLatinName());
//        Person.setLatinName("Homo Sapien :)");
//        System.out.println(Person.getLatinName());
//        System.out.println(brad2.weightKG);
//
//        System.out.println(brad2);

//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("Brad", 23, "brown", 503210));
//        personList.add(new Person("Joe", 29, "blue", 100));
//        personList.add(new Person("John", 30, "black", 200));
//        personList.add(new Person("Alex", 111, "blonde", 909));
//
//        for (int i = 0; i < personList.size(); i++) {
//            System.out.println(personList.get(i).toString());
//        }
//        System.out.println("----------");
//        for (Person person : personList) {
//            System.out.println(person.toString());
//        }


        System.out.println(DigitAdder(74));
        System.out.println(IntToString(74));


    }

    public static String IntToString(int num) {
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (num == 0)
            return digits[0];
        else if (num < 0)
            return "minus " + IntToString(-num);
        else if (num < 20)
            return digits[num];
        else if (num < 100)
            return tens[num / 10] + " " + digits[num % 10];
        else if (num < 1000)
            return digits[num / 100] + " hundred and " + IntToString(num % 100);
        else if (num < 10000)
            return digits[num / 1000] + " thousand, " + IntToString(num % 1000);
        else
            return "Number too large cba";
    }

    public static int DigitAdder(int num) {
        int result = 0;
        String numString = Integer.toString(num);
        for (int i = 0; i < numString.length(); i++) {
            result += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return result;
    }
}
