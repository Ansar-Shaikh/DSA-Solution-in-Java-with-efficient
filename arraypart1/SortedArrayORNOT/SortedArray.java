import java.util.Arrays;
class SortedArray 
{
	public static boolean SortedArray(int arr[]){
		for (int i=1;i<arr.length ;i++ )
		{
			if (arr[i]>=arr[i-1])
			{

			}
			else {
			return false;
		}
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		int arr[]={1,2,2,3,4,5,1};
			System.out.println(SortedArray(arr));
		Arrays.sort(arr);
		for (int i=0;i<arr.length ;i++ )
		{
                		System.out.print(arr[i] + " ");
		}
	
	}
}
