class  ValidBST
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
	public static boolean isValidBST(Node root,Node min , Node max){
		if (root == null)
		{
			return true;// root is not 
		}
		if (min != null && root.data<=min.data)
		{
			return false;
		}
		else if (max != null && root.data >= max.data)
		{
			return false ;
		}
			//both condition statisfy huaa to 
			//leftsubtree  == min (any be)
			                           //== max(be only   root)
		//rightsubtree  == min (only root)
			                           //== max(be  any value)

     return isValidBST(root.left,min , root) && isValidBST(root.right, root, max);		
	}
	public static void main(String[] args) 
	{
/* 5
   / \
  3   7
 / \ / \
2  4 6  8 
*/
					  Node root=new Node(5);
			 root.left=new Node(3);
			 root.right=new Node(7);
			 root.left.left=new Node(2);
			 root.left.right=new Node(4);
			 root.right.left=new Node(6);
			 root.right.right=new Node(8);
		System.out.println("isValidBST:::"+isValidBST(root, null, null));
	}
}
