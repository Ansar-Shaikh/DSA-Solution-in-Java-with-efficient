class  RecurrsionOfFactorial 
{
	public static int Factorial(int n){
		if (n==0)
		{
			return 1;
		}
		return (n*Factorial(n-1));
	}
	public static void main(String[] args) 
	{
		int n=5;
          int result=Factorial(n);
		System.out.println("factorial of number "+ n +" is "+ result);
	}
}