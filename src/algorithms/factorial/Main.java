package algorithms.factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Factorial ***");
        System.out.println(factorial(4));
    }

    /**
     * Method to get factorial of number
     * @param n The number to get it's factorial
     * @return The factorial number
     */
    public static int factorial(int n) {
        // This is the base case
        if (n == 1) return 1;
        // This is the recursive case
        return n * factorial(n - 1);
    }
}
