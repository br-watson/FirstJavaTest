package VariablesExercise;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please input an integer: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Please input another integer: ");
//        int num2 = scanner.nextInt();
//        System.out.println("The bigger number is " + (Math.max(num1, num2)));
//
//        System.out.print("Please input an integer: ");
//        int num3 = scanner.nextInt();
//        System.out.println("Your number is " + (num3 % 2 == 0 ? "even" : "odd"));
//
//        System.out.println("Input a traffic light colour: ");
//        String color = scanner.next();
//        switch (color) {
//            case "red":
//                System.out.println("Stop!");
//                break;
//            case "yellow":
//                System.out.println("Slow down!");
//                break;
//            case "green":
//                System.out.println("Go!");
//                break;
//            default:
//                System.out.println("Invalid colour");
//        }

//        System.out.println("Input a number between 1 and 12: ");
//        int month = scanner.nextInt();
//        switch (month) {
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            case 12:
//                System.out.println("Winter");
//                break;
//            default:
//                System.out.println("Invalid month");
//        }

        System.out.println("Input a number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input another number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Input an operation: ");
        String op = scanner.next();
        System.out.print("Result: ");

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
