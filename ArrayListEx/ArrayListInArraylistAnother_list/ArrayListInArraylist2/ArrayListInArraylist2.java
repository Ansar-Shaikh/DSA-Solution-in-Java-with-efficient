import java.util.*;
class ArrayListInArraylist2 

{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		mainlist.add(list1);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.add(10);
		list2.add(12);
				mainlist.add(list2);
		ArrayList<Integer>list3=new ArrayList<>();
		list3.add(1);
		list3.add(3);
		list3.add(5);
		list3.add(7);
		list3.add(9);
		list3.add(11);
           		mainlist.add(list3);
				// original array list 
				System.out.println(mainlist);
				for (int i=0;i<mainlist.size() ;i++ )
				{
					ArrayList<Integer> currlist=mainlist.get(i);
					for (int j=0;j<currlist.size() ;j++ )
					{
						System.out.print(currlist.get(j)+" ");
					}
					System.out.println();
				}

	}
}
