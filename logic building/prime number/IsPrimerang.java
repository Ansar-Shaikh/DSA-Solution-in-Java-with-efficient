class IsPrimerang {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }
 public static void isprimerang(int n){
	 for (int i=2;i<=n ;i++ )
	 {
		 if(isPrime(i)){
			 System.out.println(i+" ;");
				 }
	 }
	 System.out.println();
 }
    public static void main(String[] args) {
       isPrime(5); // Test with a number
    }
}
