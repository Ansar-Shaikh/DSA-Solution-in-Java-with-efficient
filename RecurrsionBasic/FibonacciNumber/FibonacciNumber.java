class FibonacciNumber 
{
	public static int Fibonacci(int n){
		if (n==0||n==1)
		{
			return n;
		}
		int fnm1=Fibonacci(n-1);
			int fnm2=Fibonacci(n-2);
			int fib=fnm1+fnm2;
			return fib;
	}
	public static void main(String[] args) 
	{
		System.out.println(Fibonacci(5));
	}
}
