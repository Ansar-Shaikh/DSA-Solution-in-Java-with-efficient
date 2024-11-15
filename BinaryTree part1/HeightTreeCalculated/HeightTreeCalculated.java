class HeightTreeCalculated 
{

	static class Node
	{
		int data;
		Node right;
		Node left;
		Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;

		}
	}
	public static int heighttree(Node root){
		if (root ==null)
		{
			return 0;
		}
		int lh=heighttree(root.left);
		int Rh=heighttree(root.right);
		int heigth=Math.max(lh,Rh)+1;
		return heigth;
	}
	public static void main(String[] args) 
	{
		Node root=new Node(1);
	    root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.println("height of tree :!"+heighttree(root));
	}
}
