import java.util.*;
class LargestSumWithSumZero 
{
	public static void main(String[] args) 
	{
		int arr[]={15,2,-2,-8,1,7,10};
          HashMap<Integer, Integer> map=new HashMap<>();
		  // sum and idx to store in map
		  int sum=0;
		  int len=0;
		  for (int j=0;i<arr.length ;i++ )
		  {
			 sum+=arr[i];
			  if (map.containsKey(sum))
			  {
				  len=Math.max(len,j-map.get(sum));
			  }
			  else{
				map.put(sum,j);
			  }
		  }
		System.out.println("Largest Sum With Sum Zero "+len
			);
	}
}
