import  java.util.*;
class QueueUsingJavaCollectionfremwork 
{

	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(18);
		q.add(14);
		q.add(16);
		q.add(12);
		q.add(10);
		while (! q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		System.out.println("Hello World!");
	}
}
