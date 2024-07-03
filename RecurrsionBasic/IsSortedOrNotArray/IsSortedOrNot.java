class IsSortedOrNot 
{
	public static boolean IsSorted(int arr[],int i){
		if (i==arr.length-1)
		{
			return true;
		}
		if (arr[i]>arr[i+1])           ///********ascending order ************////
		{
			return false;
		}
		   return IsSorted(arr,i+1);

	}
	public static void main(String[] args) 
	{
		int arr[]={1};
	int i=0;         ///////////***********where to start comparasion
		System.out.println(IsSorted(arr,i));
	}
}
