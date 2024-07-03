import java.util.*;
class ArrayListInArraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>>  mainlist=new ArrayList<>();
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		mainlist.add(list1);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(3);
		list2.add(4);
				mainlist.add(list2);
				System.out.println(mainlist);
				// for traversing array 
	          for (int i=0;i<mainlist.size() ;i++ )
	          {
				  ArrayList<Integer> curlist=mainlist.get(i);
				  for (int j=0;j<curlist.size() ;j++ )
				  {
                           System.out.print(curlist.get(j) + "  ");
				  }
				  System.out.println();
	          }
	}

}
