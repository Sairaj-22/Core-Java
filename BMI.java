import java.util.*;

class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight and height");
		double w = sc.nextDouble();
		double h = sc.nextDouble();

		double killogram = w * 0.45359237;
		double meter = h * 0.0254;

		double bmi = killogram / (meter * meter);
		;
		System.out.println("The BMI is " + bmi);

	}
}
