/*public class SeriesProgram1 {
    public static void main(String[] args) {
        int terms = 5; // Number of terms in the series
        int i = 10; // Initial increment value
        
        for (int n = 1; n <= terms; n++) {
            int term = (n * n * n) + i; // n^3 + i
            System.out.print(term + " ");
            i ++; // Increment i by 2 for the next term
        }
    }
}*/

class SeriesProgram1
{
	public static void main(String[] args){
		int st=2;
		int range =10;
		int str=0;
		
		for (int i =st;i<=range ;i++ )
		{
			str =(i*i*i)+i;
			
			System.out.print(str+" ");
	
		}
		
	}
}