class binarysearch 
{
	public static int binarysearch(int number[],int key){  //call byy reference 
		int start=0;   //intially start
		int end=number.length-1;   //end -1
		while (start<=end)  
		{
			int mid=(start+end)/2;
			if (number[mid]==key)
			{
				return mid;

			}
			if (number[mid]<key)
			{                //right
                       start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		     return -1;
		}
	public static void main(String[] args) 
	{
		int number[]={10,50,60,85,80,90,32};  // declaration of array 
		int key=5;   // desired key element 
		int result =binarysearch(number,key);

		System.out.println("Hello array at index is !="+result);
	}
}
