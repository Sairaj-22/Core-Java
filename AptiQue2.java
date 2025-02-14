import java.util.Scanner;

public class AptiQue2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int term = 2;
        System.out.println("Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            if (i == 1) {
                term = 6;
            } else {
                term = term * (i + 1) + (i - 1);
            }
        }
    }
}
