import java.util.Scanner;

class numdiv 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		String  a= (num %2==0 && num %5==0)?("HiTwoFive"):(((num%2==0)?("Hi Two"):(" Hi Five"));
		
		System.out.println(a);
		
	}
}
