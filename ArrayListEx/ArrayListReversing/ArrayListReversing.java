import java.util.ArrayList;
class  ArrayListReversing
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
		//Oringnal array
		System.out.println();
		System.out.println("ArrayList Orignal list of array");
		for (int i=0;i<list.size() ;i++ )
		{
			System.out.print(list.get(i)+"  ");
		}
		// reversing a list usind size() method
			System.out.println();
				System.out.println("ArrayList Reversing list of array");
					
		for (int i=list.size()-1;i>=0 ;i-- )
		{
			System.out.print(list.get(i)+" ");
		}
		
	}
}
