import java.util.*;
class StringConvertionTabulation

{
	public static int editDistance(String str1, String str2){
		int n=str1.length();
		int m=str2.length();
		int dp[][]=new int[n+1][m+1];
		// intialization 
		for (int i=0;i<n+1 ;i++ )
		{
			for (int j=0;j<m+1 ;j++ )
			{
				// for row zero  clo will be change able
				if (i==0 && j==0)
				{
					dp[i][j]=0;
				}
			 else	if (i==0)
				{
					dp[i][j]=dp[i][j-1]+1;
				}
				else  if(j==0)
				{
					dp[i][j]=dp[i-1][j]+1;
				} 
				else {
					if (str1.charAt(i-1) == str2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else {
				
					// operation three  1) add
					int add=dp[i][j-1] +1;
					int del=dp[i-1][j]+1;
					int replace=dp[i-1][j-1] +1;
					dp[i][j]=Math.min(add,Math.min(del,replace));

				}
				}
				
			}
		}
		// bottom up approch
		
		return dp[n][m];
	}
	public static void main(String[] args) 
	{
		String str1=" abcdef";
		String str2="aceg";
		System.out.println("edit Distance!"+editDistance(str1, str2));
	}
}
