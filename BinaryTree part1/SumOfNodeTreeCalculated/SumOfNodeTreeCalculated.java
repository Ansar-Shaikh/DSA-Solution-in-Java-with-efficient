 import java.util.*;
 class  SumOfNodeTreeCalculated 
{
	static class Node
	{
		int data;
		Node right;
		Node left;
		Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;

		}
	}
	public static int SumNode(Node root){
		if (root ==null)
		{
			return 0;
		}
		int lsum=SumNode(root.left);
		int Rsum=SumNode(root.right);
		int SumOftree=lsum+Rsum+root.data;
		return SumOftree;
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
		root.left.left.left=new Node(8);
		root.left.left.right=new Node(4);
		System.out.println("sumof nodes of tree :!"+SumNode(root));
	}
}
 

