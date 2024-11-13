import java.util.*;
class KnapsackTabuRodCutting

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
	public static int RodCutting(int prices[], int length[] , int totrod){
		// create array change for variable
		int n=length.length;
		int dp[][] =new int[n+1][totrod+1];
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
			for (int j=1;j<totrod+1 ; j++)
			{
				// meaning assinging
				int v=prices[i-1];
				int w=length[i-1];
				// valid or not check it 
				if (w<=j)
				{
					// valid 
					int incprofit=v+dp[i][j-w]; // unbounded knapsack
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
		return dp[n][totrod];
	}
	public static void main(String[] args) 
	{
		int length[]={1,2,3,4,5,6,7,8};
		int prices[]={1,5,8,9,10,17,17,20};
		int totrod=8; 
		System.out.println("knapsack Tabulation:"+ RodCutting(length, prices , totrod));
	}
}
