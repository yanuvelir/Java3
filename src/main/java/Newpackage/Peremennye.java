package Newpackage;

public class Peremennye {

    public static void main(String[] args) {
        hello("wood");
        hello("user");
        hello("Yan");

        Square s = new Square(5);
        System.out.println("Area of square with side " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area of rectangle with sides " + r.a + " и " + r.b + " = " + area(r));
    }
    public static void hello (String someone) {

        System.out.println("Hello," + someone + "!");
    }

    public static double area (Square s) {
        return s.l * s.l;

    }

    public static double area (Rectangle r) {
        return r.a * r.b;

    }
}
