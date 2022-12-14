import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the type of figure: ");

        switch (sc.nextLine()) {
            case "Circle":
                System.out.println("Please enter radius: ");
                double radius = sc.nextDouble();
                Shape circle = new Circle(radius);
                circle.showInfo();
                break;
            case "Square":
                System.out.println("Please enter side: ");
                double side = sc.nextDouble();
                Square square = new Square(side);
                square.showInfo();
                break;
            case "Rectangle":
                System.out.println("Please enter width: ");
                double width = sc.nextDouble();
                System.out.println("Please enter height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.showInfo();
                break;
            case "Triangle":
                System.out.println("Please enter side 'a': ");
                double a = sc.nextDouble();
                System.out.println("Please enter side 'b': ");
                double b = sc.nextDouble();
                System.out.println("Please enter side 'c': ");
                double c = sc.nextDouble();
                Shape triangle = new Triangle(a, b, c);
                triangle.showInfo();
                break;
        }
        sc.close();
    }
}
