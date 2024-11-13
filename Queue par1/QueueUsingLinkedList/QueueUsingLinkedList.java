import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class  QueueUsingLinkedList
{
	 static class Queue
	{
	public 	static Node head;
	public static Node tail;
	public static boolean isEmpty(){
		return head==null && tail == null;
	}
	public static void add(int data){
		Node newnode=new Node(data);
		if (head==null)
		{

			head=tail=newnode;
		}
		tail.next=newnode;
		tail=newnode;
	}
	public static int remove(){
		if (isEmpty())
		{
			System.out.println("is empty");
			return -1;
		}
		int front =head.data;
		// single node hoga to fhir
		if (head==tail)
		{
			head=tail=null;
		}
		else{
			head=head.next;
		}
		return front;
	}
	public static int peek(){
		if (isEmpty())
		{
			System.out.println("isemtpy it node:");
			return -1;
		}
		return head.data;
	}
	}
	public static void main(String[] args) 
	{
		    Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
	}
}
