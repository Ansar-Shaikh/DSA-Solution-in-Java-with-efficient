import java.util.Arrays;
class MajorityElement 
{
	public static int MajorityElement(int arr[]){
		Arrays.sort(arr);
		int si=0;
		int ei=arr.length;
		int mid=si+ei/2;
		int ans =arr[mid];
		return ans;

	}
	public static void main(String[] args) 
	{
		int arr[]={1,1,1,1,1,1,2,2,2,2,3,3};

		System.out.println("MajorityElement : in array is:::"+MajorityElement(arr));
	}
}
