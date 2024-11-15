import java.util.*;

class  DiametreAppoch2
{
	static class Node
	{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class Info
	{
		int diam;
		int ht;
		Info(int diam, int ht){
			this.diam=diam;
			this.ht=ht;
		}
	}
	public static Info diametre(Node root){
		if (root==null)
		{
			return new Info(0,0);
		}
		Info leftinfo=diametre(root.left);
		Info rightinfo=diametre(root.right);
		int selfnode=leftinfo.ht+rightinfo.ht;
		int dia=Math.max(selfnode,Math.max(leftinfo.diam,rightinfo.diam));
		int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
		return new Info(dia,ht);
	}
	public static void main(String[] args) 
	{
		Node root=new Node(1);
	    root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
				root.right.right.right=new Node(8);
		System.out.println("Diametre!"+diametre(root).diam);
		System.out.println("height!"+diametre(root).ht);
	}
}
