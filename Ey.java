

class Ey
{
	public static void main(String[] args){
		
		String str ="010011110";
		int cnt1 =0;
		int cnt0 =0;
		for (int i=0;i<str.length() ;i++ )
		{
			char ch = str.charAt(i);
			if(ch=='1'){
				cnt1++;
			}else if(ch=='0'){
				cnt0++;
			}else{
				cnt1 =0;
				cnt0 =0;
			}
			if(cnt1>=7 || cnt0>=7)
				break;
		}
		System.out.println(cnt1>=7 || cnt0>=7 ? "Yes":"No");
	}
}


//Optonal
/*class Ey
{
	public static void main(String[] args){
		String str ="0100111011";
		System.out.println(str);
		boolean check0 = str.contains("0000000");
		boolean check1 = str.contains("1111111");
		System.out.println(check0 || check1 ?"Yes":"No");
	}
}*/