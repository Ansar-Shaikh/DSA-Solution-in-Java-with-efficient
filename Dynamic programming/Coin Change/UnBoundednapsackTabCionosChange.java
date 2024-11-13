import java.util.*;
class UnBoundednapsackTabCionosChange
{
	public static void print(int dp[][]){
	   for (int i=0;i<dp.length ; i++)
	   {
		   for (int j=0;j<dp[0].length ;j++ )
		   {
			   System.out.print(dp[i][j]+ "  ");
		   }
		   System.out.println();
	   }
	   System.out.println();
	}	
	public static int CoinsChange(int coins[], int sum){
		// create array change for variable
		int n=coins.length;
		int dp[][] =new int[n+1][sum+1];
		// A) intilization 
		// col 
		for (int i=0;i<dp.length ;i++ )
		{
			dp[i][0]=1;// col // sum zero hogi to 1 one way hoga na oo isley 
		}
		for (int j=0;j<dp[0].length ;j++ )
		{
			dp[0][j]=0;
		}
			// meaning assigging

		// smaller to larger pb
		for (int i=1;i<n+1 ;i++ )
		{
			for (int j=1;j<sum+1 ; j++)
			{
				// meaning assinging
				int v=coins[i-1];
				
				// valid or not check it 
				if (coins[i-1]<=j)
				{
					// valid 
					int incprofit=dp[i][j-v];
					int excprofit=dp[i-1][j];
					dp[i][j]=incprofit+excprofit;

				}
				else {
					// invalid 
					int excprofit=dp[i-1][j];
					dp[i][j]=excprofit;
				}
			}
		}
		print(dp);
		return dp[n][sum];
	}
	public static void main(String[] args) 
	{
		int coins[]={2,5,3,6};
		int sum=10;
		
		System.out.println("knapsack Tabulation:"+ CoinsChange(coins, sum));
	}
}
