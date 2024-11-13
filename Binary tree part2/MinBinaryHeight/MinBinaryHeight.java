class MinBinaryHeight 
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node (int data){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	public static int MinDepth(Node root){
		if (root ==null)
		{
			return 0;
		}
		int ld=MinDepth(root.left);
		int rd=MinDepth(root.right);
		if (root.left==null)
		{
			return rd+1;
		}
		if (root.right==null)
		{
			return ld+1;
		}
		return Math.min(rd,ld)+1;
	}
	public static void main(String[] args) 
	{
		Node root=new Node(1);
	    root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(7);
		System.out.println(MinDepth(root));
	}
}
