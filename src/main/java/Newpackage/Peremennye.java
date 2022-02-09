package Newpackage;

public class Peremennye {

    public static void main(String[] args) {
        hello("wood");
        hello("user");
        hello("Yan");

      double len = 5;
        System.out.println("Area square with side " + 5 + " = " + area(len));
    }
    public static void hello (String someone) {

        System.out.println("Hello," + someone + "!");
    }

    public static double area (double l) {
        return l*l;

    }
}
