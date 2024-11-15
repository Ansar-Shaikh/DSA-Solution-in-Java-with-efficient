import java.util.*;
class  Root2TOLeaf
{

	static class Node
	{
		int data;
		Node left;
		 Node  right;
		 Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;

		 }
	}
	public static void printroot2leaf(Node root, ArrayList<Integer>path){
		if (root==null)
		{
			return ;
		}
		// case1 add root node first
		path.add(root.data);
		if (root.left==null &&  root.right== null)
		{
			printnode(path);
		}
		printroot2leaf(root.left, path);
		printroot2leaf(root.right,path);
		// last ele ko delete kro 
		path.remove(path.size()-1);// backtracking towards root node 
	}
	public static  void printnode(ArrayList<Integer>path){
		for (int i=0;i<path.size() ; i++)
		{
			System.out.print(path.get(i)+" ==> "  );
		}
		System.out.println(" null");
	}
	public static void inorder(Node root){
		if (root== null)
		{
			return;	
		}
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	public static void main(String[] args) 
	{
					  Node root=new Node(8);
			 root.left=new Node(5);
			 root.right=new Node(10);
			 root.left.left=new Node(3);
			 root.left.right=new Node(6);
			 root.right.left=new Node(11);
			 ArrayList<Integer> path= new ArrayList<>();
			 inorder(root);
			 System.out.println("leaf path only : ");
			 printroot2leaf(root,path);
		System.out.println("Hello World!");
	}
}
