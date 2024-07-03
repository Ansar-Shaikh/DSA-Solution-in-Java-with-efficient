class Unique_number 
{
	public static int Unique_number(int arr[]){
		int result=0;
		for (int i=0;i<arr.length ;i++ )
		{

			result ^=arr[i];
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int arr[]={20,50,60,20,50};
		System.out.println(Unique_number(arr));
	}
}
