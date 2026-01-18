public class FibonacciApp {

        /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the position in the Fibonacci sequence to calculate
     * @return the nth term of the Fibonacci sequence
     */
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = Fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
