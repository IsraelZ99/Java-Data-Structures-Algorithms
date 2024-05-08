package algorithms.fibonacci;

public class Fibonacci_With_Memo {

    // This is the memoization: This array is used to store the
    // subproblems and their solutions in this way, it's avoid
    // to repeat the solution if exist the solution
    static Integer[] memo = new Integer[100];

    // This counter is used to count the times of fib method
    // is call
    static int counter;

    /**
     * Fibonacci sequence method with memoization
     * @param n The position about fibonacci sequence
     * @return The fibonacci number
     */
    public static int fib(int n) {
        counter++;
        // Check if the fibonacci of specific number exists on to the
        // memoization, if it's exists it will use these number
        if (memo[n] != null) return memo[n];
        // Base case: When n is equals to 1 r equals to zero
        if (n == 1 || n == 0) return n;
        // Set memoization at index of n equals to recursively fibonacci method
        // n minus 1, add fibonacci method minus two
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter of method calls: " + counter);
    }
}
