class  LowestCommonAncestorApproch2
{
	static class Node
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
	public static Node lca (Node root , int n1, int n2){
		if (root==null)
		{ 
			return root;
		}
		if (root.data==n1 || root.data==n2)
		{
			return root;
		}
		Node leftlca=lca(root.left,n1,n2);
		Node rightlca=lca(root.right,n1, n2);
		if (leftlca==null)
		{
			return rightlca;
		}
		if (rightlca==null)
		{
			return leftlca;
		}
		return root;
	}
	public static void main(String[] args) 
	{
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
		System.out.println("Hello World!"+lca(root,4,5).data);
	}
}
