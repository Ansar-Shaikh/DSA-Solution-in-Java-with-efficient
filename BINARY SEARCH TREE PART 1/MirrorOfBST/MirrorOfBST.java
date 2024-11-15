class  MirrorOfBST
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
	public static Node createmirror(Node root){
		if (root== null)
		{
			return null;
		}
		Node leftmirror=createmirror(root.left);
		Node rightmirror=createmirror(root.right);
		// swaping of pointer
		root.left=rightmirror;
		root.right=leftmirror;
		return root;
	}
	public static void preorder(Node root){
		if (root== null)
		{
			return ;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args) 
	{
					  Node root=new Node(4);
			 root.left=new Node(2);
			 root.right=new Node(7);
			 root.left.left=new Node(1);
			 root.left.right=new Node(3);
			 root.right.left=new Node(6);
			 root.right.right=new Node(9);
			 preorder(root);
			 System.out.println();
			 root=createmirror(root);

			 preorder(root);
		System.out.println("Hello World!");
	}
}
