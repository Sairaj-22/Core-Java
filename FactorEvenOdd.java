import java.util.Scanner;
class FactorEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		int cnt =0;
		
		for (int i=2;i<num ;i++ )
		{
			if(num%i==0)
				cnt++;
		}
		System.out.println(cnt==0?"Is a Prime number " : "is not a Prime Number");
	}
}
