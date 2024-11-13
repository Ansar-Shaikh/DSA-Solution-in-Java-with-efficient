import java.util.*;
class CatalanNumberMemoizzation 
{

	public static int catalan(int n, int dp[]){
		if (n==0 || n==1)
		{
			return 1;
		}
		if (dp[n] != -1)
		{
			 return dp[n];
		}
		int ans=0;
		for (int i=0;i<=n-1 ;i++ )
		{
			ans+=catalan(i,dp) * catalan(n-i-1,dp);
		}
		dp[n]=ans;
		return  dp[n];
	}
	public static void main(String[] args) 
	{
		int n=4;
		int dp[]= new int [n+1];
		Arrays.fill(dp,-1);
		System.out.println("Catalan number:!"+catalan(n ,dp));
	}
}
