class RecurrsionBasicIncresingOrder 
{
	public static void RecurrsionBasicIncresingOrder(int n){
		if (n==1)
		{
			System.out.print(1);
			return;
		}
		RecurrsionBasicIncresingOrder(n-1);
		System.out.print(n +" ");
	}
	public static void main(String[] args) 
	{
		int n=10;
				RecurrsionBasicIncresingOrder(n);	
		System.out.println("Hello World!");
	}
}
