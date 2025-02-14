import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        
        // Loop to find factors and sum them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Display result
        System.out.println("Sum of factors of " + number + " is: " + sum);
        
        scanner.close();
    }
}
