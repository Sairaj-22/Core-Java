/*import java.util.Scanner;

class Per 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th marks out of 600 ");
		
		int m = sc.nextInt();
		
		double p = (m/600)* 100;
		
		String op =(p>=75 && p<=100)?("Grade is A"):((p>=60 && p<=75)?("Grade is B"):("Grade is C"));
		System.out.println(op);
	}
}*/


import java.util.Scanner;

class Per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 600: ");

        int m = sc.nextInt(); // Input marks
        sc.close(); // Close scanner

        // Validate marks and calculate grade
        String op = (m < 0 || m > 600) ? "Invalid marks entered. Please enter between 0 and 600." :
                  (m / 600.0 * 100 >= 75) ? "Grade is A" :
                  (m / 600.0 * 100 >= 60) ? "Grade is B" : "Grade is C";

        System.out.println(op); // Print grade or error
    }
}
