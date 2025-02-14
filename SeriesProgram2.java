public class SeriesProgram2 {
    public static void main(String[] args) {
        int n = 6; // Number of terms
        int firstTerm = 1;
        System.out.print(firstTerm + " ");
        
        int currentTerm = firstTerm;
        for (int i = 2; i <= n; i++) {
            currentTerm += factorial(i);
            System.out.print(currentTerm + " ");
        }
    }

    // Method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
