class Node
{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
class  deleteNthFromEnd  
{
	public Node head;
		public Node tail;
	public void addFirst(int data){
		Node newnode=new Node(data);
		if (head==null)
		{

            head=tail=newnode;
			return ;
		}
		newnode.next=head;
		head=newnode;
	}
	public void addLast(int data){
		Node newnode=new Node(data);
		if (head==null)
		{
			head=tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
	}
	public void printnode(){
		Node temp=head;// head ko update nhi kr shkta  
		while (temp != null)
		{
			System.out.print(temp.data+"==>");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void reverse(){
		Node prev=null;
		Node curr=head;
		Node next;
		while (curr != null)
		{
			// four steps
			 next=curr.next; // naming to current next to next pointer
			 curr.next=prev;// like backtracking / points to back side node 
			 prev=curr;// update the  two pointer
			 curr=next;

		}
		head=prev;
	}
	public void deleteNthFromEnd(int n){
		// calculating size
		int sz=0;
		Node temp =head;
		while (temp != null)
		{
			temp=temp.next;
			sz++;
		}
		if (n==sz)
		{
			head=head.next;
			return ;
		}
		int i=1;
		int tofindEnd=sz-n;
		Node prev=head;
		while (i<tofindEnd)
		{
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return ;

	}

	public static void main(String[] args) 
	{
		deleteNthFromEnd 
			ll=new deleteNthFromEnd
			();
		ll.addLast(10);
		ll.addFirst(90);
		ll.addFirst(100);
		ll.addFirst(60);
		ll.addFirst(50);
		ll.addLast(40);
		
				System.out.println(" before reversing linked list");
		ll.printnode();
		ll.reverse();
				System.out.println("after reversing linked list");
			ll.printnode();
	ll.deleteNthFromEnd(3);
	ll.printnode();
	}
}
