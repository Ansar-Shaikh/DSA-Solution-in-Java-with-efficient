class  PrintIRange
{

	static class Node
	{
		int data;
		Node left;
		Node right;
		Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void printinrange(Node root,int k1 ,int k2){
		if (root==null)
		{
			return ;
		}
		// logic if range in between  node of k1 and k2 then it leftsubtree and rightsubtree
		if (k1<=root.data && root.data<=k2)
		{
			printinrange(root.left,k1 ,k2);
			System.out.print(root.data+ " ");
			printinrange(root.right, k1 , k2);
		}
		else if (root.data>k2)
		{
			printinrange(root.right, k1, k2);// rightside mai rightsubtree larger data
		}
		else {
			printinrange(root.left,k1 , k2);
		}
	}
	public static void main(String[] args) 
	{
			  Node root=new Node(8);
			 root.left=new Node(5);
			 root.right=new Node(10);
			 root.left.left=new Node(3);
			 root.left.right=new Node(6);
			 root.right.left=new Node(11);
			 printinrange(root,8,11);

		System.out.println("Hello World!");
	}
}
