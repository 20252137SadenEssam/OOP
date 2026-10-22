
import java.util.Scanner;

public class Math {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double x;
        x = Math.sqrt(
                Math.pow(y2 - y1, 2)
                + Math.pow(x2 - x1, 2)
        );

        return x;

    }

    public static void main(String[] args) {
        System.out.println("enter your numbers");
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

    }
}
