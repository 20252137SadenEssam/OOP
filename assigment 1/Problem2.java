import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter unit price (double): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity (int): ");
        int quantity = scanner.nextInt();
        
        final double TAX_RATE = 0.14;
        double subtotal = unitPrice * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        
        System.out.println("Subtotal = " + subtotal + ", Tax = " + tax + ", Total = " + total);
    }
}