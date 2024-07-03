class RemoveDuplicateElement 
{
	public static int RemoveDuplicateArray(int arr[]){
		int i =0;
		for (int j=1;j<arr.length ;j++ )
		{
			if (arr[i]!=arr[j])
			{
				arr[i+1]=arr[j];
				i++;
			}
		}
		return (i+1);
	}
	public static void main(String[] args) 
	{
		int arr[]={1,1,2,2,3,3,8,8};
	  int newlength=RemoveDuplicateArray(arr);
	  for (int i=0;i<newlength ;i++ )
	  {
		  System.out.print(arr[i]+" ");
	  }
	}
}
