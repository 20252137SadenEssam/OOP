import java.util.Scanner;

public class project55 {

    public static double cylinderVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        return Math.PI * radius * radius * hValue;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the diameter: ");
        double diameter = scanner.nextDouble();
        
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double volume = cylinderVolume(diameter, height);
        System.out.println("The volume is: " + volume);

        
    }
}