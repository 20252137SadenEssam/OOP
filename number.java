import java.util.Scanner;

public class number {

    public static int getInt(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Age = getInt(scanner, "Please enter your age: ");

        System.out.println("You entered: " + Age);

        
    }
}