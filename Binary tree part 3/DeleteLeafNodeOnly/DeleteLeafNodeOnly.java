class  DeleteLeafNodeOnly
{
	static class Node 

	{
		int data;
		Node right,left;
		Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node deleteleafonly(Node root ,int target){
		if (root== null)
		{
			return null;
		}
		deleteleafonly(root.left,target);
		deleteleafonly(root.right,target);
		// leaf node
		if (root.left== null && root.right== null)
		{
			 if (root.data== target)
			 {
				 return null;
			 }
			 else return root;
		}
		 return root;
	}
	public static void preorder(Node root){
		if (root == null)
		{
			return ;
		}
		System.out.print(root.data+"  ");
		preorder(root.left);
		
		preorder(root.right);
	}
	public static void main(String[] args) 
	{
		  Node root=new Node(4);
			 root.left=new Node(20);
			 root.right=new Node(70);
			 root.left.left=new Node(20);
			 root.left.right=new Node(20);
			 root.right.left=new Node(60);
			 root.right.right=new Node(20);
			  root.right.right.right=new Node(20);
		System.out.println("delete leaf only!"+deleteleafonly(root, 20).data);
		preorder(root);
	}
}
