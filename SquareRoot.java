import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        
        boolean flag = false;
        int num = sc.nextInt();
        sc.close();  // Close scanner to avoid memory leaks

        for (int i = 1; i * i <= num; i++) {  // Corrected loop condition
            if (i * i == num) {
                flag = true;
                System.out.println(num + " is a perfect square.");
                break;  // No need to continue once found
            }
        }
        
        if (!flag)
            System.out.println(num + " is NOT a perfect square.");
    }
}
