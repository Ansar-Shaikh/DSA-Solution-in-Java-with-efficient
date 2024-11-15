class  SumOfNodes
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
	static int total=0;
	public  static void dfs(Node root ){
		if (root==null)
		{
			return ;
		}
		total+=root.data;
		dfs(root.left);
		dfs(root.right);

		
	} 
	public  static int SumOfNodes(Node root){
		total=0;
		dfs(root);
		return total;
	} 
	public static void main(String[] args) 
	{
		   Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
		System.out.println(SumOfNodes(root));
	}
}
