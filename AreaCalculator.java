import java.util.Scanner;

public class AreaCalculator {

    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    
    public static double computeArea(double length, double width) {
        return length * width;
    }

    public static double computeArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Circle Area: " + computeArea(radius));
        System.out.println();
      
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Rectangle Area: " + computeArea(length, width));
        System.out.println();
 
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Triangle Area: " + computeArea(base, height, true));

    }
}