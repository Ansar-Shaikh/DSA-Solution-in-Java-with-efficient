import java.util.ArrayList;
class  ArrayListMaxamiumNumber
{
	public static void main(String[] args) 

	{
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(90);
		// for traversing an array
		int  max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int idx=0;
		for (int i=0;i<list.size() ;i++ )
		{
                if (list.get(i)>max)
                {
					max=list.get(i);
                idx++;
		}
		    min=Math.min(min,list.get(i));
		}
		System.out.print("maximun number is at index:"+ idx +" maxmum is: "+max+ " minimun: "+min);
	}
}