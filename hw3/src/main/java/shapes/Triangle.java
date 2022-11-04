package shapes;

import interfaces.PrintableShape;
import interfaces.Shapeable;

public class Triangle implements Shapeable, PrintableShape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private boolean isTriangleExist(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return true;
        } else return a + b <= c || a + c <= b || b + c <= a;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void shapeInfo() {
        if (isTriangleExist(a, b, c)) {
            System.out.println("Triangle does not exist");
        } else
            System.out.println("Triangle area is: " + this.calculateArea()
                    + "\nTriangle perimeter is: " + this.calculatePerimeter());
    }
}
