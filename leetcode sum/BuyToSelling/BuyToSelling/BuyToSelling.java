import java.util.*;
class BuyToSelling 
{
	public static int buytoselling(int prices[]){
		int mini=prices[0];
		int maxprofit=0;
		int n=prices.length;
		for (int i=1;i<n ;i++ )
		{
			int cost=prices[i]-mini;
			maxprofit=Math.max(maxprofit,cost);
			mini=Math.min(mini,prices[i]);
			
		}
		return maxprofit;
	}
	public static void main(String[] args) 
	{
          int prices[]={15,9,8,6,3,1,7,53};
		  int result =buytoselling(prices);
		  System.out.println(result);
		System.out.println("Hello World!");
	}
}
