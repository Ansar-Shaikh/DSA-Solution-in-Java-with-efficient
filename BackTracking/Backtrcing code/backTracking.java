class backTracking 
{
	public static void changearray(int arr[], int idx, int val){
		// base case
		if (idx==arr.length)
		{
			System.out.print("oringinal array :");
			printarr(arr);
			return ;
		}

		//recursion
		arr[idx]=val;
		changearray(arr,idx+1,val+1);
		arr[idx]-=2;
	}
	public static void printarr(int arr[]){
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}
					System.out.println();
	}
	public static void main(String[] args) 
	{
		int arr[]=new int [5];
changearray(arr,0,1);
printarr(arr);
	}
}
