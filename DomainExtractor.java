import java.util.Scanner;

public class DomainExtractor {

    public static String extractDomain(String email) {
        if (email == null) {
            return "Invalid Email";
        }
        
        email = email.trim();
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return "Invalid Email";
        }
        
        return email.substring(atIndex + 1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        
        System.out.print("Enter an email address: ");
        String emailInput = scanner.nextLine();

        String domain = extractDomain(emailInput);
        System.out.println("Extracted Domain: " + domain);

      
    }
}