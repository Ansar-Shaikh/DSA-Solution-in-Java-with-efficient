import java.util.Arrays;
import java.util.*;
class KthLargestEle 
{
	public static int KthLargestEle(int arr[],int k){

if (k>arr.length)
{ 
	return -1;
}
		int kth=arr[arr.length-k];
		return kth;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int arr[]={5,1,8,9,3,7,2};
				Arrays.sort(arr);
		for (int a=0;a<arr.length;a++ )
		{
			System.out.print(arr[a]+" ");
		}
		System.out.println();
				System.out.println("enter ur number largest in array:");
		int k=sc.nextInt();
		System.out.println(KthLargestEle(arr,k));
	}
}
