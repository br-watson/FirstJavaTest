package VariablesExercise;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
//        String firstName = "Brad";
//        String lastName = "Watson";
//        String name = firstName + " " + lastName;
//        System.out.println(name);


//        int num1 = 2, num2 = 5;
//        System.out.println(num1 + num2);
//        double result =  (double)num2/num1;
//        System.out.println(result);
//
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!\n");

        System.out.print("Please input an integer:");
        int num1 = scanner.nextInt();
        System.out.print("Please input another integer:");
        int num2 = scanner.nextInt();
        System.out.println("Sum = " + (num1+num2));


    }
}
