import java.util.*;
class KnapsackUsingRecursion  
{
	public static int knapsack(int val[], int wt[], int W, int n){
		if (W==0 || n==0)
		{
			return 0;  // w=> weight nhi hai means 0
			            // n==> n denotes items nhi hai add krneko esliye 0
		}
		if (wt[n-1]<=W)  // valid condition
		{
			// include 
			int ans1=val[n-1]+knapsack(val, wt, W-wt[n-1],n-1);
			// exclude
			int ans2=knapsack(val, wt, W,n-1);
			return Math.max(ans1,ans2);
		}
		else {
			// exclude
			return knapsack(val, wt, W,n-1);
		}
	}
	public static void main(String[] args) 
	{
		int val[]={15,14,10,45,30};
		int wt[]={2,5,1,3,4};
		int w=7;
		System.out.println("knapsack weight:"+knapsack(val,wt,w,val.length));
	}
}
