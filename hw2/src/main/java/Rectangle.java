public class Rectangle extends Shape {

    protected final double width;
    protected final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void showAdditionalInfo() {
        Shape triangle = new Triangle(width, height, Math.sqrt(width * width + height * height));
        triangle.showInfo();
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width + height) * 2;
    }
}
