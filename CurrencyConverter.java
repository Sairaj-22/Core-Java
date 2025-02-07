import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Currency Converter ");
		
		System.out.println();
		System.out.println("Enter the Amount in (INR) :");
		
		float inr = sc.nextFloat();
		
		System.out.println();
		
		System.out.println("List of Currency ");
		
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");		
		System.out.println();
		
		System.out.println("Enter The Currency: ");
		String curr = sc.next().toUpperCase();
		
		float conCurr =0;
		if(curr.equals("USD")){
			conCurr = inr/86.56f;
			System.out.println(inr +"INR = "+ conCurr+"USD");

		}
		if(curr.equals("EUR")){
			conCurr = inr/90.25f;
			System.out.println(inr +"INR = "+ conCurr+"EUR");

		}
		if(curr.equals("GBP")){
			conCurr = inr/107.654f;
			System.out.println(inr +"INR = "+ conCurr+"GBP");

		}
		if(curr.equals("PKR")){
			conCurr = inr/0.321f;
			System.out.println(inr +"INR = "+ conCurr+"PKR");

		}else{
			System.out.println("INVALID OPTION");
		}


		


		
	}
}
