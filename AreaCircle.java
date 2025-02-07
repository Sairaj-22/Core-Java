import java.util.Scanner;

public class AreaCircle {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner san = new Scanner(System.in);

    // Prompt the user for the radius of the circle
    System.out.print("Enter the radius of the circle: ");
    double radius = san.nextDouble();

    // Use a fixed value for pi (approximation)
    double pi = 3.14159;

    // Calculate the area of the circle
    double area = pi * radius * radius;

    // Display the result
    System.out.println("The area of the circle with radius " + radius + " is: " + area);

    // Close the scanner
    scanner.close();
  }
}
