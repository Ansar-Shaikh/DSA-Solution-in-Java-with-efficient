class linearsearch 
{
	public static void linearsearch(int arr,int key ,int end){
		if (end>-1)

		{
			return ;
		}
		if (arr[end]==key)
		{
			System.out.print(end+" ");
		}
		linearsearch(arr,key,end-1);
	}
	public static void main(String[] args) 
	{
		int arr[]={30,20,10,52,30,50,30};
           linearsearch(arr,30,arr.length-1);
	}
}
