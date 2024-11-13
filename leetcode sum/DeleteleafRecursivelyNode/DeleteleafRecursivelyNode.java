class DeleteleafRecursivelyNode  
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
	public static Node DeleteLeaf(Node root, int target){
		if (root== null)
		{
			return null;
		}
		// recursively  root is become leaf so we need to point to it null how using following 
		root.left=DeleteLeaf(root.left,target);
		 root.right=DeleteLeaf(root.right, target);
		 // leaf node check krna isleye 
		 if (root.left== null && root.right== null)
		 {
			 if (root.data==target)
			 {
                 return null;// delete only points to null JVM of java JC automatically delete it 

			 }
			 else {
				 return root; // leaf node hai uski value target ke equal nhi hai
			 }
			
		 }
		 return root;
	}
	public static void inorder(Node root){
		if (root == null)
		{
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+"  ");
		inorder(root.right);
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
		System.out.println("Deleteleaf node !"+DeleteLeaf(root, 20).data);
		inorder(root);
	}
}
