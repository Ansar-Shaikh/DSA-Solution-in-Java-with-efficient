import java.util.*;
class   MajorityElement

{
	public static void main(String[] args) 
	{
		int arr[]={1,5,3,5,9,7,1,1,1,18,1,9,6};
		HashMap<Integer,Integer> map= new HashMap<>();
	for (int i=0;i<arr.length ;i++ )
	{
		if (map.containsKey(arr[i]))
		{
			map.put(arr[i],map.get(arr[i])+1);
		}
		else {
			map.put(arr[i],1);// new number hai to
		}
	}
	Set<Integer> keyset=map.keySet();// to iterate an map usee keyset method
	for (Integer key:keyset )
	{
		if (map.get(key)>=(arr.length/3))
		{
			System.out.print(key+" ");
		}
		
	}

		
	}
}
