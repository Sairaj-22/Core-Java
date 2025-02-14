public class SeriesProgram4 {
    public static void main(String[] args) {
        int n = 5; // Number of terms
        int firstTerm = 2;
        System.out.print(firstTerm + " ");

        int currentTerm = firstTerm;
        int diff = 2; // First difference

        for (int i = 1; i < n; i++) {
            currentTerm += (diff * diff);
            System.out.print(currentTerm + " ");
            diff = diff * diff; // Update the difference
        }
    }
}
