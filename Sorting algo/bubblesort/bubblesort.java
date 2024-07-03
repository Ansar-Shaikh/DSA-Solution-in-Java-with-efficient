class bubblesort 
{
	public static void bubblesort(int arr[]){
		for (int i=0;i<arr.length-1 ;i++ )
		{
			for (int j=0;j<arr.length-1-i ;j++ )
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
public static void printArr(int arr[]){
	for (int i=0;i<arr.length ;i++ )
	{
		System.out.print(arr[i]);
	}
}
	public static void main(String[] args) 
	{
		int arr[]={5,6,8,1,3,84};
bubblesort(arr);
printArr(arr);

	}
}
