class RotatedArrayUsingBinarySearch 
{
	public static int search(int arr[],int tar,int si,int ei){
		if (si>ei)
		{
			return -1; // whole array traveseing but target not found 
		}
		// case found 
		int mid =si+(ei-si)/2;

		if (arr[mid]==tar)
		{
			return mid;
		}
		//case to find line 1 
		if (arr[si]<=arr[mid])
		{
			//case a:
			if (arr[si]<=tar && tar<=arr[mid])
			{
				return search(arr , tar,si,mid-1);
			}
			else{
				return search(arr,tar,mid+1,ei);

			}
		}
		// line 2 find the target element 
		else{
			if (arr[mid]<=tar &&  tar<=arr[ei])
			{
				return search(arr,tar,mid+1,ei);
			}
			else{
				return search(arr,tar,si,mid-1);
		}
		}


	}
	public static void main(String[] args) 
	{
		int arr[]={4,5,6,7,0,1,2,3};
		int target=10;
		int taridx=search(arr,target,0,arr.length-1);
		System.out.println("target element !  " + target+" is at  index " +taridx);
	}
}
