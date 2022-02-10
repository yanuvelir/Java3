package Newpackage;

public class Peremennye {

    public static void main(String[] args) {
        hello("wood");
        hello("user");
        hello("Yan");

      double len = 5;
        System.out.println("Area of square with side " + 5 + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Area of rectangle with sides " + a + " и " + b + " = " + area(a, b));
    }
    public static void hello (String someone) {

        System.out.println("Hello," + someone + "!");
    }

    public static double area (double l) {
        return l*l;

    }

    public static double area (double a, double b) {
        return a * b;

    }
}
