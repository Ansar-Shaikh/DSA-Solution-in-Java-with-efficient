import java.util.*;
class Queuejcf 
{
	public static void main(String[] args) 
	{
		Deque<Integer> deque=new LinkedList<>();
		deque.addFirst(4);
			deque.addFirst(3);
				deque.addFirst(2);
					deque.addFirst(1);
		deque.addLast(5);
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque);
				System.out.println("first element is :"+deque.getFirst());
							System.out.println("last element is :"+deque.getLast());
	}
}
