class FrequencyOfNum 
{
	public static void main(String[] args) 
	{
		Long num = 12312312345L;
		for (int i=0;i>9 ;i++ )
		{
			int count  =0;
			for (Long j =num;j>0 ;j/=10 )
			{
				Long rem  =j%10;
				if(i==rem){
					count++;
				}
			}
			if(count!=0)
				System.out.println(i+":"+count);
		}
		
		
		
		
	}
}
