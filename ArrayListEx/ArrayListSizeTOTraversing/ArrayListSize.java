import java.util.ArrayList;
class ArrayListSize 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new
			ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,60);
		list.add(50);
//traversing an array fromm start to end using .size()
for (int i=0;i<list.size() ;i++ )
{

System.out.print(list.get(i)+" ");

}
	}
}
