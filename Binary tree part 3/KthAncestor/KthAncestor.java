class KthAncestor 
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
	public static int kthancestor(Node root , int n , int k){
		if (root==null)
		{
			return -1;
		}
		if (root.data==n)
		{
			return 0;// self distance
		}
		int ld=kthancestor(root.left,n,k);
		int rd=kthancestor(root.right,n,k);
		if (ld==-1 && rd==-1)
		{
			return -1;
		}
		int max=Math.max(ld,rd);
		if (max+1==k)
		{
			System.out.println(root.data);
		}
		return max+1;
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
		System.out.println("k th ancestor!"+kthancestor(root,5,2));
	}
}
