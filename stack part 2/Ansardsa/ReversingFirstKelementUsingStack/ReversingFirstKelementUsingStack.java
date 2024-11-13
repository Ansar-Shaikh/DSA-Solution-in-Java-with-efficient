import java.util.*;
class  ReversingFirstKelementUsingStack
{
	public static void reversingkelement(Queue<Integer> queue,int k){
		if (queue.isEmpty()==true || queue.size()< k || k<=0)
		{
			return ;
		}
		// declaring stack of integer
		Stack<Integer> stack=new Stack<>();
		//  queue mai se first k element remove kro and stack mai add kro
		for (int i=0;i<k ;i++ )
		{
		  stack.push(queue.remove());
		  
		}
		//stack mai se rwmove kro and queue mai add kro last se i.e rear end ko
		while (! stack.isEmpty())
		{
			queue.add(	stack.pop());
		
		}
		// oringinal queue ko size- k se remove kr ke queue ke rear side ko add kro
		for (int i=0;i<queue.size()-k ;i++ )
		{
			queue.add(queue.remove());
			
		}
	}
	public static void main(String[] args) 
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
         queue.add(90);
          queue.add(100);
                int k=5;
               reversingkelement(queue,k);
			   while (!queue.isEmpty())
			   {
				   System.out.print(queue.remove()+" ");
			   }

		System.out.println("Hello World!");
	}
}
