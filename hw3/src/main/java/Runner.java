import shapes.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the type of figure: ");

        TypeOfShape type = getTypeOfShape();

        switch (type) {
            case CIRCLE:
                System.out.println("Please enter radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                circle.shapeInfo();
                break;
            case SQUARE:
                System.out.println("Please enter side: ");
                double side = sc.nextDouble();
                Square square = new Square(side);
                square.shapeInfo();
                break;
            case RECTANGLE:
                System.out.println("Please enter width: ");
                double width = sc.nextDouble();
                System.out.println("Please enter height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.shapeInfo();
                break;
            case TRIANGLE:
                System.out.println("Please enter side 'a': ");
                double a = sc.nextDouble();
                System.out.println("Please enter side 'b': ");
                double b = sc.nextDouble();
                System.out.println("Please enter side 'c': ");
                double c = sc.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                triangle.shapeInfo();
                break;
        }
        sc.close();
    }

    private static TypeOfShape getTypeOfShape() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim().toUpperCase();
        try {
            return TypeOfShape.valueOf(line);
        } catch (IllegalArgumentException e) {
            System.out.println("The shape of the figure is not entered correctly. Try entering again.");
            return getTypeOfShape();
        }
    }
}
