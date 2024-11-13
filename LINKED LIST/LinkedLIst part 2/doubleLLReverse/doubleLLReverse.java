class Node
{
	int data;
	Node next;
	Node prev;
	public Node(int data){
		this.next=null;
		this.data=data;
		this.prev=null;
	}
}
class  doubleLLReverse
{

	public static Node head;
	public static Node tail;
	public void doublereverse(){
		Node prev=null;
		Node curr=head;
		Node next;
		while (curr != null)
		{
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	 public  void  printnode(){
		Node temp=head;
		  while (temp !=null)
		  {
			  System.out.print(temp.data+"==>");
			  temp=temp.next;
		  }
		  System.out.println("null");
	  }
	public static void main(String[] args) 
	{
		  doubleLLReverse ll=new doubleLLReverse();
		   ll.head=new Node(2);
		   ll.head.next=new Node(11);
		   ll.head.next.next=new Node(1);
		   ll.head.next.next.next=new Node(28);
		   	  System.out.println("before doubley list reverse");
		   ll.printnode();
		   
		   ll.doublereverse();
		   System.out.println("after doubley list reverse");
				   ll.printnode();
		
	}
}
