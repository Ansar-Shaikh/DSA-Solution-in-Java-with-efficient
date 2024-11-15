class PartitionSumArray
	{
    public static int minimumDifference(int[] nums) {
        int n=nums.length;
        // calculate sum
        int sum=0; 
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int w=sum/2;
        
        int dp[][]=new int[n+1][w+1];
        for(int i=1;i<n+1;i++){
            for (int j=1;j<w+1;j++){
                int v=nums[i-1];
                if(v<=j){
                    int incprofit=v+dp[i-1][j-v];
                    int excprofit=dp[i-1][j];
                    dp[i][j]=Math.max(incprofit,excprofit);
                   }
                   else {
                    dp[i][j]=dp[i-1][j];
                   }
            }
        }
        int sum1=dp[n][w];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
	public static void main(String args[]){
		int arr[]={1,6,11,5};
		System.out.println(+minimumDifference(arr));
	}
}