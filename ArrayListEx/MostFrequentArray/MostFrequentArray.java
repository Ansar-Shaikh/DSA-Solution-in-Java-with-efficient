import java .util.*;
class MostFrequentArray 
{
	public static  int frequent(ArrayList<Integer> arr,int key){
		//bulding ArrayList
		int [] count=new int [1001];
		for (int i=0;i<arr.size()-1 ;i++ )

		{
			if (arr.get(i)==key)
			{
                       count[arr.get(i+1)]++;

			}
					}
					int target=0;
					int maxvalue=0;
					// for tarversing  count array to find maxvalue
					for (int j=0;j<count.length ;j++ )
					{
                       if (count[j]>maxvalue)
                       {
                             target=j;
							 maxvalue=count[j];
                       }
					}
					return target;
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(13);
		arr.add(2);
		arr.add(1);
		arr.add(13);
		arr.add(19);
		arr.add(1);
		arr.add(13);
		arr.add(1);

		System.out.println(frequent(arr,1));
	}
}
