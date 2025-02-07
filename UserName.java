import java.util.Scanner;

class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        
        String name = sc.next().toUpperCase(); // Store input string in uppercase
        int len = name.length();

        for (int i = 0; i < len; i++) {
            System.out.print(name.charAt(i)); // Print each character separately
        }
-
        System.out.println(); // Print a newline after loop
        sc.close(); // Close Scanner
    }
}
