import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter three scores: ");
        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();
        
        double exactAverage = (score1 + score2 + score3) / 3.0;
        int roundedAverage = (int) Math.round(exactAverage);
        
        System.out.println(roundedAverage);
        System.out.println(exactAverage);
    }
}