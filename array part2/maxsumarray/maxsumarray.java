class maxsumarray 
{
	public static void maxsumarray (int number[]){
		int currsum=0;
		int maxsum=Integer.MIN_VALUE; // - infinity

      for ( int i=0;i<number.length ;i++ )
      {
		  int start=i;
		  for (int j=i;j<number.length ;j++ )
		  {
			  int end =j;
			  currsum=0;
			  for (int k=start;k<=end ;k++ )
			  {
				  currsum+=number[k];
			  }
			  System.out.println(currsum);
			  if (currsum>maxsum)
			  {
				  maxsum=currsum;
			  }
		  }
      }
			  System.out.println("max is :="+maxsum);
	}
	public static void main(String[] args) 
	{
		int number[]={1,3,-8,9,7,-5,10};
maxsumarray (number);
		System.out.println("Hello World!");
	}
}

