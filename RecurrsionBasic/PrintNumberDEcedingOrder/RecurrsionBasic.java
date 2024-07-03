class RecurrsionBasic 
{
	public static void PrintNumDec(int n){
		if (n==1)
		{
			System.out.print(1);
			return ;
		}
		System.out.print(n+" ");
		PrintNumDec(n-1);
	}
	public static void main(String[] args) 
	{
		int n=10;
		PrintNumDec(n);
	}
}
