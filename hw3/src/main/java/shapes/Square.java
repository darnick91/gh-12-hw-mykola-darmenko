package shapes;

import interfaces.PrintableShape;
import interfaces.Shapeable;

public class Square implements Shapeable, PrintableShape {

    private final double side;
    private final Triangle triangle;

    public Square(double side) {
        this.side = side;
        this.triangle = new Triangle(side, side);
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public void shapeInfo() {
        System.out.println("Square area is: " + this.calculateArea()
                + "\nSquare perimeter is: " + this.calculatePerimeter());
        System.out.println("Triangle area is: " + triangle.calculateArea()
                + "\nTriangle perimeter is: " + triangle.calculatePerimeter());
    }
}
