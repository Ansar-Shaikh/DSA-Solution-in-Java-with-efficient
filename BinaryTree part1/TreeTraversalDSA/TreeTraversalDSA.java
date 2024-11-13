import java.util.*;
class TreeTraversalDSA 
{

	static class Node
	{
		int data ;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
			}
	}
	static class BinaryTree
	{
		static int idx=-1;
		public static Node buildtree(int nodes[]){
			idx++;
			if (nodes[idx]==-1)
			{
				return null;
			}
			// creating node than 
			Node newnode=new Node(nodes[idx]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			return newnode;
		}
		public static void preorder(Node root ){
			if (root == null)
			{
				return ;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
			public static void inorder(Node root ){
			if (root == null)
			{
				return ;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
			public static void postorder(Node root ){
			if (root == null)
			{
				return ;
			}

			postorder(root.left);
			postorder(root.right);
						System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) 
	{
                int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
				BinaryTree tree=new BinaryTree();
				Node root=tree.buildtree(nodes);
				System.out.println("preorder traversal :");
				tree.preorder(root);
				System.out.println();
					System.out.println("inorder traversal :");
				tree.inorder(root);
								System.out.println();
				System.out.println("postorder traversal :");
				tree.postorder(root);
	}
}
