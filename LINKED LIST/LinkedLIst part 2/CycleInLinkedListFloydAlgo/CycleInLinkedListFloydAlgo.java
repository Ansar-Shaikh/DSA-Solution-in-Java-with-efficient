class Node 
{
	int data;
	Node next;
	public Node(int data){
		this.next=null;
		this.data=data;
	}
}
class CycleInLinkedListFloydAlgo 

{
	public static Node head;
		public static Node tail;
	public static boolean CycleFrom(){
		Node slow=head;
		Node fast=head;
		while (fast != null && fast .next != null)
		{
			slow=slow.next;// slow+1
			fast=fast.next.next; // fast +2
			if (slow==fast)
			{
				return true;// cycle formed 
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		 head=new Node(1);
				 head.next=new Node(2);
						 head.next.next=new Node(3);// 1->2->3->1 that  is cycle form 
								// head.next.next.next=head;
	System.out.println(CycleFrom());
	}
}
