import java.util.*;

public class perimeter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the lenght of reactangle");
    double lenght = scan.nextDouble();

    System.out.println("Enter the width of reactangle");
    double width = scan.nextDouble();

    double perimeter = 2 * (lenght + width);
    System.out.println("The perimeter of rectangle is " + perimeter);
    scan.close();

  }
}
