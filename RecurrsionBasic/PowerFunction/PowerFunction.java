class PowerFunction  
{
	public static int power(int x,int n){//x to the power of n
		if (n==0)
		{
			return 1;
		}
	//	int xnm1=power(x,n-1);
		//int xn=x * xnm1;
		return x*power(x,n-1);
	}
	public static void main(String[] args) 
	{
		System.out.println(power(2,10));
	}
}
