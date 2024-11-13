import java.util.*;
class WildMatching  
{
	public static boolean isMatching(String s, String p){
		// create 2d array
		int n=s.length();
		int m=p.length();
		boolean dp[][]=new boolean[n+1][m+1];
		// initalization
		// case 1 empty both are 
		dp[0][0]=true;
		for (int i=1;i<n+1 ;i++ )
		{
			// pattern is empty nothing is remain to match
			dp[i][0]= false;
		}
		for (int j=1;j<m+1 ;j++ )
		{
			if (p.charAt(j-1)=='*')
			{
				dp[0][j]=dp[0][j-1];
			}
		}
        for (int i=1;i<n+1 ;i++ )
        {
			for (int j=1;j<m+1 ;j++ )
			{
				// case 1) same or pattern ka last character ? hai to 
				if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1)=='?')
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if (p.charAt(j-1)== '*')
				{
					// two case egnore case in clude case 
					dp[i][j]=dp[i-1][j] || dp[i][j-1];
				}
			    else {
					dp[i][j]=false ;
			    }
			}
        }
		return dp[n][m];

	}
	public static void main(String[] args) 
	{
		String e="baaabab";
		String p="******ba******ab";

		System.out.println("Wild matching "+isMatching(e,p));
	}
}
