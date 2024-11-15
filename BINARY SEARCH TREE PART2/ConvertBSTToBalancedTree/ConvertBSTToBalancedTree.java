import java.util.*;
class ConvertBSTToBalancedTree 
{
	static class  Node 
	{
		int data;
		Node left;
		Node right;
		Node(int data){

			this.data=data;
			this.left=null;
			this.right=null;

		}
	}
	public static void getinorder(Node root, ArrayList<Integer> inorder){
		if (root==null)
		{
			return ;
		}
		getinorder(root.left,inorder);
		inorder.add(root.data);
		getinorder(root.right,inorder);
	}
	public static Node createBST(Node root, int si,int ei,ArrayList<Integer> inorder){
		if (si> ei)
		{
			return null;
		}
		int mid =(si+ei)/2;
		// Node create
		root=new Node(inorder.get(mid));
		root.left=createBST(root.left,si, mid-1,inorder);
		root.right=createBST(root.right,mid+1,ei,inorder);
		return root;
	}
	public static Node Isbalanced(Node root){
		// 1 inorder
		ArrayList<Integer> inorder= new ArrayList<>();
		getinorder(root,inorder);
		//inorder is array list is sorted
		root=createBST(root,0,inorder.size()-1,inorder);
		return root;

	}
	public static void preorder(Node root){
		if (root == null)
		{
			return ;
		}
		System.out.println(root.data+"  ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args) 
	{
		Node root=new Node(8);
		root.left=new Node(6);
		root.left.left=new Node(5);
		root.left.left.left=new Node(3);
		root.right=new Node(10);
		root.right.right=new Node(11);
		root.right.right.right=new Node(12);
		root=Isbalanced(root);
		preorder(root);
		System.out.println("Hello World!");
	}
}
