package shapes;

import interfaces.PrintableShape;
import interfaces.Shapeable;

public class Circle implements Shapeable, PrintableShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public void shapeInfo() {
        System.out.println("Circle area is: " + this.calculateArea()
                + "\nCircle perimeter is: " + this.calculatePerimeter());
    }
}
