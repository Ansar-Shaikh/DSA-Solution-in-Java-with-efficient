class MissingNumberInArray 
{
	public static  int MissingNumber(int arr[]){
		int n=arr.length;
		int sum=n*(n+1)/2;
		

		for (int num:arr)
		{
			 sum-=num;
		}
		return sum;

	}
	public static void main(String[] args) 
	{
		int arr[]={3,0,1};
		System.out.println("Missing number is !"+MissingNumber(arr));
	}
}
