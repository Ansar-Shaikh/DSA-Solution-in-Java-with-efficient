class linearsearch 
{
	public static void linearsearch(int arr[], int key,int start){
		if (start==arr.length)
		{
			return ;
		}
		if (arr[start]==key)
		{
			System.out.print(start+" ");
		}
		linearsearch(arr,key,start+1);

	}
	public static void main(String[] args) 
	{
		int arr[]={30,10,20,30,30};
                 linearsearch(arr,30,0);
	}
}