import java.util.*;
import java.util.Scanner;
class vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string");
		char n = sc.next().charAt(0);
		String op = (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') ? ("it is vowel") : ("it is Const");

		System.out.print(op);

	}
}
