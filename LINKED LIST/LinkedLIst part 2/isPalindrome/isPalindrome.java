class Node
{
	int data;
	Node next;
	public Node(int data){
		this.next=null;

		this.data=data;
	}
}

class isPalindrome 
{
	public static Node head;
	public static Node tail;
	public Node getmid(Node head){
		 Node slow=head;
		 Node fast=head;
		 while (fast != null && fast.next != null)
		 {
			 slow=slow.next ;// +1;
			 fast=fast.next.next;//+2
		 }
		 return slow;
	}
    public boolean  isPalindrome(){
		// base case
		if (head ==null || head.next ==null)
		{
			return true;
		}
		//  step :1 find mid 
		Node mid=getmid(head);
		// step2: reveser second half  using three variable and four steps
		Node prev=null;
		Node curr=mid;
		Node next;
		while (curr != null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		// step 3: check left and right 
		Node  right=prev; // head last 
		Node left=head;
		while (right != null)
		{
			if (left.data != right.data)
			{
				return false;
			}
			left=left.next;
			right=right.next;
		}

         return true;
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
           isPalindrome ll=new isPalindrome();
		   ll.head=new Node(2);
		   ll.head.next=new Node(1);
		   ll.head.next.next=new Node(1);
		   ll.head.next.next.next=new Node(2);
		   ll.printnode();
		System.out.println(ll.isPalindrome());
	}
}
