public class SeriesProgram3 {
    public static void main(String[] args) {
        int n = 6; // Number of terms
        int firstTerm = 79;
        System.out.print(firstTerm + " ");

        int currentTerm = firstTerm;
        int[] primes = {29, 31, 37, 41, 43}; // Given prime differences

        for (int i = 0; i < n - 1; i++) {
            currentTerm += primes[i];
            System.out.print(currentTerm + " ");
        }
    }
}
