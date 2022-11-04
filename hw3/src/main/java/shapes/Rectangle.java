package shapes;

import interfaces.PrintableShape;
import interfaces.Shapeable;

public class Rectangle implements Shapeable, PrintableShape {

    private final double width;
    private final double height;
    private final Triangle triangle;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.triangle = new Triangle(width, height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void shapeInfo() {
        System.out.println("Rectangle area is: " + this.calculateArea()
                + "\nRectangle perimeter is: " + this.calculatePerimeter());
        System.out.println("Triangle area is: " + triangle.calculateArea()
                + "\nTriangle perimeter is: " + triangle.calculatePerimeter());
    }
}
