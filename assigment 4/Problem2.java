import java.util.Scanner;

public class Problem2 {

    public static double coneVolume(double dValue, double hValue) {
        double r = dValue / 2;
        double v = (1.0 / 3) * Math.PI * r * r * hValue;
        return v;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double d = s.nextDouble();
        System.out.print("Enter height: ");
        double h = s.nextDouble();

        double v = coneVolume(d, h);

        int cents = (int) Math.round(v * 100);
        int whole = cents / 100;
        int part = cents % 100;

        if (part < 10) {
            System.out.println("Volume: " + whole + ".0" + part);
        } else {
            System.out.println("Volume: " + whole + "." + part);
        }
    }
}