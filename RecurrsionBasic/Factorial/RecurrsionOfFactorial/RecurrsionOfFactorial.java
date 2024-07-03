class RecursionOfFactorial {
    public static int Factorial(int n) {
        if (n >= 1) {
            return n * Factorial(n - 1);
        } else {
            return 1;  // Base case: factorial of 0 is 1
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Factorial(n);
        System.out.println("Factorial of number " + n + " is " + result);
    }
}
