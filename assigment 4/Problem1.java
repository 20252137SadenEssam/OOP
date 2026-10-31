import java.util.Scanner;

public class Problem1 {

    public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        double x = s.nextDouble();
        return x;
    }

    public static double celsiusToFahrenheit(double c) {
        double f = c * 9.0 / 5 + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c = getDouble(s, "Enter temperature in Celsius: ");
        double f = celsiusToFahrenheit(c);

        int cents = (int) Math.round(f * 100);
        int whole = cents / 100;
        int part = cents % 100;

        if (part < 10) {
            System.out.println("Fahrenheit: " + whole + ".0" + part);
        } else {
            System.out.println("Fahrenheit: " + whole + "." + part);
        }
    }
}