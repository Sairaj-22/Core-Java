import java.util.Scanner;

public class GoodPrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Prime numbers from 1 to " + n + ":");
        int count = 0;
        int goodPrimeCount = 0;
        
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
                count++;
                
                // Check if all digits are prime numbers (2, 3, 5, 7)
                boolean isGoodPrime = true;
                int temp = num;
                while (temp > 0) {
                    int digit = temp % 10;
                    if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                        isGoodPrime = false;
                        break;
                    }
                    temp /= 10;
                }
                
                if (isGoodPrime) {
                    goodPrimeCount++;
                }
            }
        }
        System.out.println("\nTotal prime count: " + count);
        System.out.println("Total good prime count: " + goodPrimeCount);
    }
}
