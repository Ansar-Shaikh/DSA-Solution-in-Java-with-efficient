class kandane 
{
	public static void kandane(int number[]){
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		// negative value of infinty
		for (int i=0;i<number.length ;i++ )
		{
			currsum+=number[i];
			if (currsum<0)
			{
				currsum=0;
			}
			maxsum=Math.max(currsum,maxsum);
		}
		System.out.println();
		System.out.println("max sum of array using array:="+maxsum);
	}
	public static void main(String[] args) 
	{
		int number[]={-2,-3,4,-2,-1,1,5,-3};
				System.out.println("Hello kandanes mamu algorithm!");
				for (int i=0;i<number.length;i++)
				{
					System.out.print("["+number[i]+"]");
				}
		kandane(number);

	}
}
