public abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();

    abstract void showInfo();

    public String toString() {
        return this.getClass().getName() + " area is: " + this.calculateArea()
                + "\n" + this.getClass().getName() + " perimeter is: " + this.calculatePerimeter();
    }

}
