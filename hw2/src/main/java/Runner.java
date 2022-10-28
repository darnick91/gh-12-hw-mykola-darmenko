import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the type of figure: ");

        switch (sc.nextLine()) {
            case "Circle":
                System.out.println("Please enter radius: ");
                Shape circle = new Circle(sc.nextDouble());
                circle.showInfo();
                break;
            case "Square":
                System.out.println("Please enter side: ");
                double side = sc.nextDouble();
                Shape square = new Square(side);
                Shape triangleOfSquare = new Triangle(side, side, Math.sqrt(side * side + side * side));
                square.showInfo();
                triangleOfSquare.showInfo();
                break;
            case "Rectangle":
                System.out.println("Please enter width: ");
                double width = sc.nextDouble();
                System.out.println("Please enter height: ");
                double height = sc.nextDouble();
                Shape rectangle = new Rectangle(width, height);
                Shape triangleOfRectangle = new Triangle(width, height, Math.sqrt(width * width + height * height));
                rectangle.showInfo();
                triangleOfRectangle.showInfo();
                break;
            case "Triangle":
                System.out.println("Please enter side 'a': ");
                double a = sc.nextDouble();
                System.out.println("Please enter side 'b': ");
                double b = sc.nextDouble();
                System.out.println("Please enter side 'c': ");
                double c = sc.nextDouble();
                if (a + b > c && a + c > b && b + c > a) {
                    Shape triangle = new Triangle(a, b, c);
                    triangle.showInfo();
                } else System.out.println("Triangle does not exist");
                break;
        }
    }
}
