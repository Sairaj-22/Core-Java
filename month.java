/*import java.util.Scanner;
class month

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month");
		String m = sc.next().toUpperCase();
		
		String op = m.equal("OCT")||m.equal("NOV")||m.equlas("DEC")||m.equals("JAN")?("It is winter"):  
					m.equals("FEB")||m.equals("MAR")||m.equlas("APR")||m.equals("MAY") ?("It is Summer"): 
					m.equlas("JUN")|| m.equals("JUL" )||m.equals("AUG")||m.equals("SEP") ?("It is Monsoon"):
					"Invalid Month";
		
		System.out.println(op);
	}
}*/


import java.util.Scanner;

class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month (e.g., JAN, FEB):");
        String m = sc.next().toUpperCase();  // Corrected method name

        // Corrected ternary logic
        String op = m.equals("OCT") || m.equals("NOV") || m.equals("DEC") || m.equals("JAN") ? "It is Winter" :
                    m.equals("FEB") || m.equals("MAR") || m.equals("APR") || m.equals("MAY") ? "It is Summer" :
                    m.equals("JUN") || m.equals("JUL") || m.equals("AUG") || m.equals("SEP") ? "It is Monsoon" :
                    "Invalid Month";

        System.out.println(op);
        sc.close();  // Close the scanner
    }
}
