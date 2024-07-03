class FirstOccuranceRecursion 
{
	public static int FirstOccurance(int arr[],int key ,int i){
		if (i==arr.length)
		{
			return -1;
		}
		if (arr[i]==key)
		{
			return i;
		}
		return FirstOccurance(arr,key,i+1);
	}
	public static void main(String[] args) 
	{
		int arr[]={8,3,5,8,6,7,9,5,4};
		System.out.println("FIrst Occurance in array:");
				System.out.println(FirstOccurance(arr,4,0));
	}
}
