class LastOccuranceRecursion 
{
	public static int LastOccuranceRecursion(int arr[],int key ,int i){
		if (i==arr.length)
		{ 
			return -1;
		}
		int isfound=LastOccuranceRecursion(arr,key,i+1);
		if (isfound==-1 && arr[i]==key)
		{
			return i;
		}
		return isfound;
	}
	public static void main(String[] args) 
	{
		int arr[]={5,5,5,8,6,5};
		System.out.println(LastOccuranceRecursion(arr,6,0));
	}
}
