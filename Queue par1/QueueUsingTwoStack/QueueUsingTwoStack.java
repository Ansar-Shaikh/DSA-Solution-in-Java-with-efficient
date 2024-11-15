import java.util.*;
class QueueUsingTwoStack 
{

	static class Queue
	{
		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();
		public static boolean isEmpty(){
			return s1.isEmpty();
		}
		public static void add(int data){
			// 3 step 
			//1) check s1 is empty not empty pop it add transfer into s2
			while (!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			// 2) push into s1 beacuse s1 empty huaa
			s1.push(data);
			//3) s2 ko pop kro s1 mai transfer kro ab 
			while (!s2.isEmpty())
			{
				s1.push(s2.pop());
			}

		}
		public static int remove(){
			if (isEmpty())
			{
				System.out.println("queue  is empty:");
				return -1;
			}
			return s1.pop();
		}
		public static int peek(){
			if (isEmpty())
			{
				System.out.println("queue  is empty:");
				return -1;

			}
			return s1.peek();
		}
	}
	public static void main(String[] args) 
	{
		Queue q= new Queue();
		q.add(2);
		q.add(3);
		q.add(4);
		while (!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}
