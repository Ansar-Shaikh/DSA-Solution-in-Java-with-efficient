class  HeightOfTree

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
	public static int DFS(Node root){
		if (root==null)
		{
			return 0;
		}
		int lh=DFS(root.left);
		int rh=DFS(root.right);
		return Math.max(rh,lh)+1;
	}
	public static int HeightOfTree(Node root){
		return DFS(root);
	}
	public static void main(String[] args) 
	{
		   Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
   root.right.right.right = new Node(8);
		System.out.println("HeightOfTree!"+HeightOfTree(root));
	}
}
