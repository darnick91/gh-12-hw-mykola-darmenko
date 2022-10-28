public abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void showInfo() {
        System.out.println(this);
    }

    public String toString() {
        return this.getClass().getName() + " area is: " + this.calculateArea()
                + "\n" + this.getClass().getName() + " perimeter is: " + this.calculatePerimeter();
    }

}
