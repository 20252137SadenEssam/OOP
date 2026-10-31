import java.util.Scanner;

public class Problem4 {

    public static String maskEmail(String email) {
        email = email.trim();

        int at = email.indexOf('@');
        if (at == -1) {
            return "Invalid Email";
        }

        String name = email.substring(0, at);
        String domain = email.substring(at + 1).toLowerCase();

        if (name.length() <= 2) {
            return name + "@" + domain;
        }

        String result = name.substring(0, 2);
        for (int i = 2; i < name.length(); i++) {
            result = result + "*";
        }
        return result + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = s.nextLine();
        System.out.println(maskEmail(email));
    }
}