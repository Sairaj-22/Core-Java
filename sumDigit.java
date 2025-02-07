import java.util.Scanner;
class sumDigit 
{
	
	public static int sum(int num){
		if (num == 0){
			return 0;
		}
		return (num % 10) + sum(num/10);
	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the No between 0 to 100 : ");
		int num = sc.nextInt();
		int result = sum(num);
		System.out.println("The sum of Digit is : "+ result);
	}
}
