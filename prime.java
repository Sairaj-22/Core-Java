import java.util.*;

class prime 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		System.out.println
		((num == 2 || num ==3) ?(num +"is prime"):
		((num %2 ==0 || num %3 ==0)?
			(num +"num is not prime"):(num +"Num is prime")));
	}
}
