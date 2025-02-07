import java.util.*;

class calYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minitus : ");
		long min = sc.nextLong();
		
		
		long minInYear =60*24*365;
		long minInDay = 60*24;
		
		long years = min/minInYear;
		long remainingMin =min % minInYear;
		long days = remainingMin / minInDay;
		
		System.out.println(min + "minutes is approximately "+ years + "years and" + days +"days");
		 
	}
}
