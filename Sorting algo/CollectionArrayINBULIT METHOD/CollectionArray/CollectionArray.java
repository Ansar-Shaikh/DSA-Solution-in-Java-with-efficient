import java.util.Arrays;
import java.util.Collections;
class  CollectionArray
{
	public static void printArray(Integer arr[]){
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}
		}
	public static void main(String[] args) 
	{
		Integer arr[]={22,9,5,3,8,9};
		Arrays.sort(arr,Collections.reverseOrder());
		printArray(arr);
		System.out.println("Hello World!");
	}
}
