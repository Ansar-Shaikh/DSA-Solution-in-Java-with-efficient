class pairarray 
{
	public static void pairarray(int number[]){
		int tp=0;
		for (int i=0;i<number.length ;i++ )  // outer means one element in array e.g:10
		{
			int curr=number[i];
			for (int j=i+1;j<number.length ;j++ )
			{
			
				System.out.print("("+curr+","+ number[j]+")");
				tp++;
			}
					System.out.println();
		}
					System.out.println("total number of pairs:"+tp);
	}
	public static void main(String[] args) 
	{
		int number[]={10,20,30,60,40,50,90,70};
		System.out.println("Hello pairofarray!");
		for (int i=0;i<number.length ;i++ )
		{
              		System.out.print("["+number[i]+","+"]");
		}
	 System.out.println();
		pairarray(number);
	}
}
