import java.util.*;
class  CountDistinictElemenet
{
	public static void main(String[] args) 
	{
		int num[]={1,2,3,6,7,9,2,3,1,4,5,5,4,6};
		HashSet<Integer> set=new HashSet<>();
		for (int i=0;i<num.length ;i++ )
		{
			set.add(num[i]);
		}
		System.out.println("Oringinal length of array::::"+num.length);
		System.out.println(" Distinict element length of array   :::"+set.size());
	}
}
