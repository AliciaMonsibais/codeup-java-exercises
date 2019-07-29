import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class MethodsExercises {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(addition(5, 3));
//        System.out.println(subtraction(2, 1));
//        System.out.println(multiply(5, 3));
//        System.out.println(division(15, 3));
//        System.out.println(getInteger(1, 10));
//        System.out.println(modulus(2, 1));
//        getFactorial();
        roll();
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }


    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10.");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber > max || inputNumber < min) {
            inputNumber = getInteger(min, max);
        }
        return inputNumber;
    }


    public static void getFactorial() {
        int num = getInteger(1, 10);
        String output = "";
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
            output += i + "! = "+ (total) + "\n";
        }
        System.out.println(output);
    }

    public static void roll() {
        int sides = 10;
        int die1 = (int) (Math.random() * sides) + 1;
        int die2 = (int) (Math.random() * sides) + 1;
        System.out.println("1st die = " + die1);
        System.out.println("2nd die =" + die2);

    }
}
