public class Square extends Shape {

    protected final double side;

    public Square(double side) {
        this.side = side;
    }

    public void showAdditionalInfo() {
        Shape triangle = new Triangle(side, side, Math.sqrt(side * side + side * side));
        triangle.showInfo();
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
