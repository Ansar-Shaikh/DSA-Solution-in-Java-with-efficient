class  DeleteBST 
{
	static class Node
	{
		int data;
		Node  left;
		Node right;
		Node(int data){

			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node delete(Node root,int val){
		    if (root == null) { // Added null check
            return null;
        }
		if (root.data>val)

		{
			root.left=delete(root.left,val);
		}
		else if (root.data<val)
		{
			root.right=delete(root.right, val);
		}
		else {
			// root.data==val (jo hmee deletekrna  hai case
			//caseb 1:leaf node
			if (root.left==null && root.right==null)
			{
				return null; // parent node directly null kro 
			}
			// case 2:single node
			if (root.left==null)
			{
				return root.right;
			}
			else if (root.right==null)
			{
				return root.left;
			}
			// case 3): two children
			    //case a:inorder
				Node is=FindInorderSuccessor(root.right);//FindInorderSuccessor oo left  mosr of right subtree 
				// case b:replace by inorder
				root.data=is.data;
				root.right=delete(root.right,is.data);
		}
		return root;
	}
	public static Node FindInorderSuccessor(Node root){
		while (root.left!= null)
		{
			root=root.left;
		}
		return root;
	}
	public static void inorder(Node root){
		if (root== null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
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
			 inorder(root);
			 System.out.println();
		System.out.println(" After delete ");
		  root=delete(root,10);
		  inorder(root);
	}
}
