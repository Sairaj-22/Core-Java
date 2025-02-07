import java.util.Scanner;

class ascii 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		
		//String op = (ch>='A' && ch<='B')?():()
		
		String op = (ch >= 'A' && ch <= 'Z') 
                        ? (ch + " is an uppercase letter") 
                        : (ch >= 'a' && ch <= 'z') 
                            ? (ch + " is a lowercase letter") 
                            : (ch >= '0' && ch <= '9') 
                                ? (ch + " is a digit") 
                                : (ch + " is a special character");
		
		
		//String op = (ch>='A' && ch <='Z')?():()
		System.out.print(op);
	}
}
