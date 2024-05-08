package algorithms.fibonacci;

public class Fibonacci_No_Memo {

    // This counter is used to count the times of fib method
    // is recursively call
    static int counter = 0;

    /**
     * Fibonacci sequence method without memoization
     * @param n The position about fibonacci sequence
     * @return The fibonacci number
     */
    public static int fib(int n) {
        counter++;
        // Base case: When n is equals to 1 r equals to zero
        if (n == 1 || n == 0) return n;
        // Return recursively fib method as parameter n -1
        // add fib method as parameter n - 2 to find de fibonacci
        // number
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter of method calls: " + counter);
    }
}
