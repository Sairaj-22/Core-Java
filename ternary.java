class ternary 
{
	public static void main(String[] args) 
	{	
		int a= 22 ,b=4,c=1;
		
		int lar =(a>b)?((a:c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}
