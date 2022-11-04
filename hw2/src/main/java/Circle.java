public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }
}
