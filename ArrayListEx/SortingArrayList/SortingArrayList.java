import java.util.ArrayList;
import java.util.Collections;
class  SortingArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(20);
			System.out.println("original array list:");
		System.out.println(list);
					System.out.println("Acending order sorting  array list:");
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
					System.out.println("Decending order array list:");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println();
		System.out.println(list);
	}
}
