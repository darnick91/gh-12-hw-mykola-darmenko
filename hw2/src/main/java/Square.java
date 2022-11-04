public class Square extends Shape {

    private final double side;
    private final Triangle triangle;

    public Square(double side) {
        this.side = side;
        this.triangle = new Triangle(side, side);
    }


    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
        System.out.println(triangle);
    }
}
