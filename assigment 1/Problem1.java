import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}