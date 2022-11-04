public class Rectangle extends Shape {

    private final double width;
    private final double height;
    private final Triangle triangle;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.triangle = new Triangle(width, height);
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
        System.out.println(triangle);
    }
}
