class MaxDigitNum 
{
	public static void main(String[] args) 
	{
		int num =29858;
		int max =0;
		int min = 9;
		for(int i =num ;i>0;i/=10){
			int dgt = i%10;
			if(max<dgt)
				max=dgt;
			else if(min<dgt)
				min=dgt;
		}
		
		
		
		System.out.println("Laragest Digit is "+num+"is"+max);
		System.out.println("Laragest Digit is "+num+"is"+min);

		
	}
}
