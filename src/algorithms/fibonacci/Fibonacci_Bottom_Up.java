package algorithms.fibonacci;

public class Fibonacci_Bottom_Up {

    // This counter is used to count the times of fib method
    // is call
    static int counter;

    /**
     * Fibonacci sequence method dynamic programming with bottom up solution
     * @param n The position about fibonacci sequence
     * @return The fibonacci number
     */
    public static int fib(int n) {
        // Create an array to store the fibonacci sequence from 0 to n
        // The reason that the length of the array is n + 1 is because
        // we need to find the n fibonacci sequence and zero is always
        // needed
        int[] fibList = new int[n + 1];
        // Start to sore the first item of the sequence (always will be 0)
        fibList[0] = 0;
        // Start to sore the second item of the sequence (always will be 1)
        fibList[1] = 1;
        // Iterate from the two position until the sequence you want get
        for (int iteration = 2; iteration <= n; iteration++) {
            counter++;
            // Store in the iteration position, the adding of the two last
            // items on the fibonacci sequence
            fibList[iteration] = fibList[iteration - 1] + fibList[iteration - 2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter of method calls: " + counter);
    }
}
