import java.util.Scanner;
class Pincheck

{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc =new  Scanner(System.in);
		int storepin =143;
		int sec =5000;
		outerLoop:
			for (; ; )
			{
			
				int attempts=3;
				do
				{
					System.out.print("Enter the pin: ");
					int pin =sc.nextInt();
					if(storepin == pin){
						System.out.println("Phone Unlocked");
						break outerLoop;
					}else{
						System.out.println("Wrong Pin");
						System.out.println("Attempts left "+(attempts-1));
					}
					attempts--;

				}
				while (attempts>=1);
				
				System.out.println();
				System.out.println("Phone is disable for "+(sec/1000)+"Sec");
				Thread.sleep(sec);
				sec *=2;
				System.out.println();



			}
	}
}
