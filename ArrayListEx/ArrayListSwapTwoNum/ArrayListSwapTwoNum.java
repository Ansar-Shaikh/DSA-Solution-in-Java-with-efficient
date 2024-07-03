import java.util.ArrayList;
class ArrayListSwapTwoNum  
{
	public static void swap(ArrayList<Integer> list, int idx1, int idx2){
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(90);
		System.out.println("before swaping :!");
		System.out.print(list);
		System.out.println();
			System.out.println("after  swaping :!");
		swap(list,1,3);
		System.out.print(list);
	}
}
