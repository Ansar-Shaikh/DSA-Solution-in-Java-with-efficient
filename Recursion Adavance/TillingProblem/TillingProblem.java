class TillingProblem 
{

	public static int TillingProblem(int n){
		if (n==1||n==0)
		{
			return 1;
		}
		int fnm1=TillingProblem(n-1);//vertical choices*********
		int fnm2=TillingProblem(n-2);//horizontal choices********
		int TotalWays=fnm1+fnm2;
		return TotalWays;
	}
	public static void main(String[] args) 
	{
		System.out.println("TillingProblem:!");
		int result=TillingProblem(3);
		System.out.println("TillingProblem :::"+result);
	}
}
