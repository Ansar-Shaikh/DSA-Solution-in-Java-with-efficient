import java.util.*;
class KnapsackTabulation 
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
	public static int knapsackTabu(int val[], int wt[] , int W){
		// create array change for variable
		int n=val.length;
		int dp[][] =new int[n+1][W+1];
		// A) intilization 
		// col 
		for (int i=0;i<dp.length ;i++ )
		{
			dp[i][0]=0;// col 
		}
		for (int j=0;j<dp[0].length ;j++ )
		{
			dp[0][j]=0;
		}
			// meaning assigging

		// smaller to larger pb
		for (int i=1;i<n+1 ;i++ )
		{
			for (int j=1;j<W+1 ; j++)
			{
				// meaning assinging
				int v=val[i-1];
				int w=wt[i-1];
				// valid or not check it 
				if (w<=j)
				{
					// valid 
					int incprofit=v+dp[i-1][j-w];
					int excprofit=dp[i-1][j];
					dp[i][j]=Math.max(incprofit,excprofit);

				}
				else {
					// invalid 
					int excprofit=dp[i-1][j];
					dp[i][j]=excprofit;
				}
			}
		}
		print(dp);
		return dp[n][W];
	}
	public static void main(String[] args) 
	{
		int val[]={15,14,10,45,30};
		int wt[]={2,5,1,3,4};
		int w=7; 
		System.out.println("knapsack Tabulation:"+ knapsackTabu(val, wt , w));
	}
}
