class PowerFunctionOptimized 
{
	public static int PowerFunctionOptimized(int x,int n){
		if (n==0)
		{
			return 1;
		}
		int powersq=PowerFunctionOptimized(x,n/2);
		int halfpower=powersq*powersq;
		if (n%2!=0)
		{
			halfpower=x*halfpower;
		}
		return halfpower;
	}
	public static void main(String[] args) 
	{
		System.out.println(PowerFunctionOptimized(2,10));
	}
}
