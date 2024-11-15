class  sellingandbuying
{
	public static int sellingandbuying(int prices[]){
		int buying=Integer.MAX_VALUE;
		 int maxprofit=0;
		 for (int i=0;i<prices.length ;i++ )
		 {
			 if (buying<prices[i])
			 {
				 // profit 
				 int profit=prices[i]-buying;
				 maxprofit=Integer.max(maxprofit,profit);
			 }
			 else {
				 buying=prices[i];
		 }
		 }
		 return maxprofit;
	}
	public static void main(String[] args) 
	{
		int prices[]={7,1,5,3,6,4};
		System.out.println(sellingandbuying( prices));
	}
}
