import java.util.LinkedList;
class JavaCollectionLinkedList 
{
	public static void
		main(String[] args) 
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.addFirst(5);
		ll.addLast(6);
		ll.addLast(1);
		ll.addFirst(3);
		System.out.println(ll+"==>");
		ll.remove(2);
				System.out.println(ll);
	}
}
